package com.kevin.learn.learn.netty4.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:BIO
 * @Author: Kevin
 * @Create 2019-10-08 14:50
 */
public class BioServer {
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        ServerSocket server = null;
        try {
            System.out.println("...");
            server = new ServerSocket(PORT);
            System.out.println("the time server is in port :" + PORT);
            Socket socket = null;
            while (true) {
                socket = server.accept();
                new Thread(new TimeServerHandler(socket)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                System.out.println("the time server close");
                server.close();
            }
        }
    }
}
