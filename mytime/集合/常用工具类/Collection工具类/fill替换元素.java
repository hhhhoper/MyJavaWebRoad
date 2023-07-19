import java.util.Arrays;
public class fill替换元素 {
   public static void main(String[] args) {
       int[]arr={1,2,3,4};
       Arrays.fill(arr,8);
       for(int i=0;i<arr.length;i++){
                   System.out.println(i+":"+arr[i]);
       }
   }
}
