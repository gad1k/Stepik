package sec_03_set.step_02;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("Gamma");
        set.add("Alpha");
        set.add("Omega");
        System.out.println(set);
    }
}