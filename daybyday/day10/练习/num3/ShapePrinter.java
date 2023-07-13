package 练习.num3;

import java.util.Random;

public class ShapePrinter {
    public static void main(String[] args) {
        printRandomShape();
    }

    public static void printRandomShape() {
        Random random = new Random();
        int shapeType = random.nextInt(3); // 生成0到2之间的随机整数

        switch (shapeType) {
            case 0:
                printRectangle();
                break;
            case 1:
                printTriangle();
                break;
            case 2:
                printCircle();
                break;
            default:
                System.out.println("未知形状");
                break;
        }
    }

    public static void printRectangle() {
        System.out.println("打印矩形");
        System.out.println("**********");
        System.out.println("*        *");
        System.out.println("*        *");
        System.out.println("**********");
    }

    public static void printTriangle() {
        System.out.println("打印三角形");
        System.out.println("     *     ");
        System.out.println("   *   *   ");
        System.out.println(" *       * ");
        System.out.println("***********");
    }

    public static void printCircle() {
        System.out.println("打印圆形");
        System.out.println("   *****   ");
        System.out.println(" *       * ");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println(" *       * ");
        System.out.println("   *****   ");
    }
}