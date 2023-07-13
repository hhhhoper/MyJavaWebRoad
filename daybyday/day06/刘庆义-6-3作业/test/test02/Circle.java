package test.test02;

class Circle{
    int r;
    public Circle(){}
    public Circle(int r){
        this.r=r;
    }
    public int getR(){
        return r;
    }
    public void setR(int r){
        this.r=r;
    }
    public double showArea(){
        double area=3.14*r*r;
        System.out.println("半径为:"+r+",面积为："+area);
        return area;
    }
    public double showPerimeter(){
        double per=2*3.14*r;
        System.out.println("半径为:"+r+",面积为："+per);
        return per;
    }
}