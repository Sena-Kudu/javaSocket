package javaSocket;

import java.net.*;
import java.io.*;

public class JavaSocketServer {

    public static void main(String[] args) throws IOException {

        ServerSocket s = new ServerSocket(1254); //Port no hizmete acik

        Socket s1 = s.accept(); //Baglantiyi bekliyor

        OutputStream s1out = s1.getOutputStream();

        DataOutputStream dos = new DataOutputStream(s1out);

        dos.writeUTF("Socket programlamaya hoşgeldiniz : ");

        dos.close();
        s1out.close();

    }
}
