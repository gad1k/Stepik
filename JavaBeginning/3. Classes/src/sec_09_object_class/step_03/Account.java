package sec_09_object_class.step_03;

class Account {
    private long id;
    private String code;
    private Long balance;

    public Account(long id, String code, Long balance) {
        this.id = id;
        this.code = code;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{id=" + id + ", code='" + code + "', balance=" + balance + "}";
    }
}