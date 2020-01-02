package test.JavaWeb.testWork;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Socket socket = null;
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;
        InputStream inputStream = null;
        DataInputStream dataInputStream = null;
        System.out.println("客户端已启动...");
        try {
            socket =  new Socket("localhost",8080);
            Scanner scanner = new Scanner(System.in);
            String message = null;
            while(true) {
                //写
                System.out.println("客户端:");
                message = scanner.next();
                outputStream = socket.getOutputStream();
                dataOutputStream = new DataOutputStream(outputStream);
                dataOutputStream.writeUTF(message);
                //读
                inputStream = socket.getInputStream();
                dataInputStream = new DataInputStream(inputStream);
                message = dataInputStream.readUTF();
                System.out.println("服务器："+message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                dataInputStream.close();
                dataOutputStream.close();
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
