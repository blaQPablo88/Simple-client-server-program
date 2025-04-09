package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.security.Principal;

public class Client {
    public static void main(String[] args) throws IOException {
        // creating a TCP connection to a server
        Socket s = new Socket("localhost", 4999);

        // sending data tio client
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("Hey boyy");
        pr.flush();

        // receives data from server
        InputStreamReader isr = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(isr);

        String str = bf.readLine();
        System.out.println("server: " + str);

    }
}