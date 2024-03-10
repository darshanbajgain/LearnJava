import java.io.*;

public class ReadFIle {
    public static void main(String[] args) {
        try {
            File f= new File("/home/devd/Desktop/LearnJava/FIleHandling/files/file1.txt");
            
            FileReader fread = new FileReader(f);
            String line;
            BufferedReader read = new BufferedReader(fread);
            System.out.println("Printing by reading data from file ");
            while ((line = read.readLine()) != null) {
                System.out.println(line);
            }
            read.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
