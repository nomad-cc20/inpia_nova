package net.nomad.inpia.cv02;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {

    @Test(expected = IllegalArgumentException.class)
    public void processMessagesMsgEmptyTest() {
        Application app = new Application();
        app.sender = new EmailService();

        app.processMessages(null,"nomad");
    }

    @Test
    public void processMessagesMsgNonEmptyTest() {
        Application app = new Application();
        EmailServiceMock emailServiceMock = new EmailServiceMock();
        app.sender = emailServiceMock;

        app.processMessages("nazdar","nomad");
        assertEquals("Expect 1 call to emailSender.sendMessage(msg,recipient)",1,emailServiceMock.callCount);
    }

    private class EmailServiceMock extends EmailService{

        public int callCount = 0;

        @Override
        public void sendMessage(String msg, String recipient) {
            super.sendMessage(msg, recipient);
            callCount++;
        }
    }

}