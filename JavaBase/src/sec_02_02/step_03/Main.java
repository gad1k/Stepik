package sec_02_02.step_03;

public class Main {
    public static char charExpression(int a) {
        int value = (int) '\\' + a;
        return (char) value;
    }
}