package StringBuffer;

public class Example08 {
    public static void main(String[] args) {
                   System.out.println("1.添加---------------------");
                   add();
                   System.out.println("2.修改---------------------");
                   update();
                   System.out.println("3.删除---------------------");
                   delete();
    }
    public static void add(){
        StringBuffer sb=new StringBuffer();   //定义一个字符串缓冲区
        sb.append("ABC");
        System.out.println("append添加结果:"+sb);
        sb.insert(3,"DE");
        System.out.println("insert添加结果:"+sb);
    }
    //修改
    public static void update(){
                   StringBuffer sb=new StringBuffer("ABAAA");
                   sb.setCharAt(2,'c');  //修改指定位置字符
                   System.out.println("修改指定位置字符结果:"+sb);
                   sb.replace(3, 5,"DE");
                   System.out.println("替换指定位置字符(串)结果:"+sb);
                   System.out.println("字符串翻转结果:"+sb.reverse());
    }
    //删除
    public static void delete(){
                   StringBuffer sb=new StringBuffer("ABCDEFG");
                   sb.delete(3, 7);    //删除指定范围
                   System.out.println("删除指定范围位置结果:"+sb);
                   sb.deleteCharAt(2); //删除指定位置
                   System.out.println("删除指定位置结果:"+sb);
                   sb.delete(0,sb.length());    //指定位置删除
                   System.out.println("清空缓冲区结果:"+sb);
    }

}
