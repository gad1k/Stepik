package sec_04_03.step_09;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {
    public static final String AUSTIN_POWERS = "Austin Powers";

    private Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            if (mail.getFrom().equals(AUSTIN_POWERS) || mail.getTo().equals(AUSTIN_POWERS))
                logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                        new Object[] {mail.getFrom(), mail.getTo(), ((MailMessage) mail).getMessage()});
            else
                logger.log(Level.INFO, "Usual correspondence: from {0} to {1}",
                        new Object[] {mail.getFrom(), mail.getTo()});
        }
        return mail;
    }
}