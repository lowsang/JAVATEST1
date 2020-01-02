package test.JavaWeb;

import java.net.MalformedURLException;
import java.net.URL;

public class TestUrl2 {
    public static void main(String[] args){
        try {
            URL url=new URL("http","127.0.0.1",8080,"/login.jsp");
            System.out.println(url.getHost());
            System.out.println(url.getPath());
            System.out.println(url.getPort());
            System.out.println(url.getProtocol());
            System.out.println(url.getFile());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
