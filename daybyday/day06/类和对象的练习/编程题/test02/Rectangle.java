package 类和对象的练习.编程题.test02;
class Rectangle{
   int length;
   int width;
   public Rectangle(int width,int length){
       this.length=length;
       this.width=width;
   }
   public int getArea(){
       return length*width;
   }
   public int getPer(){
       return 2*(length+width);
   }

}