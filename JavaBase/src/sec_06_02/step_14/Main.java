package sec_06_02.step_14;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> first = new HashSet<>(set1);
        Set<T> second = new HashSet<>(set2);
        first.removeAll(set2);
        second.removeAll(set1);
        Set<T> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }
}