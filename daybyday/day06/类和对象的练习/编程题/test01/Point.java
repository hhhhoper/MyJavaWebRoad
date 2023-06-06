package 类和对象的练习.编程题.test01;

public class Point {
    int x,y;
    public Point(){}
    public Point(int x0,int y0){
        int x=x0;
        int y=y0;
    }
    public void movePoint(int dx,int dy){
        x+=dx;
        y+=dy;
    }
    public void printPoint(){
        System.out.println("p1:"+x+",p2:"+y);
    }     
}
