
import java.util.*;
public class Iterator迭代器遍历 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("1", "Jack");
        map.put("2", "Rose");
        map.put("3", "Lucy");
        System.out.println(map);
        Set keySet=map.keySet();
        Iterator iterator=keySet.iterator();
        while(iterator.hasNext()){
                   Object key=iterator.next();
                   Object value=map.get(key);
                   System.out.println(key+":"+value);
        }
    }
}
