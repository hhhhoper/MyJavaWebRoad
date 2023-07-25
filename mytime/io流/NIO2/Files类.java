package io流.NIO2;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.io.File;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.Path;public class Files类 {
   public static void main(String[] args) throws Exception{
        //定义一个目录路径的Path对象
        Path directoryPath=Paths.get("/home/lqy/文档/MyJavaWebRoad/mytime/io流/NIO2/sample");
        //根据Path对象创建多级目录
        Files.createDirectories(directoryPath);
        System.out.println("目录创建成功");
        //定义一个文件路径的Path对象
        Path filePath=Paths.get("/home/lqy/文档/MyJavaWebRoad/mytime/io流/NIO2/sample/test.txt");
        //根据Path对象创建一个文件
        Files.createFile(filePath);
        //创建一个List集合，并向集合中添加内容
        List<String>list=new ArrayList<>();
        list.add("这是一个测试文件");
        //将集合中的内容追加写入到指定的文件中
        Files.write(filePath, list, StandardOpenOption.APPEND);
        List<String>lines=Files.readAllLines(filePath);
        System.out.println("文件大小为:"+Files.size(filePath));
        System.out.println("文件中的内容为:"+lines);
   }
}
