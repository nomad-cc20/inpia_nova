package net.novotny.inpia;

public class Main {
    public static void main(String[] args) {
        Application application = (Application) MessageServiceInjector.getConsumer();
        application.processMessages("Hello", "Zdenek");
    }
}
