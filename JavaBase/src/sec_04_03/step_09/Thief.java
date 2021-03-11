package sec_04_03.step_09;

public class Thief implements MailService {
    private int stolenValue;
    private int value;

    public Thief(int value) {
        this.value = value;
    }

    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getPrice() >= value) {
                stolenValue += ((MailPackage) mail).getContent().getPrice();
                Package newPackage = new Package("stones instead of " + ((MailPackage) mail).getContent().getContent(), 0);
                return new MailPackage(mail.getFrom(), mail.getTo(), newPackage);
            }
        }
        return mail;
    }

    public int getStolenValue() {
        return stolenValue;
    }
}