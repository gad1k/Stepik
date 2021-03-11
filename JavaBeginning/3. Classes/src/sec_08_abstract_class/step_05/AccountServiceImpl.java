package sec_08_abstract_class.step_05;

class AccountServiceImpl implements AccountService {
    public Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account account : accounts)
            if (account.getOwner().getId() == id)
                return account;
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        int count = 0;
        for (Account account : accounts)
            if (account.getBalance() > value)
                count++;
        return count;
    }
}