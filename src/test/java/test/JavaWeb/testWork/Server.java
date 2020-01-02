package test.JavaWeb.testWork;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        ServerSocket serverSocket=null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("服务端已启动");
            while(true){
                socket = serverSocket.accept();
                ServerThread serverThread = new ServerThread(socket);
                Thread thread = new Thread(serverThread);
                thread.start();
                //也可以用下面这一句代码来表示，简化上面三行代码
                //new Thread(new ServerThread(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
