package 网络编程.TCP通信;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws Exception{
         //创建一个Socket并连接到指定服务器
         Socket client=new Socket(InetAddress.getLocalHost(),7788);
         //获取服务器端返回的输入流数据并打印
         InputStream is=client.getInputStream();
         byte[]buf=new byte[1024];
         int len=is.read(buf);
         while(len!=1){
              System.out.println(new String(buf,0,len)); 
         }
         //关闭流和Socket连接
         is.close();
         client.close();   //关闭Socket对象，释放资源
    }
}
