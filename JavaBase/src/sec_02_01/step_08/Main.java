package sec_02_01.step_08;

public class Main {
    public static int leapYearCount(int year) {
        return year / 4 - year / 100 + year / 400;
    }
}