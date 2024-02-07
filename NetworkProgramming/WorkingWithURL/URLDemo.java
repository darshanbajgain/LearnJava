import java.net.URL;

 public class URLDemo {
    //URL class represents the URL and has certain methods: getHost(), getProtocol(), getFile(), getPort();

   public static void main(String[] args) {
   try {
     //URL class object can be used to represent URL in java
     URL myUrl = new URL("https://darshanbajgain.github.io//assets/darshanbajgainCV.pdf");
     System.out.println("HostName: "+ myUrl.getHost());
     System.out.println("ProtocolName: "+ myUrl.getProtocol());
     System.out.println("FileName: "+ myUrl.getFile());
     System.out.println("PortNo: "+ myUrl.getPort());

   } catch (Exception e) {
        e.printStackTrace();
   }
   }
 }