package net.novotny.inpia;

public class EmailService {
    public void sendEmail(String msg, String recipient) {
        System.out.println("Sending message \"" + msg + "\" to " + recipient + ".");
    }
}
