public class Example18 {
                   public static void main(String[] args) {
                       Outer outer=new Outer();
                       Outer.Inner inner=outer.new Inner();
                       inner.show1();
                       outer.test2();
                   }
}
