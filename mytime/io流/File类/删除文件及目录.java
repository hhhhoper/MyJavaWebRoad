
import java.io.*;
public class 删除文件及目录 {
    public static void main(String[] args) {
         File file=new File("/home/lqy/文档/awesome-free-chatgpt");
         deleteDir(file);
    }
    public static void deleteDir(File files){
          //获取File对象中的所有文件,并赋给数组
          File[] listFiles=files.listFiles();
          //循环遍历数组
          for(File file:listFiles){
                   //如果目录文件,则递归调用删除方法
                   if(files.isDirectory()){
                         deleteDir(file);
                   }
                   //如果是文件，则删除
                   files.delete();
          }
          //删除文件夹内所有文件后，再删除文件夹
          files.delete();
    }
}
