package net.novotny.inpia;

public class MessageServiceInjector {

    public static Consumer getConsumer() {
        return new Application(new EmailService());
    }
}
