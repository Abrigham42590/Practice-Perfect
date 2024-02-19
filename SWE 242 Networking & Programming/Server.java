import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private static Socket socket = null;
    private static ServerSocket server = null;
    private static DataInputStream in = null;
    public static boolean filename = true;
    static final int port = 1080;

    public static void main(String[] args) {

        try {
            server = new ServerSocket(port);
            System.out.println("Server has started");

            System.out.println("Waiting for client....");

            socket = server.accept();
            System.out.println("Client accepted");

            in =  new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));

            String line = "";


            try {
                line = in.readUTF();
                System.out.println(line);
                filereadrequest(line);


            }catch(IOException e) {
                System.out.println(e);
            }



            System.out.println("Closing the connection...");
            socket.close();
            in.close();
        } catch(IOException e) {
            System.out.println(e);
        }

    }


    public static void filereadrequest(String clientrequest) throws IOException {
        File[] files = {new File("C:\\Coding Assignments\\file1.txt"), new File("C:\\Coding Assignments\\file2.txt"), new File("C:\\Coding Assignments\\file3.txt")};

        PrintWriter inputprint = new PrintWriter(socket.getOutputStream(), true);
        String word = "ok";
        String word2 = "Error";

        String line;
        String line2;
        String line3;

        if(clientrequest.equals("get file1")) {




            inputprint.println(word);


            try {
                BufferedReader inputStream = new BufferedReader(new FileReader(files[0]));
                while ((line = inputStream.readLine()) != null) {


                    inputprint.println(line);

                }
                if(inputStream != null) {
                    try {
                        inputStream.close();
                    }catch(Exception e) {
                        System.out.println(e);
                    }
                }


            }catch(IOException e) {
                String errorsentence = "Error: file 1 does not exist";
                inputprint.println(errorsentence);
            }



        }

        else if(clientrequest.equals("get file2")) {

            inputprint.println(word);

            try {
                BufferedReader inputStream = new BufferedReader(new FileReader(files[1]));
                while((line2 = inputStream.readLine()) != null) {

                    inputprint.println(line2);
                }

                if(inputStream != null) {
                    try {
                        inputStream.close();
                    }catch(Exception e) {
                        System.out.println(e);
                    }
                }


            }catch(IOException e) {

                String errorsentence = "Error: file 2 does not exist";
                inputprint.println(errorsentence);
            }

        }

        else if(clientrequest.equals("get file3")) {

            inputprint.println(word);


            try {
                BufferedReader inputStream = new BufferedReader(new FileReader(files[2]));
                while((line3 = inputStream.readLine()) != null) {

                    inputprint.println(line3);

                }

                if(inputStream != null) {
                    try {
                        inputStream.close();
                    }catch(Exception e) {
                        System.out.println(e);
                    }
                }

            }catch(IOException e) {
                String errorsentence = "Error: file 3 does not exist";
                inputprint.println(errorsentence);
            }

        }

        else {
            inputprint.println(word2);
        }

    }


}
