
import java.util.*;
class LinkedHashMap保证添加顺序{
//创建LinkedHashMap集合 
public static void main(String[] args) {
    Map map1=new HashMap();
    map1.put(2,"Rose");
    map1.put(1,"Jack");
    map1.put(3,"Lucy");
    map1.forEach((key,value)->System.out.println(key+":"+value));
    System.out.println("============================");
    Map map2=new LinkedHashMap();  //创建LinkedHashMap集合
    map2.put(2, "Rose");
    map2.put(1, "Jack");
    map2.put(3,"Lucy");
    map2.forEach((key,value)->System.out.println(key+":"+value));
}
}
