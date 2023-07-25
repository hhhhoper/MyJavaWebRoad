package io流.File类;
import java.io.*;
public class 遍历文件和目录 {
   public static void main(String[] args) {
       //创建File对象，并指定文件路径
       File file=new File("/home/lqy/文档/MyJavaWebRoad/mytime/");
       fileDir(file);
   }
   public static void fileDir(File file){
       //获取目录下所有文件，并赋值给数组
       File[] listFiles=file.listFiles();
       //循环遍历数组
       for(File files:listFiles){
                   System.out.println(files);
                  if(files.isDirectory()){
                       fileDir(files);
                  }
            
       }
   }
}
