import java.io.*;
public class 字节流读文件 {
        public static void main(String[] args) throws Exception{
                   //创建一个文件字节输入流来读取文件
                   FileInputStream in=new FileInputStream("/home/lqy/文档/MyJavaWebRoad/mytime/io流/1.字节流/字节流文件读取/test.txt");
                   int b=0;
                   //通过循环来读取文件,当返回值为-1结束循环
                   while((b=in.read())!=-1){
                        System.out.println(b);
                   }
                   //关闭流
                   in.close();
        }           
}
