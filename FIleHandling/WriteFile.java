import java.io.*;
/*
 * In order to write data into a file, we will use the FileWriter class and its write() method together.
 * We need to close the stream using the close() method to retrieve the allocated resources.
 * 
 */
public class WriteFile {
    public static void main(String[] args) {
        try {
            // create FileWriter object
            FileWriter fwrite = new FileWriter("/home/devd/Desktop/LearnJava/FIleHandling/files/file1.txt");
            // writing the content into the File1.txt file  
            fwrite.write("Hello we're writing in this file.");
            System.out.println("File suceesfully written.");
            //close stream
            fwrite.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
