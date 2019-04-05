package net.novotny.inpia;

public class Application implements Consumer {
    private EmailService emailService;

    public Application(EmailService emailService) {
        this.emailService = emailService;
    }

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.sendEmail("Hello", "Zdenek");
    }

    public void processMessages(String msg, String recipient) {
        emailService.sendEmail(msg, recipient);
    }
}
