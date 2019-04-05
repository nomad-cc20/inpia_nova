package net.nomad.inpia.cv02;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageSender {

    @Override
    public void sendMessage(String msg, String recipient) {
        System.out.println("Sending message \"" + msg + "\" to " + recipient + ".");
    }
}
