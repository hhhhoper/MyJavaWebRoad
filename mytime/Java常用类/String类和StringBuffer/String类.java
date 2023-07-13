class String类{
  public static void main(String[] args) {
         String str1=null;  //初始化为空
         String str2="";    //初始化为空字符串
         String str3="abc";  //初始化为abc,其中abc为字符串常量

         //构造方法
         //创建一个空的字符串
         String str=new String();
         //创建一个内容为abc的字符串
         String str4=new String("abc");
         //创建一个内容为字符数组的字符串
         char[]charArray=new char[]{'A','B','C'};
         String str5=new String(charArray);
         //输出结果
         System.out.println("a"+str+"b");
         System.out.println(str4);
         System.out.println(str5);

  }
}