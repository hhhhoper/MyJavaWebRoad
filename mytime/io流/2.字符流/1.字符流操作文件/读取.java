import java.io.File;
import java.io.FileReader;

public class 读取 {
        public static void main(String[] args) throws Exception{
                   //创建FileReader对象，并指定需要读取的文件
                   FileReader fileReader=new FileReader(
"/home/lqy/文档/MyJavaWebRoad/mytime/io流/2.字符流/1.字符流操作文件/reader.txt");
                  int len=0;
                  //通过循环来判断是否读取到了文件末尾
                  while((len=fileReader.read())!=-1){
                            System.out.print((char)len);
                  }
                  fileReader.close();
        }
}
