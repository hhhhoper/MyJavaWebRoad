package test09;

public class Test09 {
     public static void main(String[] args) {
         justiceAngle(3, 4, 5);
     }
     public static boolean justiceAngle(int a,int b,int c){
           boolean justice;
           int max=a>(b>c?b:c)?a:(b>c?b:c);
           int[]arr={a,b,c};
           int sum=0;
           for(int i=0;i<3;i++){
                   if(arr[i]==max){
                       continue;
                   }
                   sum+=arr[i]*arr[i];
           }
           if(max*max==sum){
                   justice=true;
           }else justice=false;
           System.out.println(a+":"+b+":"+c+
           "是否可以组成直角三角形:"+justice);
           return justice;
     }
}
