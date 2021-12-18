package main;

import services.ServiceThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

        try (ServerSocket listener = new ServerSocket(5050)) {
            java.util.logging.Logger.getGlobal().info("Server started");
            while (true) {
                Socket socketOfServer = listener.accept();
                new ServiceThread(socketOfServer).start();
            }
        }
    }
}