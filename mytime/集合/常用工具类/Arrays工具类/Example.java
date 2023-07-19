package 常用工具类.Arrays工具类;
import java.util.Arrays;
public class Example {
                   public static void main(String[] args) {
                                      int[]arr={9,8,3,5,2};    //初始化一个数组
                                      System.out.println("排序前:");
                                      printArray(arr);
                                      Arrays.sort(arr);
                                      printArray(arr);
                                     
                   }
                   public static void printArray(int[]arr){
                                      System.out.print("[");
                                      for(int x=0;x<arr.length;x++){
                                          if(x!=arr.length-1){
                                                         System.out.print(arr[x]+",");
                                          }else{
                                                         System.out.println(arr[x]+"]");
                                          }
                                      }
                   }
}
