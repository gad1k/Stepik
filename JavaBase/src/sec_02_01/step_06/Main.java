package sec_02_01.step_06;

public class Main {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int cnt = 0;
        if (a) cnt++;
        if (b) cnt++;
        if (c) cnt++;
        if (d) cnt++;
        return cnt == 2;
    }
}