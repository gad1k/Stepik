package sec_04_03.step_09;

public class UntrustworthyMailWorker implements MailService {
    private RealMailService realMailService;
    private MailService[] anotherServices;

    public UntrustworthyMailWorker(MailService[] anotherServices) {
        this.anotherServices = anotherServices;
        this.realMailService = new RealMailService();
    }

    public Sendable processMail(Sendable mail) {
        Sendable mailLocal = mail;
        for (MailService anotherService : anotherServices)
            mailLocal = anotherService.processMail(mailLocal);
        realMailService.processMail(mailLocal);
        return mail;
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }
}