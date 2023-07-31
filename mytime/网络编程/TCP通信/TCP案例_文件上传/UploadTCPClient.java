package 网络编程.TCP通信.TCP案例_文件上传;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class UploadTCPClient {
    public static void main(String[] args) throws Exception{
             //创建一个Socket并连接到指定的服务器端
             Socket client=new Socket(InetAddress.getLocalHost(),10001);
             //1.客户端向服务器端上传文件
             OutputStream out=client.getOutputStream();
             FileInputStream fis=new FileInputStream("/home/lqy/文档/MyJavaWebRoad/mytime/网络编程/TCP通信/TCP案例_文件上传/src.jpg");
             byte[]buf=new byte[1024];
             int len=0;
             System.out.println("连接到服务器端，开始文件上传!");
             while((len=fis.read(buf))!=-1){
                     out.write(buf,0,len);
             }
             //整个图片上传完成后，要及时关闭客户端输出流
             client.shutdownOutput();
             //2.客户端接收服务器端的响应信息
             InputStream is=client.getInputStream();
             byte[]bufMsg=new byte[1024];
            int len2;
             while((len2=is.read(bufMsg))!=-1){
                   System.out.println(new String(bufMsg,0,len2));
                   len2=is.read(bufMsg);
             }
             //关闭流和Socket连接
             out.close();
             is.close();
             fis.close();
             client.close();
    }
}
