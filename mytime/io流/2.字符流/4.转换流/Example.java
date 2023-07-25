import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

public class Example {
   public static void main(String[] args) throws Exception{
        //1.创建字节输入流对象，获取源文件
        FileInputStream in=new FileInputStream("reader.txt");
        //将字节输入流对象转换成字符输入流对象
        InputStreamReader isr=new InputStreamReader(in);
        //创建字符输入缓冲流对象
        BufferedReader br=new BufferedReader(isr);
        //2.创建字节输出流对象装换成字符输出流对象
        FileOutputStream out=new FileOutputStream("writer.txt");
        //将字节输出流对象转换成字符输出流对象
        OutputStreamWriter osw=new OutputStreamWriter(out);
        //创建字符输出流对象
        BufferedWriter bw=new BufferedWriter(osw);
        String line=null;
        //通过循环判断是否读到文件末尾
        while((line=br.readLine())!=null){
                   //输出读取到的文件
                   bw.write(line);
                   bw.newLine();
        }
        //关闭流
        br.close();
        bw.close();

   }
}
