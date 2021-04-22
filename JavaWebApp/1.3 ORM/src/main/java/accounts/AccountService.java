package accounts;

import dbService.DBException;
import dbService.DBService;

public class AccountService {
    private final DBService dbService;

    public AccountService(DBService dbService) {
        this.dbService = dbService;
    }

    public void addNewUser(UserProfile userProfile) {
        try {
            dbService.addUser(userProfile.getLogin(), userProfile.getPass());
        } catch (DBException e) {
            e.printStackTrace();
        }
    }

    public boolean checkLoggedUser(UserProfile userProfile) {
        try {
            return dbService.checkExistsUser(userProfile.getLogin());
        } catch (DBException e) {
            e.printStackTrace();
        }
        return false;
    }
}