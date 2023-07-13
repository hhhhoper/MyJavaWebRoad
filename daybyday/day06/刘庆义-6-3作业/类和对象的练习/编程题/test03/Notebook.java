package 类和对象的练习.编程题.test03;

class Noterbook{
    char color;
    int cpu;
    public Noterbook(){}
    public Noterbook(char color,int cpu){
        this.color=color;
        this.cpu=cpu;
    }
    public void printInfo()
    {
        System.out.println("电脑颜色:"+color+"cpu编号:"+cpu);           
    }

}