package Collection接口.set集合.HashSet集合;
import java.util.HashSet;
class HashSet集合{
    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add("Jack");
        set.add("Eve");
        set.add("Rose");
        set.add("Rose");
        //遍历
        set.forEach(obj->System.out.println(obj));
    }
}