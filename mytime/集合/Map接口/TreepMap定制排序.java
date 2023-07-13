import java.util.*;
//自定义比较器
class CustomComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        String key1=(String)obj1;
        String key2=(String)obj2;
        return key2.compareTo(key1); //将比较之后的值返回
    }
}
public class TreepMap定制排序 {
        public static void main(String[] args) {
            Map map=new TreeMap(new CustomComparator());
        map.put("2","Rose");
        map.put("1","Jack");
        map.put("3","Lucy");
        System.out.println(map);
        }
}
