package test.JavaWeb;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class MyServerThread extends Thread{
    private Socket socket;
    public MyServerThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        InputStream inputStream=null;
        DataInputStream dataInputStream=null;
        try {
            inputStream=this.socket.getInputStream();
            dataInputStream=new DataInputStream(inputStream);
            String message=dataInputStream.readUTF();
            System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                dataInputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
