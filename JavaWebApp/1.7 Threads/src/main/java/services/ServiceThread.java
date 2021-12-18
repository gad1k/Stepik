package services;

import java.io.*;
import java.net.Socket;

public class ServiceThread extends Thread {
    private Socket socketOfServer;

    public ServiceThread(Socket socketOfServer) {
        this.socketOfServer = socketOfServer;
    }

    @Override
    public void run() {
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));
            BufferedWriter os = new BufferedWriter(new OutputStreamWriter(socketOfServer.getOutputStream()));

            while (true) {
                String line = is.readLine();

                if (line.equals("Bue."))
                    break;

                os.write(line);
                os.newLine();
                os.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}