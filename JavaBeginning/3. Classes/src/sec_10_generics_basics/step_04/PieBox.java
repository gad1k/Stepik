package sec_10_generics_basics.step_04;

class PieBox {
    private Pie pie;

    public void put(Pie pie) {
        this.pie = pie;
    }

    public Pie get() {
        return this.pie;
    }
}