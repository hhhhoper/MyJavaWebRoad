package 字符串的替换和去除空格操作.字符串判断操作.字符串的截取和分割;
class Example06{
   public static void main(String[] args) {
       String str="2018-01-24";
       //下面是字符串截取操作
       System.out.println("从第6个字符截取到末尾的结果："+str.substring(5));
       System.out.println("从第6个字符截取到第7个字符的结果:"+str.substring(5, 7));

       //下面是字符串分割操作
       System.out.println("分割的字符数组元素依次为:");
       //通过横线链接符"-"将字符串转换为字符串数组
       String[] strArray=str.split("-");
       //循环输出数组中的元素
      for(int i=0;i<strArray.length;i++){
                   if(i!=strArray.length-1){
                                      System.out.print(strArray[i]+"、");
                   }
                   else{
                                       System.out.println(strArray[i]);
                   }
      }
   }
}