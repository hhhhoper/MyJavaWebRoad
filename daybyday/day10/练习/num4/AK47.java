package 练习.num4;

public class AK47 {
              private int bulletCount;

    public AK47() {
        this.bulletCount = 0;
    }

    public void shoot() {
        if (bulletCount > 0) {
            System.out.println("Bang! The AK47 fires a bullet.");
            bulletCount--;
        } else {
            System.out.println("Click! The AK47 is out of bullets.");
        }
    }

    public void loadBullet() {
        bulletCount++;
        System.out.println("A bullet is loaded into the AK47. Total bullets: " + bulletCount);
    }
}

