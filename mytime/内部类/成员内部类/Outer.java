class Outer{
      int m=0; //定义外部类的成员变量
        //定义外部类成员的方法
  void test1(){
      System.out.println("外部成员方法");
  }
  //定义成员内部类Inner
  class Inner{
       int n=1;
       //1.定义内部类的方法，访问外部类成员变量和方法
       void show1(){
            System.out.println("外部类成员变量m="+m);
            test1();
       }
       void show2(){
            System.out.println("内部类成员方法");
       }
  }
   //2.定义外部类方法，访问内部类变量和方法
      void test2(){
        Inner inner=new Inner();
        System.out.println("内部成员变量n="+inner.n);
        inner.show2();
      }

}