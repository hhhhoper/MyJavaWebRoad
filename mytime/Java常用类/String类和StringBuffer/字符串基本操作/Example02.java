package 字符串基本操作;

public class Example02 {
    public static void main(String[] args) {
        String s="abcabcbacdba";//初始化字符串
        System.out.println("字符串长度为:"+s.length());
        System.out.println("字符串第一个字符:"+s.charAt(0));
        System.out.println("字符串c第一次出现的位置:"+s.indexOf('c'));
        System.out.println("字符串第一次出现的位置："+s.indexOf("ab"));
        System.out.println("字符串最后一次出现的位置："+s.lastIndexOf("ab"));
    }
}
