package main.java.com.example.client;

import java.util.logging.Logger;

public class ClientSocketListenerImpl implements ServerSocketThreadListener {
    Logger logger = Logger.getLogger(ClientSocketListenerImpl.class.getName());

    @Override
    public void serverActed(String message) {
        logger.info("Client: " + message);
    }
}