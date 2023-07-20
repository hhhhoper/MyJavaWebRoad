import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example {
   public static void main(String[] args) throws Exception{
        //创建文件输入流对象读取指定目录下的文件
        FileInputStream in=new FileInputStream("/home/lqy/文档/MyJavaWebRoad/mytime/io流/1.字节流/文件拷贝/src.jpg");
        //创建文件输出流对象将读取到的文件内容写入到指定目录的文件中
        FileOutputStream out=new FileOutputStream("/home/lqy/文档/MyJavaWebRoad/mytime/io流/1.字节流/文件拷贝/dest.jpg");
        int len=0;
        //获取拷贝文件的时间
        long beginTime=System.currentTimeMillis();
        //通过循环将读取得到文件字节信息写入到新文件
        while((len=in.read())!=-1){
               out.write(len);
        }
        //获取拷贝后的时间
        long endTime=System.currentTimeMillis();
        //输出拷贝话费的时间
        System.out.println("花费时间为:"+(endTime-beginTime)+"毫秒");
        //关闭流
        in.close();
        out.close();
   }
}
