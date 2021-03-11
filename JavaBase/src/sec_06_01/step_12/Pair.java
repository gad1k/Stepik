package sec_06_01.step_12;

import java.util.Objects;

public class Pair<F, S> {
    private F f;
    private S s;

    private Pair(F f, S s) {
        this.f = f;
        this.s = s;
    }

    public F getFirst() {
        return (F) this.f;
    }

    public S getSecond() {
        return (S) this.s;
    }

    @Override
    public boolean equals(Object obj) {
        Pair<F, S> pair = (Pair<F, S>) obj;
        return Objects.equals(this.f, pair.f) && Objects.equals(this.s, pair.s);
    }

    @Override
    public int hashCode() {
        int fHashCode = 0;
        int sHashCode = 0;
        if (this.f != null)
            fHashCode = f.hashCode();
        if (this.s != null)
            sHashCode = s.hashCode();
        return fHashCode + sHashCode;
    }

    public static <F, S> Pair<F, S> of(F f, S s) {
        return new Pair<>(f, s);
    }
}