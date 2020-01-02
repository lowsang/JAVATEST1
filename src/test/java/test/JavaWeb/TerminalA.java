package test.JavaWeb;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

public class TerminalA {
    public static void main(String[] args) {
        //接收数据
        byte[] buff=new byte[1024];
        DatagramPacket datagramPacket=new DatagramPacket(buff,buff.length);
        try {
            //DatagramSocket才是真正去接收连接的对象，DatagramPacket是从DatagramSocket对象中读取数据
            DatagramSocket datagramSocket=new DatagramSocket(8181);

            datagramSocket.receive(datagramPacket);
            String mess=new String(datagramPacket.getData(),0,datagramPacket.getLength());
            //System.out.println("我是A，接收到了"+mess);
            //获取到了传入方的客户端信息
            System.out.println("我是A，我接收到了"+datagramPacket.getPort()+"传来的数据"+mess);

            //发送数据
            String reply="我是A，已接到你发来的数据";
            //获取发送方的IP地址
            SocketAddress socketAddress=datagramPacket.getSocketAddress();
            //DatagramSocket负责连接，DatagramPacket负责读取数据
            DatagramPacket datagramPacket1=new DatagramPacket(reply.getBytes(),reply.getBytes().length,socketAddress);
            datagramSocket.send(datagramPacket1);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
