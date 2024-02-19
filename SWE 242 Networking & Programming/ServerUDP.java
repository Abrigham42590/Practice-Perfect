import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServerUDP {

    private static Socket socket = null;
    private static ServerSocket server = null;
    private static DataInputStream in = null;
    public static boolean filename = true;
    static final int port = 53;
    private static InetAddress ip;
    private static DatagramSocket ds;
    private static int clientport;
    public static ArrayList<String> filepathlist = new ArrayList<String>();
    public static List<File> largefiles = new ArrayList<File>();


    public static void main(String[] args) throws IOException {


        ds = new DatagramSocket(port);

        byte[] receive = new byte[65507];

        DatagramPacket dpreceive = null;

        dpreceive = new DatagramPacket(receive, receive.length);

        ds.receive(dpreceive);

        System.out.println("From Client: " + data(receive).toString());

        String filename = data(receive).toString();

        ip = dpreceive.getAddress();
        clientport = dpreceive.getPort();

        filereadrequest(filename);

    }

    public static void filereadrequest(String clientrequest) throws IOException {
        File[] files = {new File("C:\\Coding Assignments\\file1.txt"), new File("C:\\Coding Assignments\\file2.txt"), new File("C:\\Coding Assignments\\file3.txt")};

        Path path = Paths.get("C:\\Coding Assignments\\file1.txt");
        long size = Files.size(path);

        if(size >= 1000) {
            splitFile(files[0]);
        }


        File rename = new File("C:\\Coding Assignments\\file1.txt.001");
        File rename2 = new File("C:\\Coding Assignments\\file1.txt.002");
        File rename3 = new File("C:\\Coding Assignments\\file1.txt.003");

        largefiles.get(0).renameTo(rename);
        largefiles.get(1).renameTo(rename2);
        largefiles.get(2).renameTo(rename3);



        DatagramPacket dpsend;

        DatagramPacket dpsequencenumbersend;
        DatagramPacket dpsequencenumbersend2;
        DatagramPacket dpsequencenumbersend3;

        byte[] filebyte = null;
        String word = "ok";
        String word2 = "ok";
        String word3 = "ok";


        Scanner sc = new Scanner(System.in);

        String line;
        String line2;
        String line3;

        if(clientrequest.equals("get file1")) {

            //sequence numbers, created separate packets for each.
            int value = 1;

            int value2 = 2;

            int value3 = 3;

            byte[] buffer = ByteBuffer.allocate(Integer.BYTES).putInt(value).array();

            byte[] buffer2 = ByteBuffer.allocate(Integer.BYTES).putInt(value2).array();

            byte[] buffer3 = ByteBuffer.allocate(Integer.BYTES).putInt(value3).array();

            dpsequencenumbersend = new DatagramPacket(buffer, buffer.length, ip, clientport);

            dpsequencenumbersend2 = new DatagramPacket(buffer2, buffer.length, ip, clientport);

            dpsequencenumbersend3 = new DatagramPacket(buffer3, buffer.length, ip, clientport);

            ds.send(dpsequencenumbersend);

            ds.send(dpsequencenumbersend2);

            ds.send(dpsequencenumbersend3);



            byte[] buf = null;

            buf = word.getBytes();

            dpsend = new DatagramPacket(buf, buf.length, ip, clientport);

            ds.send(dpsend);




            try {
                BufferedReader inputStream = new BufferedReader(new FileReader(largefiles.get(0)));
                while ((line = inputStream.readLine()) != null) {


                    filebyte = line.getBytes();


                    //using sequence numbers from TCP in order to ensure reliability and keep track of each datapacket. ;

                    dpsend.setData(filebyte);


                    ds.send(dpsend);




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


            try {
                BufferedReader inputStream = new BufferedReader(new FileReader(largefiles.get(1)));




                while ((line = inputStream.readLine()) != null) {


                    filebyte = line.getBytes();


                    //using sequence numbers from TCP in order to ensure reliability and keep track of each datapacket. ;

                    dpsend.setData(filebyte);


                    ds.send(dpsend);




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


            try {
                BufferedReader inputStream = new BufferedReader(new FileReader(largefiles.get(2)));


                while ((line = inputStream.readLine()) != null) {


                    filebyte = line.getBytes();


                    //using sequence numbers from TCP in order to ensure reliability and keep track of each datapacket. ;

                    dpsend.setData(filebyte);


                    ds.send(dpsend);




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

        else if(clientrequest.equals("get file2")) {

            int value = 1;

            int value2 = 0;

            int value3 = 0;

            byte[] buffer = ByteBuffer.allocate(Integer.BYTES).putInt(value).array();

            byte[] buffer2 = ByteBuffer.allocate(Integer.BYTES).putInt(value2).array();

            byte[] buffer3 = ByteBuffer.allocate(Integer.BYTES).putInt(value3).array();

            dpsequencenumbersend = new DatagramPacket(buffer, buffer.length, ip, clientport);

            dpsequencenumbersend2 = new DatagramPacket(buffer2, buffer.length, ip, clientport);

            dpsequencenumbersend3 = new DatagramPacket(buffer3, buffer.length, ip, clientport);

            ds.send(dpsequencenumbersend);

            ds.send(dpsequencenumbersend2);

            ds.send(dpsequencenumbersend3);


            byte[] buf = null;

            buf = word2.getBytes();

            dpsend = new DatagramPacket(buf, buf.length, ip, clientport);

            ds.send(dpsend);


            try {
                BufferedReader inputStream = new BufferedReader(new FileReader(files[1]));
                while((line2 = inputStream.readLine()) != null) {


                    filebyte = line2.getBytes();

                    dpsend.setData(filebyte);

                    ds.send(dpsend);

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

        else if(clientrequest.equals("get file3")) {

            int value = 1;

            int value2 = 0;

            int value3 = 0;

            byte[] buffer = ByteBuffer.allocate(Integer.BYTES).putInt(value).array();

            byte[] buffer2 = ByteBuffer.allocate(Integer.BYTES).putInt(value2).array();

            byte[] buffer3 = ByteBuffer.allocate(Integer.BYTES).putInt(value3).array();

            dpsequencenumbersend = new DatagramPacket(buffer, buffer.length, ip, clientport);

            dpsequencenumbersend2 = new DatagramPacket(buffer2, buffer.length, ip, clientport);

            dpsequencenumbersend3 = new DatagramPacket(buffer3, buffer.length, ip, clientport);

            ds.send(dpsequencenumbersend);

            ds.send(dpsequencenumbersend2);

            ds.send(dpsequencenumbersend3);

            byte[] buf = null;

            buf = word3.getBytes();

            dpsend = new DatagramPacket(buf, buf.length, ip, clientport);

            ds.send(dpsend);



            try {
                BufferedReader inputStream = new BufferedReader(new FileReader(files[2]));
                while((line3 = inputStream.readLine()) != null) {


                    filebyte = line3.getBytes();

                    dpsend.setData(filebyte);

                    ds.send(dpsend);


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

        else if(clientrequest.equals("get large file")) {
            byte[] filebytes = null;
            ByteBuffer buffer = ByteBuffer.allocate(65000);

            File file = (new File("C:\\Coding Assignments\\file1.txt"));
            splitFile(file);

            for(int i = 0; i < largefiles.size(); i++) {
                buffer.putInt(i);





            }

            byte[] buf = null;

            buf = word3.getBytes();

            dpsend = new DatagramPacket(buf, buf.length, ip, clientport);

            ds.send(dpsend);



            File[] largefile = {(new File("C:\\Coding Assignments\\file1.txt.001"))};

            String lineforlargefile;

            BufferedReader inputstream = new BufferedReader(new FileReader(largefile[0]));

            while((lineforlargefile = inputstream.readLine()) != null) {

                filebytes = lineforlargefile.getBytes();

                dpsend.setData(filebytes);

                ds.send(dpsend);



            }

            if(inputstream != null) {
                try {
                    inputstream.close();
                }catch(Exception e) {
                    System.out.println(e);
                }
            }

        }


        else {


            int value = 0;

            int value2 = 0;

            int value3 = 0;

            byte[] buffer = ByteBuffer.allocate(Integer.BYTES).putInt(value).array();

            byte[] buffer2 = ByteBuffer.allocate(Integer.BYTES).putInt(value2).array();

            byte[] buffer3 = ByteBuffer.allocate(Integer.BYTES).putInt(value3).array();

            dpsequencenumbersend = new DatagramPacket(buffer, buffer.length, ip, clientport);

            dpsequencenumbersend2 = new DatagramPacket(buffer2, buffer.length, ip, clientport);

            dpsequencenumbersend3 = new DatagramPacket(buffer3, buffer.length, ip, clientport);

            ds.send(dpsequencenumbersend);

            ds.send(dpsequencenumbersend2);

            ds.send(dpsequencenumbersend3);
            String error = "Error";

            byte[] buf = null;

            buf = error.getBytes();

            dpsend = new DatagramPacket(buf, buf.length, ip, clientport);

            ds.send(dpsend);
        }

    }

    public static void splitFile(File file) throws IOException {

        byte[] filebytes = null;
        ByteBuffer buf = ByteBuffer.allocate(65000);

        DatagramPacket dpsend;
        int counter = 1;
        int sizeOfChunk = 512;
        String eof = System.lineSeparator();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String name = file.getName();
            String line = br.readLine();
            while (line != null) {
                File newFile = new File(file.getParent(), name + "."
                        + String.format("%03d", counter++));
                try (OutputStream out = new BufferedOutputStream(new FileOutputStream(newFile))) {
                    int fileSize = 0;
                    while (line != null) {
                        byte[] bytes = (line + eof).getBytes(Charset.defaultCharset());
                        if (fileSize + bytes.length > sizeOfChunk)
                            break;
                        out.write(bytes);
                        fileSize += bytes.length;
                        line = br.readLine();
                    }
                }
                largefiles.add(newFile);

            }






            //loop through array list for file size, adds each sequencenumber to the arraylist, then converts the number to a byte.
            //Then sends all the bytes over.




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