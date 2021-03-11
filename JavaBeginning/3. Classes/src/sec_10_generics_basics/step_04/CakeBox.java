package sec_10_generics_basics.step_04;

class CakeBox {
    private Cake cake;

    public void put(Cake cake) {
        this.cake = cake;
    }

    public Cake get() {
        return this.cake;
    }
}