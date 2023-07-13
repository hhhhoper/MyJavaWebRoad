package test.test07;

public class ShoppingCar {
     Goods ArrayList[]=new Goods[100];
     int index;
     public void add(Goods g){
          while(ArrayList[index]!=null){
               index++;
          }
          ArrayList[index]=g;
          index=0;
     }
     public void remove(Goods g){
          for(int i=0;i<100;i++){
                if(ArrayList[i].equals(g)){
                   ArrayList[i]=null;
                   return;
                } 
          }
     }
     public void showGoods(){
         for(int i=0;ArrayList[i]!=null&&i<100;i++){
               System.out.println("商品名称:"+ArrayList[i].name
               +"\nid："+ArrayList[i].id+"\n价格："+ArrayList[i].price);
         }
     }

     public void sum(){
            double sum=0;
             for(int i=0;ArrayList[i]!=null&&i<100;i++){
                   sum+=ArrayList[i].price;
             }
             System.out.println("总计:"+sum+"元");
           
     }
     
}
