package 练习.num1;
 class Dog{
    String name;
    String age;
    String kind;
    String host;
    String price;

    
    public Dog(String name, String kind, String host, String price,String age) {
                   this.name = name;
                   this.kind = kind;
                   this.host = host;
                   this.price = price;
                   this.age=age;
}
public void run(){
                   System.out.println("小狗Dog跑的老快了~");
    }
    public void eat(int n){
                   System.out.println("小狗今晚要吃"+n+"根肉骨头");
    }

    public void sleep(double num){
                   System.out.println("小狗睡了"+num+"个小时");
    }
    public String host(String host){
                   System.out.println("小狗与主人"+host+"玩的很开心");
                   return "飞盘";
    }
    private void bark(){
                   System.out.println("小狗喜欢汪汪叫，");
    }
    public void play(){
                   bark();
    }
    public String toString(){
        return "名字:"+name+" 年龄:"+age+" 品种:"+kind+" 主人："+host+" 价格:"+price;
    }
}