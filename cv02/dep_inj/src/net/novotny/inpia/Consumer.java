package net.novotny.inpia;

public interface Consumer {

    void processMessages(String msg, String recipient);
}
