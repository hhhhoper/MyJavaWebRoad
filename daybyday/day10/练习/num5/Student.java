package 练习.num5;

public class Student {
                    // 属性
    private String name;
    private String major;
    private double score;

    // 构造方法
    public Student(String name, String major, double score) {
        this.name = name;
        this.major = major;
        this.score = score;
    }

    // Getter方法
    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getScore() {
        return score;
    }
}
