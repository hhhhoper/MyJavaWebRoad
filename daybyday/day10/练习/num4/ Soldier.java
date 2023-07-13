package 练习.num4;
class Soldier{
                   private String name;
                   private AK47 weapon;
               
                   public Soldier(String name, AK47 weapon) {
                       this.name = name;
                       this.weapon = weapon;
                   }
               
                   public void moveForward() {
                       System.out.println(name + " is moving forward.");
                   }
               
                   public void attack() {
                       System.out.println(name + " is attacking with the AK47.");
                       weapon.shoot();
                   }
               
                   public void loadBullet() {
                       System.out.println(name + " is loading a bullet into the AK47.");
                       weapon.loadBullet();
                   }
}