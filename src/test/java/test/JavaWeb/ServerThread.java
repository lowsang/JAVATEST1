package test.JavaWeb;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread {
    public static void main(String[] args){
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("服务器已启动.......");
            while(true){
                Socket socket = serverSocket.accept();
                ServerRunnable serverRunnable=new ServerRunnable(socket);
                Thread thread=new Thread(serverRunnable);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
