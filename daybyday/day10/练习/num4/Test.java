package 练习.num4;

public class Test {
                   public static void main(String[] args) {
                                      // 创建士兵对象和AK47对象
                                      AK47 ak47 = new AK47();
                                      Soldier soldier = new Soldier("John", ak47);
                              
                                      // 前进
                                      soldier.moveForward();
                              
                                      // 装载子弹
                                      soldier.loadBullet();
                              
                                      // 进攻（包括发射子弹）
                                      soldier.attack();
                                  }   
}
