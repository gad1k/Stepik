package sec_10_generics_basics.step_04;

class Box<T> {
    private T t;

    public void put(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }
}