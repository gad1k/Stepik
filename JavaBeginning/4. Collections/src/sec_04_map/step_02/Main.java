package sec_04_map.step_02;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Omega", 24);
        map.put("Alpha", 1);
        map.put("Gamma", 3);
        System.out.println(map);
    }
}