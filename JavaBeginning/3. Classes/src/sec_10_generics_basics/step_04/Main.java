package sec_10_generics_basics.step_04;

public class Main {
    public static void main(String[] args) {
        Box<Cake> cake = new Box<>();
        System.out.println(cake.get());
    }
}