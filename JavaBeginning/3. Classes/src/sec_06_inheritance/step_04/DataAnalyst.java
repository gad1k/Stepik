package sec_06_inheritance.step_04;

class DataAnalyst extends Employee {
    protected boolean isPhD;
    protected String[] mlMethods;

    public DataAnalyst(String name, String email, int experience, boolean isPhD, String[] mlMethods) {
        super(name, email, experience);
        this.isPhD = isPhD;
        this.mlMethods = mlMethods;
    }

    public boolean isPhD() {
        return isPhD;
    }

    public String[] getMethods() {
        return mlMethods;
    }
}