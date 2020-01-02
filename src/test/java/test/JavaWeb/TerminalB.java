package test.JavaWeb;

import java.io.IOException;
import java.net.*;

public class TerminalB {
    public static void main(String[] args){
        //发送数据
        try {
            String message="我是B，你好";
            InetAddress inetAddress = InetAddress.getByName("localhost");
            DatagramPacket datagramPacket = new DatagramPacket(message.getBytes(),message.getBytes().length,inetAddress,8181);
            DatagramSocket datagramSocket =new DatagramSocket(8080);
            datagramSocket.send(datagramPacket);

            //接收数据
            byte[] buff = new byte[1024];
            DatagramPacket datagramPacket2 = new DatagramPacket(buff,buff.length);
            datagramSocket.receive(datagramPacket2);
            String reply = new String(datagramPacket2.getData(),0,datagramPacket2.getData().length);
            System.out.println("我是B，接收到了"+datagramPacket2.getPort()+"返回的数据"+reply);
        } catch (UnknownHostException | SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
