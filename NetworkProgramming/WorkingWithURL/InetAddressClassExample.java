import java.net.*;
public class InetAddressClassExample {
    /*
     * InetAddress class represents IP address both IPV4/IPV6. 
     * The java.net.InetAddress class provides method to get ip address of hostname;
     * getByName() returns the instance of InetAddress containing LocalHost IP & name;
     * getHostName(), getHostAddress() - returns hostname & ip address in string format respectively.
     */
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("Host : "+ ip.getHostName() + ", IP : "+ ip.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
