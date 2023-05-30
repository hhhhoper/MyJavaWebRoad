package onetest;

public class Test1 {
    static int a=10;
    static int b=10;
    public static void main(String[] args) {
        printNum(a, b);
        doubling(a,b);
        printNum(a, b);
        a=doubling(a);
        b=doubling(b);
        printNum(a, b);
    }
    public static void printNum(int iVar,int iVar2){
        System.out.print("iVar:"+iVar+","+" ");
        System.out.println("iVar2:"+iVar2);
    }
    public static void doubling(int r,int p){
        r=r*2;
        p=p*2;
        printNum(r, p);
    }
    public static int doubling(int r){
        return r=r*2;
    }
}
