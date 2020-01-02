package test.JavaWeb;

import java.net.URI;
import java.net.URISyntaxException;

public class TestUrl {
    public static void main(String[] args){
        try {
            URI uri=new URI("http://localhost:8080/mytest.jsp");
            System.out.println(uri);
            System.out.println(uri.getHost());
            System.out.println(uri.getPath());
            System.out.println(uri.getPort());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

}
