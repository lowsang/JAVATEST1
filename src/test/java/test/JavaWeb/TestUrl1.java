package test.JavaWeb;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TestUrl1 {
    public static void main(String[] args){
        InputStream inputStream=null;
        Reader reader=null;
        BufferedReader bufferedReader=null;
        try {
            URL url=new URL("http","127.0.0.1",8080,"/login.jsp");
            inputStream=url.openStream();
            reader=new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(reader);
            String str=null;
            while((str=bufferedReader.readLine())!=null)
            {
                System.out.println(str);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                bufferedReader.close();
                reader.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
