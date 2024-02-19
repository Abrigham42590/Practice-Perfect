import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedReader;

public class Client{

    private static Socket socket = null;
    private static BufferedReader input;
    private static DataOutputStream output = null;
    private static DataInputStream in = null;
    private static boolean value = true;
    static final int port = 1080;
    static final String address = "127.0.0.1";
    private static ArrayList<String> list1 = new ArrayList<String>();
    private static ArrayList<String> list2 = new ArrayList<String>();
    private static ArrayList<String> list3 = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            input = new BufferedReader(new InputStreamReader(System.in));

            output = new DataOutputStream(socket.getOutputStream());
        }
        catch(UnknownHostException u)
        {
            System.out.println(u);
        }

        catch(IOException i)
        {
            System.out.println(i);
        }



        String line = "";
        Scanner in = new Scanner(socket.getInputStream());
        String word;


        try {

            line = input.readLine();
            output.writeUTF(line);

        } catch(IOException i) {
            System.out.println(i);
        }

        word = in.nextLine();

        System.out.println(word);

        if(word.equals("ok")) {


            filecount(line);

            if(line.equals("get file1")) {

                for(int i = 0; i < list1.size(); i++) {
                    System.out.println(in.nextLine());
                }

            }

            else if(line.equals("get file2")) {

                for(int i = 0; i < list2.size(); i++) {
                    System.out.println(in.nextLine());
                }

            }

            else if(line.equals("get file3")) {
                for(int i = 0; i < list3.size(); i++) {
                    System.out.println(in.nextLine());
                }
            }
        }




        try {
            input.close();
            output.close();
            socket.close();
        }
        catch(IOException i)
        {
            System.out.println(i);

        }

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



}