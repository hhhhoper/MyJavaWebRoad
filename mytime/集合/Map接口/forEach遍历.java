
import java.util.*;
public class forEach遍历 {
   public static void main(String[] args) {
                   Map map=new HashMap();
                   //1.向Map存储键值对元素
                   map.put("1","Jack");
                   map.put("2","Rose");
                   map.put("3","Lucy");
                   map.put("4","Lucy");
                   map.put("1", "Tom");
                   System.out.println(map);
                   map.forEach((key,value)->System.out.println(key+":"+value));
   }
}
