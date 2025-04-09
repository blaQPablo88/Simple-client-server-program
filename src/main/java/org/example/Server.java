package org.example;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        // receives connection
        ServerSocket serversocket = new ServerSocket(4999);
        // accepts connection
        Socket socket = serversocket.accept();

        System.out.println("connection created.");
    }
}