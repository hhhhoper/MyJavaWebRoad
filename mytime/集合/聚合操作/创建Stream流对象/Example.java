package 创建Stream流对象;
import java.util.*;
import java.util.stream.Stream;

public class Example {
   public static void main(String[] args) {
        //创建一个数组
        Integer[]array={9,8,3,5,2};
        //将数组转换为List集合
        List<Integer>list=Arrays.asList(array);
        //1.使用集合对象的steam()静态方法创建Stream流对象
        Stream<Integer>stream=list.stream();  
        stream.forEach(i->System.out.print(i+" "));
        System.out.println();
        //2.使用Stream接口的of()静态方法创建Stream流对象
        Stream<Integer>stream2=Stream.of(array);
        stream2.forEach(i->System.out.print(i+" "));
        System.out.println();
        //3.使用Arrays数组工具类的stream()静态方法创建Stream流对象
        Stream<Integer>stream3=Arrays.stream(array);
        stream3.forEach(i->System.out.print(i+" "));

   }
}
