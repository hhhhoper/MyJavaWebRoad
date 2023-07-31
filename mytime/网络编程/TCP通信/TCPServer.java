package 网络编程.TCP通信;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception{
          //创建指定端口号为7788的服务端ServerSocket对象
          ServerSocket serverSocket=new ServerSocket(7788);
          while(true){
                   //调用ServerSocket的accept()方法开始接收数据
                   Socket client=serverSocket.accept();
                   System.out.println("客户端链接成功，开始进行数据交互");
                   //获取客户端的输出流对象
                   OutputStream os=client.getOutputStream();
                   //当客户端连接到服务端时，向客户端输出数据
                   os.write(("服务器端向客户端做出相应!").getBytes());
                   //模拟与客户端交互耗时
                   Thread.sleep(3000);
                   os.close();
                   client.close();
          }
    }
}
