package sec_10_generics_basics.step_05;

import java.util.Objects;

class Pair<K, V> {
    K key;
    V value;

    private Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getFirst() {
        return key;
    }

    public V getSecond() {
        return value;
    }

    @Override
    public int hashCode() {
        int keyHashCode = 0;
        int valueHashCode = 0;
        if (this.key != null)
            keyHashCode = key.hashCode();
        if (this.value != null)
            valueHashCode = value.hashCode();
        return keyHashCode + valueHashCode;
    }

    @Override
    public boolean equals(Object obj) {
        Pair<K, V> pair = (Pair<K, V>) obj;
        return Objects.equals(this.key, pair.key) && Objects.equals(this.value, pair.value);
    }

    public static <K, V> Pair<K, V> of(K key, V value) {
        return new Pair<>(key, value);
    }
}