import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] sequence = new int[20];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = random.nextInt(2); 
        }
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        if (maxCount >= 8) {
            System.out.println("恭喜您获得一等奖！");
        } else if (maxCount >= 7) {
            System.out.println("恭喜您获得二等奖！");
        } else if (maxCount >= 6) {
            System.out.println("恭喜您获得三等奖！");
        } else {
            System.out.println("很遗憾，没有中奖。");
        }
        System.out.println("随机序列：");
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i]);
        }
    }
}