import java.io.*;

public class GetFIleInfo {
    public static void main(String[] args) {

        try {
            // creatign file object
            File f = new File("/home/devd/Desktop/LearnJava/FIleHandling/files/file1.txt");

            if (f.exists()) {
                //geting filename
                System.out.println("Thefilename is : "+ f.getName());
                //get file path
                System.out.println("THe absoulute file path is : "+ f.getAbsolutePath());
                //check writable or not
                System.out.println("Is File Writable? : "+ f.canWrite());
                //check readbale 
                System.out.println("Is file readable? : " + f.canRead());
                //length o file in bytes
                System.out.println("The size of file in bytes is "+ f.length());
                System.out.println("Canonical path : " + f.getCanonicalPath());
            }
        } catch (Exception e) {
        }
    }
}
