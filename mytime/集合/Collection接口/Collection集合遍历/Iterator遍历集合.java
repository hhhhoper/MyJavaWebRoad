package Collection接口.Collection集合遍历;
import java.util.Iterator;
import java.util.ArrayList;
class Iterator遍历集合{
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList list=new ArrayList();
        //向该集合中添加字符串
        list.add("data_1");
        list.add("data_2");
        list.add("data_3");
        //获取Iterator对象
        Iterator iterator=list.iterator();
        //判断集合中是否存在下一个元素
        while(iterator.hasNext()){
                   Object obj=iterator.next();//取出ArrayList集合中的元素
                   if("data_2".equals(obj)){
                       //list.remove(obj); //会异常
                       iterator.remove();
                   }
        }
        System.out.println(list);
    }
}