package sec_05_02.step_09;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int prevNum, curNum = System.in.read();
        while (curNum != -1 ) {
            prevNum = curNum;
            curNum = System.in.read();
            if (!(prevNum == 13 && curNum == 10))
                System.out.write(prevNum);
        }
        System.out.flush();
    }
}