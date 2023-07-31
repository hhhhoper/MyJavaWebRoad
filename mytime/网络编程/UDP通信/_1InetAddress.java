package 网络编程.UDP通信;

import java.net.InetAddress;

public class _1InetAddress {
    public static void main(String[] args) throws Exception{
        //获取本机的InetAddress对象
        InetAddress locAddress=InetAddress.getLocalHost();
        //获取主机名"www.itcast.cn"的InetAddress对象
        InetAddress remoAddress=InetAddress.getByName("www.itcast.cn");
        System.out.println("本机的IP地址:"+
        locAddress.getHostAddress());
        System.out.println("itcast的IP地址:"+remoAddress.getHostAddress());
        System.out.println("3秒内是否可以访问:"+remoAddress.isReachable(3000));
        System.out.println("itcast的主机名为:"+remoAddress.getHostName());

    }
}
