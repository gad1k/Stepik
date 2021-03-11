package sec_06_02.step_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        List<String> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        while ((line = reader.readLine()) != null)
            list = Arrays.asList(line.split(" "));
        for (int i = list.size() - 1; i >= 0; i--)
            if (i % 2 != 0)
                result.append(list.get(i)).append(" ");
        System.out.println(result.toString().trim());
    }
}