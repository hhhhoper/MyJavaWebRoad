package Stream流的常用方法;
import java.util.stream.Stream;
public class 过滤 {
   public static void main(String[] args) {
                   //通过字符串源数据创建一个Stream流对象
                   Stream<String>stream=Stream.of("张三","李四","张小明","张阳");
                   stream.filter(i->i.startsWith("张"))
                   .filter(i->i.length()>2)
                   .forEach(System.out::println);
   }
}
