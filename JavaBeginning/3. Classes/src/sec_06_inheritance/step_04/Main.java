package sec_06_inheritance.step_04;

public class Main {
    public static void main(String[] args) {
        String[] skills = {"git", "Scala", "JBoss", "UML"};
        Developer developer = new Developer("Mary","mary@mail.com",3,"Java", skills);

        String[] mlMethods = {"neural networks", "decision tree", "bayesian algorithms"};
        DataAnalyst analyst = new DataAnalyst("John","john@gmail.com",2,true, mlMethods);
    }
}