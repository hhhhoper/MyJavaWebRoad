package test.test07;

public class Example {
        public static void main(String[] args) {
                   ShoppingCar shoppingCar=new ShoppingCar();
                   Goods computer=new Goods("电脑", "g10000", 6999.0);
                   Goods keyboard=new Goods("键盘", "g10001", 199.0);
                   Goods mouse=new Goods("鼠标", "g10002", 59.0);
                   System.out.println("================添加商品================");
                   shoppingCar.add(computer);
                   shoppingCar.add(keyboard);
                   shoppingCar.add(mouse);
                   shoppingCar.showGoods();
                   shoppingCar.sum();
                   System.out.println("================删除商品================");
                   shoppingCar.remove(mouse);
                   shoppingCar.showGoods();
                   shoppingCar.sum();
        }           
}
