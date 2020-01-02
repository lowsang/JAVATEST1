package test.JavaWeb;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientRunnable implements Runnable {
    private int num;
    public ClientRunnable(int num){
        this.num=num;
    }
    @Override
    public void run() {
        Socket socket=null;
        OutputStream outputStream=null;
        DataOutputStream dataOutputStream=null;
        try {
            socket=new Socket("localhost",8080);
            String message="我是客户端"+this.num;
            outputStream=socket.getOutputStream();
            dataOutputStream=new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                dataOutputStream.close();
                outputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
