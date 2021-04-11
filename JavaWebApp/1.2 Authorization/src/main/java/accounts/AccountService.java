package accounts;

import java.util.HashSet;
import java.util.Set;

public class AccountService {
    private final Set<UserProfile> loggedUsers;

    public AccountService() {
        loggedUsers = new HashSet<>();
    }

    public void addNewUser(UserProfile userProfile) {
        loggedUsers.add(userProfile);
    }

    public boolean checkLoggedUser(String login, String pass) {
        return loggedUsers.contains(new UserProfile(login, pass));
    }
}