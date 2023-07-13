package Lamda入门.方法引用与构造器引用.对象名引用方法;
//定义一个函数接口
@FunctionalInterface
interface Printable{
    void print(String str);
}
class StringUtils{
    public void prinUpperCase(String str){
         System.out.println(str.toUpperCase());
    }
}
//定义测试类
public class Example25{
    private static void printUpper(String text,Printable pt){
                   pt.print(text);
    }
    public static void main(String[] args) {
                   StringUtils text=new StringUtils();
                   printUpper("text",str->text.prinUpperCase(str));
                   printUpper("text",text::prinUpperCase);

    }
}