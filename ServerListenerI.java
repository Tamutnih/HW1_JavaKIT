package main.java.com.example.client;

import org.example.server.ServerListener;

public class ServerListenerI implements ServerListener {
    @Override
    public void receiveMessage(String message) {
        System.out.println("Message: " + message);
    }
}