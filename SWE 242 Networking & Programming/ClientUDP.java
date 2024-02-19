import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ClientUDP {


    static final int port = 53;
    private static ArrayList<String> list1 = new ArrayList<String>();
    private static ArrayList<String> list2 = new ArrayList<String>();
    private static ArrayList<String> list3 = new ArrayList<String>();
    private static List<File> files = new ArrayList<File>();
    private static byte[] receive;

    public static void main(String[] args) throws IOException {
        receive = new byte[65507];

        Scanner sc = new Scanner(System.in);

        DatagramSocket ds = new DatagramSocket();

        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;

        String input = sc.nextLine();

        buf = input.getBytes();

        DatagramPacket dpsend = new DatagramPacket(buf, buf.length, ip, port);

        ds.send(dpsend);

        //created several different received packets in order to receive the different sequence numbers to ensure reliability.

        DatagramPacket dpreceive2 = null;

        DatagramPacket dpreceive3 = null;

        DatagramPacket dpreceive4 = null;

        DatagramPacket dpreceive = null;

        dpreceive2 = new DatagramPacket(receive, receive.length);

        dpreceive3 = new DatagramPacket(receive, receive.length);

        dpreceive4 = new DatagramPacket(receive, receive.length);

        dpreceive = new DatagramPacket(receive, receive.length);

        ds.receive(dpreceive2);

        ds.receive(dpreceive3);

        ds.receive(dpreceive4);

        ds.receive(dpreceive);


        System.out.println("From Server: " + data(receive).toString());

        String word = data(receive).toString();

        if(word.equals("ok")) {

            filecount(input);

            if(input.equals("get file1")) {

                System.out.println("small chunks receivied");

                for(int i = 0; i < list1.size(); i++) {
                    ds.receive(dpreceive);
                    System.out.println(new String(dpreceive.getData(), dpreceive.getOffset(), dpreceive.getLength()));

                }

            }





            else if(input.equals("get file2")) {
                for(int i = 0; i < list2.size(); i++) {
                    ds.receive(dpreceive);
                    System.out.println(new String(dpreceive.getData(), dpreceive.getOffset(), dpreceive.getLength()));
                }

            }



            else if(input.equals("get file3")) {
                for(int i = 0; i < list3.size(); i++) {
                    ds.receive(dpreceive);
                    System.out.println(new String(dpreceive.getData(), dpreceive.getOffset(), dpreceive.getLength()));
                }
            }


        }



        ds.close();


    }


    public static void filecount(String filename) throws IOException {
        File[] files = {new File("C:\\Coding Assignments\\file1.txt"), new File("C:\\Coding Assignments\\file2.txt"), new File("C:\\Coding Assignments\\file3.txt")};



        String line;
        String line2;
        String line3;

        if(filename.equals("get file1")) {



            try {
                BufferedReader inputStream = new BufferedReader(new FileReader(files[0]));
                while ((line = inputStream.readLine()) != null) {

                    list1.add(line);

                }
                if(inputStream != null) {
                    try {
                        inputStream.close();
                    }catch(Exception e) {
                        System.out.println(e);
                    }
                }


            }catch(IOException e) {
                System.out.println("Error: file 1 does not exist");
            }



        }

        else if(filename.equals("get file2")) {

            try {
                BufferedReader inputStream = new BufferedReader(new FileReader(files[1]));
                while((line2 = inputStream.readLine()) != null) {

                    list2.add(line2);

                }

                if(inputStream != null) {
                    try {
                        inputStream.close();
                    }catch(Exception e) {
                        System.out.println(e);
                    }
                }


            }catch(IOException e) {
                System.out.println("Error: file 2 does not exist");
            }

        }

        else if(filename.equals("get file3")) {


            try {
                BufferedReader inputStream = new BufferedReader(new FileReader(files[2]));
                while((line3 = inputStream.readLine()) != null) {

                    list3.add(line3);
                }

                if(inputStream != null) {
                    try {
                        inputStream.close();
                    }catch(Exception e) {
                        System.out.println(e);
                    }
                }

            }catch(IOException e) {
                System.out.println("Error: file 3 does not exist");
            }

        }

        else {
            System.out.println("Error");
        }

    }

    public static StringBuilder data(byte[] a) {
        if(a == null)
            return null;


        StringBuilder ret = new StringBuilder();
        int i = 0;
        while(a[i] != 0) {
            ret.append((char) a[i]);
            i++;
        }

        return ret;
    }
}