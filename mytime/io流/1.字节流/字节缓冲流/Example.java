import java.io.*;
public class Example {
    public static void main(String[] args)throws Exception{
         //创建用于输入和输出的字节缓冲流对象
         BufferedInputStream bis=new BufferedInputStream(
                   new FileInputStream("/home/lqy/文档/MyJavaWebRoad/mytime/io流/1.字节流/字节缓冲流/src.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(
"/home/lqy/文档/MyJavaWebRoad/mytime/io流/1.字节流/字节缓冲流/dest.jpg"));
                   int len=0;
                   long beginTime=System.currentTimeMillis();
                   while((len=bis.read())!=-1){
                             bos.write(len);
                   }
                   long endTime=System.currentTimeMillis();
                   System.out.println("花费:"+(endTime-beginTime)+"毫秒");
                    bis.close();
                    bos.close();
}
}