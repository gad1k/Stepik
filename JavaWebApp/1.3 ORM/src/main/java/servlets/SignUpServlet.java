package servlets;

import accounts.AccountService;
import accounts.UserProfile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignUpServlet extends HttpServlet {
    AccountService accountService;

    public SignUpServlet(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        resp.setContentType("text/html;charset=utf-8");

        if (login.equals("") || password.equals("")) {
            resp.getWriter().println("Invalid data");
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        if (accountService.checkLoggedUser(new UserProfile(login, password))) {
            resp.getWriter().println("This user is already logged in");
            resp.setStatus(HttpServletResponse.SC_CONFLICT);
        } else {
            accountService.addNewUser(new UserProfile(login, password));
            resp.setStatus(HttpServletResponse.SC_OK);
        }
    }
}