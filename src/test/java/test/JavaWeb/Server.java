package test.JavaWeb;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        ServerSocket serverSocket = null;
        Socket socket = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        //DataInputStream继承至FileInputStream的，专门用来传输二进制数据，类似于字节流
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("=========服务端==========");
            while(true)
            {
                socket = serverSocket.accept();

                inputStream = socket.getInputStream();
                dataInputStream = new DataInputStream(inputStream);
                //readUTF()是可以读取中文的
                String request = dataInputStream.readUTF();
                System.out.println("接收到了客户端请求："+request);

                outputStream = socket.getOutputStream();
                dataOutputStream = new DataOutputStream(outputStream);
                String response = "hello world";
                dataOutputStream.writeUTF(response);
                System.out.println("给客户端作出响应："+response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                dataInputStream.close();
                dataOutputStream.close();
                outputStream.close();
                inputStream.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
