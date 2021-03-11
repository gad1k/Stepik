package sec_08_abstract_class.step_05;

public class Main {
    public static void main(String[] args) {
        Account[] accounts = {
                new Account(1, 150, new User(1, "Andrei", "Hryshechkin")),
                new Account(2, 250, new User(2, "Ruslan", "Hryshechkin"))
        };

        AccountService service = new AccountServiceImpl(accounts);

        System.out.println(service.findAccountByOwnerId(2));
        System.out.println(service.countAccountsWithBalanceGreaterThan(50));
    }
}