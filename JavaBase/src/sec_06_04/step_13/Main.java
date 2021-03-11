package sec_06_04.step_13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        reader.lines()
                .map(words -> words.toLowerCase().split("[^а-яА-Яa-zA-Z0-9]+"))
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(String::toString, TreeMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(10)
                .forEach((line) -> System.out.println(line.getKey()));
    }
}