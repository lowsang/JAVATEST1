package test.JavaWeb;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestWeb {
    public static void main(String[] args){
        try {
            InetAddress inetAddress=InetAddress.getLocalHost();
            System.out.println(inetAddress);
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());
            inetAddress=InetAddress.getByName("192.168.0.103");
            System.out.println(inetAddress);
            inetAddress=InetAddress.getByName("localhost");
            System.out.println(inetAddress);
            inetAddress=InetAddress.getByAddress(new byte[]{(byte) 196, (byte) 128, 0, 103});
            System.out.println(inetAddress);
            inetAddress=InetAddress.getByAddress("localhost",new byte[]{(byte) 196, (byte) 128, 0, 103});
            System.out.println(inetAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
