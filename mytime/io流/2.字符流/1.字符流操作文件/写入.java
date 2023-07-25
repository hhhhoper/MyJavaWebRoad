import java.io.*;
public class 写入 {
   public static void main(String[] args) throws Exception{
        //创建字符输出对象，并指定输出文件
        FileWriter fileWriter=new FileWriter("writer.txt",true);  //true追加
        //将定义的字符写入文件
        fileWriter.write("轻轻的我走了,\r\n");
        fileWriter.write("正如我轻轻的来;");
        fileWriter.close();
   }
}
