package sec_01_objects.step_04;

public class Application {
    String name;

    public Application(String name) {
        this.name = name;
    }

    public void run(String[] args) {
        System.out.println(name);
        for (String arg : args)
            System.out.println(arg);
    }
}