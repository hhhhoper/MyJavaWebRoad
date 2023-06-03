package test04;

public class Test04 {
        public static void main(String[] args) {
                   showColor("red");
        }
        public static void showColor(String color){
                String[]colorarr={"红色","red","蓝色","blue","黑色",
                "black","黄色","yellow","绿色","green"};
                for(int i=0;i<colorarr.length;i++){
                        if(color==colorarr[i]){
                                System.out.println(color+"是"+colorarr[i-1]+"!");
                        }
                }
        }      
}
