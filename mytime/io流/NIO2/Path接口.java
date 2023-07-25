package io流.NIO2;

import java.nio.file.Paths;
import java.nio.file.Path;
public class Path接口 {
    public static void main(String[] args) {
        //使用Paths的get()方法创建path对象
        Path path=Paths.get("/home/lqy/文档/电影/PopCorn.ico");
        //输出Path对象中的信息
        System.out.println("path的根路径:"+path.getRoot());
        System.out.println("path父路径:"+path.getParent());
        System.out.println("path中的路径名称数:"+path.getNameCount());
        //循环输出路径名称
        for(int i=0;i<path.getNameCount();i++){
                   //获取指定索引处的路径名称
                   Path name=path.getName(i);
                   System.out.println("索引为:"+i+"的路径名称为:"+name);
        }
        System.out.println("path的URI路径为:"+path.toUri());
        System.out.println("path的绝对路径:"+path.toAbsolutePath());
    }
}
