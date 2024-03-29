package 网络编程.UDP通信;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//发送程序
public class _3UDPSender {
    public static void main(String[] args)throws Exception {
          //定义一个指定端口号为3000的发送端DatagramSocket对象
          DatagramSocket client=new DatagramSocket(3000);
          //定义要发送的数据
          String str="hello_world";
          //定义一个DatagramPacket数据报对象，封装发送端信息以及发送地址
          DatagramPacket packet=new DatagramPacket(str.getBytes(), str.getBytes().length,InetAddress.getByName("localhost"),8000);
          System.out.println("开始发送信息...");
          client.send(packet);        //发送数据
          client.close();             //释放资源
    }
}
