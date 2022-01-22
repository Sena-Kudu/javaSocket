package javaSocket;

import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;

public class JavaSocketClient {

    public static void main(String[] args) throws IOException {

        Socket s1 = new Socket("localhost", 1254); //Client tarafı baglantisi
        InputStream s1In = s1.getInputStream();
        DataInputStream dis = new DataInputStream(s1In);
        String st = new String(dis.readUTF());
        JOptionPane.showMessageDialog(null,"socket programming",st,JOptionPane.YES_NO_CANCEL_OPTION);

        dis.close();
        s1In.close();
        s1.close();
    }

}
