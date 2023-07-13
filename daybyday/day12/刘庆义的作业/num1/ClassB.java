package day12.作业.num1;

public class ClassB implements InterfaceA {
      public int method(int n){
             if(n==1){
                   return 1;
             }
             return n*method(n-1);
      }  
}
