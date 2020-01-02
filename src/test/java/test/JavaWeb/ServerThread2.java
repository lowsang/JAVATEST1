package test.JavaWeb;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread2 {
    public static void main(String[] args){
        ServerSocket serverSocket=null;
        try {
            serverSocket =new ServerSocket(9090);
            System.out.println("----------服务器启动----------");
            while(true){
                Socket socket = serverSocket.accept();
                MyServerThread myServerThread=new MyServerThread(socket);
                myServerThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
