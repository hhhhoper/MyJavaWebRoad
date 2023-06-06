package test.test04;

public class Card {
    String color;
    String num;
    public Card(String color,String num){
       this.color=color;
       this.num=num;
    }
    public void showCard(){
       System.out.println(color+num);
    }
}
