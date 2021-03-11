package sec_04_03.step_09;

public class Inspector  implements MailService {
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getContent().contains(WEAPONS) ||
                    ((MailPackage) mail).getContent().getContent().contains(BANNED_SUBSTANCE))
                throw new IllegalPackageException();
            if (((MailPackage) mail).getContent().getContent().contains("stones"))
                throw new StolenPackageException();
        }
        return mail;
    }
}