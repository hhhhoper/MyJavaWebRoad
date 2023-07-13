package Class.test;

public class Test {
    public static void main(String[] args) {
                   CylinderImpl cylinder=new CylinderImpl(4,4);
                   System.out.println("表面积:"+cylinder.area());
                   System.out.println("体积:"+cylinder.volume());
    }
}
