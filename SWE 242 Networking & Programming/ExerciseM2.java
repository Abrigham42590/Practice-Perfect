import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExerciseM2{
    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException {


        String filename1 = "file1";
        String filename2 = "file2";
        String filename3 = "file3";
        int count = 0;
        int count2 = 0;
        int count3 = 0;

        File[] files = {new File(args[0]), new File(args[1]), new File(args[2])};


        BufferedReader inputStream = null;
        String line;
        String line2;
        String line3;
        try {
            inputStream = new BufferedReader(new FileReader(files[0]));
            while ((line = inputStream.readLine()) != null) {

                if(files[0] != null) {
                    count++;
                }




            }
        }catch(IOException e) {
            System.out.println("file 1 does not exist");
        }

        try {
            inputStream = new BufferedReader(new FileReader(files[1]));
            while((line2 = inputStream.readLine()) != null) {
                if(files[1] != null) {
                    count2++;
                }
            }
        }catch(IOException e) {
            System.out.println("file 2 does not exist");
        }

        try {
            inputStream = new BufferedReader(new FileReader(files[2]));
            while((line3 = inputStream.readLine()) != null) {
                if(files[2] != null) {
                    count3++;
                }
            }
        }catch(IOException e) {
            System.out.println("file 3 does not exist");
        }



        System.out.println(filename1 + ": " + count);
        System.out.println(filename2 + ": " + count2);
        System.out.println(filename3 + ": " + count3);


    }
}