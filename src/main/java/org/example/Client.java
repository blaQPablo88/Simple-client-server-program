package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.security.Principal;

public class Client {
    public static void main(String[] args) throws IOException {
        // creating a TCP connection to a server
        Socket s = new Socket("localhost", 4999);

        // sending data
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("Hey boyy");
        pr.flush();
    }
}