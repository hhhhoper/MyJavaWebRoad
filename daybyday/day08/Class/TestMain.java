package Class;

public class TestMain {
     public static void main(String[] args) {
                   JunQuan jq=new JunQuan();
                   jq.setName("小强");
                   jq.setAge(2);
                   jq.setColor("红色");
                   System.out.println(jq);
                   jq.eat();

                   ChongWu cw=new ChongWu();
                   cw.eat();
     }
}
