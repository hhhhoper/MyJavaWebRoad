package io流.File类;
import java.io.*;
import java.util.Arrays;
 class 遍历目录下的文件过滤 {
    public static void main(String[] args) {
            //创建File对象,并指定文件路径
            File file=new File("/home/lqy/文档/pub/data/2023_07_19");
            //判断是否是目录
            if(file.isDirectory()){
                   //获取目录中的所有文件的名称
                   String[]fileNames=file.list((path,name)->name.endsWith(".txt"));
                   //对指定路径下的文件或目录进行遍历
                   Arrays.stream(fileNames)
                   .forEach(f->System.out.println(f));
            }
     }  
}