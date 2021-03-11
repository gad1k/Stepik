package sec_05_04.step_08;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int countObjects = ois.readInt();
            Animal[] animals = new Animal[countObjects];
            for (int i = 0; i < animals.length; i++)
                animals[i] = (Animal) ois.readObject();
            return animals;
        } catch (ClassCastException | ClassNotFoundException | IOException e) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}