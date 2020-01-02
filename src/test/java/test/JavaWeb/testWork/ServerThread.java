package test.JavaWeb.testWork;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread implements Runnable {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        DataInputStream dataInputStream = null;
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;
        String message = null;
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                //读
                inputStream = this.socket.getInputStream();
                dataInputStream = new DataInputStream(inputStream);
                message = dataInputStream.readUTF();
                System.out.println("客户端：" + message);
                //写
                System.out.println("服务器：");
                outputStream = this.socket.getOutputStream();
                dataOutputStream = new DataOutputStream(outputStream);
                message = scanner.next();
                dataOutputStream.writeUTF(message);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
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
