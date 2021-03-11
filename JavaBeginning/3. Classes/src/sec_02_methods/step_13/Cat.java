package sec_02_methods.step_13;

class Cat {
    static int counter;

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;

        if (counter > 5)
            System.out.println("You have too many cats");
    }

    public static int getNumberOfCats() {
        return counter;
    }
}