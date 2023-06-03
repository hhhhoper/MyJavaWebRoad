package test03;
class Test03{
   public static void main(String[] args) {
        System.out.println("字符:"+getChar(100));
        System.out.println("字符串:"+getString(100));
   }
   public static char getChar(int num){
        char chr=(char)num;
        return chr;
   }
   public static String getString(int num){
        char chr=getChar(num);
        String str=String.valueOf(chr);
        return str+str+str+str;           
   }
}