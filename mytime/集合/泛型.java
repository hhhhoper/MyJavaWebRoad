
import java.util.ArrayList;
class 泛型{
     public static void main(String[] args) {
                   //创建ArrayList集合,使用泛型
                   ArrayList<String>list=new ArrayList<String>();
                   list.add("String");   //添加字符串对象
                   list.add("Collection");   
                   for(String str:list){         //遍历集合,可以直接指定元素类型
                            System.out.println(str);

                   }
     }              
}