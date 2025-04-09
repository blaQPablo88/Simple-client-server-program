package org.example;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        // creating a TCP connection to a server
        Socket s = new Socket("localhost", 4999);
    }
}