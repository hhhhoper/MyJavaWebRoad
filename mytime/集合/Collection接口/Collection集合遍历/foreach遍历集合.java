package Collection接口.Collection集合遍历;
import java.util.ArrayList;
public class foreach遍历集合 {
   public static void main(String[] args) {
                   ArrayList list=new ArrayList();
                   list.add("data_1");
                   list.add("data_2");
                   list.add("data_3");
                   //使用foreach循环遍历集合
                   for(Object obj:list){
                        System.out.println(obj);    //取出并打印集合中的元素
                   }

                   String[] strs={"aaa","bbb","ccc"};
                   for(String str:strs){
                          str="ddd";
                   }
                   System.out.println("foreach循环修改后的数组:"+strs[0]+","+strs[1]+","+strs[2]);
                   //2.for循环遍历数组
                   for(int i=0;i<strs.length;i++){
                       strs[i]="ddd";
                   }
                   System.out.println("for循环修改后的数组:"+strs[0]+","+strs[1]+","+strs[2]);
   }
}
