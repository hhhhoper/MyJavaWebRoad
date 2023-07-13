package  Collection接口.Collection集合遍历;

import java.util.ArrayList;
import java.util.Iterator;
class Collection集合遍历{
    public static void main(String[] args) {
         ArrayList list=new ArrayList();
         list.add("data_1");
         list.add("data_2");
         list.add("data_3");
         System.out.println(list);
         //将集合转换为Iterator迭代器对象
         Iterator it=list.iterator();
         it.forEachRemaining(obj->System.out.println("迭代集合元素:"+obj));
    }
}