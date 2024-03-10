import java.io.*;
public class DeleteFIle {
    public static void main(String[] args) {
        try {
            File f = new File("../FIleHandling/files/file2.txt");
            if( f.delete()){
                System.out.println("File "+ f.getName()+ " is deleted.");
            }
            else {
                System.out.println("file doesn't exist");
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
