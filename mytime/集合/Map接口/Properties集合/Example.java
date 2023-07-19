
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Example {
     public static void main(String[] args) throws Exception{
                   //1.通过Properties进行属性文件读取操作
                   Properties pps=new Properties();
                   //2.加载要读取的文件test.properties
                   pps.load(new FileInputStream("/home/lqy/文档/MyJavaWebRoad/mytime/集合/Map接口/Properties集合/test.properties"));
                   //遍历test.properties键值对元素信息
                   pps.forEach((k,v)->System.out.println(k+"="+v));
                   //2.通过Properties进行属性文件写入操作
                   //指定要写入操作的文件名称和位置
                   FileOutputStream out=new FileOutputStream("/home/lqy/文档/MyJavaWebRoad/mytime/集合/Map接口/Properties集合/test.properties");
                   pps.setProperty("charset", "UTF-8");
                   //将此Properties集合中新增键值对信息写入配置文件
                   pps.store(out,"新增charset编码");


     }
}
