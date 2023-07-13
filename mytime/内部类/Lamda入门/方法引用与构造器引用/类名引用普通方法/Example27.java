package Lamda入门.方法引用与构造器引用.类名引用普通方法;
//定义一个函数式接口
@FunctionalInterface
interface Printable{
    void print(StringUtils su,String str);
}
class StringUtils{
    public void printUpperCase(String str){
                   System.out.println(str.toUpperCase());
    }
}
public class Example27 {
    private static void printUpper(StringUtils su,String text,Printable pt){
                   pt.print(su, text);
    }
                   public static void main(String[] args) {
                        printUpper(new StringUtils(), "Hello",(su,str)->su.printUpperCase(str));
                        printUpper(new StringUtils(), "Hello",StringUtils::printUpperCase);

                   }
}
