package org.example;

import java.io.*;
import java.net.*;
import java.nio.Buffer;

public class Server {
    public static void main(String[] args) throws IOException {
        // receives connection
        ServerSocket serversocket = new ServerSocket(4999);
        // accepts connection
        Socket socket = serversocket.accept();

        System.out.println("connection created.");

        // receiving data
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        BufferedReader bf = new BufferedReader(isr);

        String str = bf.readLine();
        System.out.println("client: " + str);
    }
}