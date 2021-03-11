package sec_10_generics_basics.step_04;

class TartBox {
    private Tart tart;

    public void put(Tart tart) {
        this.tart = tart;
    }

    public Tart get() {
        return this.tart;
    }
}