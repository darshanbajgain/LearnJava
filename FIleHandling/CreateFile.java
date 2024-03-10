/*
 * creating  a new file - use createNewFile() method, it returns true when it sucessfully creates a new file and false
 * if file exists already.
 */

 //importing file class from java.io package
 import java.io.*;
 

 public class CreateFile {
    public static void main(String[] args) {
        try {
            // Creating file object  
            File filename = new File("/home/devd/Desktop/LearnJava/FIleHandling/files/file1.txt");
            
            if (filename.createNewFile()) {
                System.out.println(filename.getName()+" created successfully!");
            }
            else {
                System.out.println("File already exist");
            }
        }catch ( IOException e){
            System.err.println(e.getMessage());
        }
    }
    
 }