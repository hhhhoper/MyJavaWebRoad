package Collection接口.Collection集合遍历;
import java.util.ArrayList;
public class forEach遍历集合 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("data_1");
        list.add("data_2");
        list.add("data_3");
        System.out.println(list);
        //使用JDK8增加的forEach(Consumer action)方法遍历集合
        list.forEach(obj->System.out.println("迭代集合元素:"+obj));
    }
}
