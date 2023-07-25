import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Example {
        public static void main(String[] args) throws Exception{
             //创建一个字符输入缓冲流对象
             BufferedReader bufferedReader=new BufferedReader(new FileReader(
                   "reader.txt"));
             //创建一个字符输出缓冲流对象
             BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("writer.txt"));
             String str=null;
             //循环时每次读取一行文本，如果不为null(即到了文件末尾)，则继续循环
             while((str=bufferedReader.readLine())!=null){
                   //通过缓冲流对象写入文件
                   bufferedWriter.write(str);
                   //写入一个换行符
                   bufferedWriter.newLine();
             }
             bufferedReader.close();
             bufferedWriter.close();
        }           
}
