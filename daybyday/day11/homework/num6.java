package day11.homework;

import java.util.Random;

// 学生类
class Student {
    protected int studentID;
    protected String name;
    protected char gender;
    protected int age;
    
    public Student(int studentID, String name, char gender, int age) {
        this.studentID = studentID;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}

// 英语系学生类
class EnglishStudent extends Student {
    private int speechScore;
    private int finalExamScore;
    private int midtermExamScore;
    
    public EnglishStudent(int studentID, String name, char gender, int age,
                          int speechScore, int finalExamScore, int midtermExamScore) {
        super(studentID, name, gender, age);
        this.speechScore = speechScore;
        this.finalExamScore = finalExamScore;
        this.midtermExamScore = midtermExamScore;
    }
    
    public double calculateTotalScore() {
        return speechScore * 0.5 + finalExamScore * 0.25 + midtermExamScore * 0.25;
    }
}

// 计算机系学生类
class ComputerStudent extends Student {
    private int operationAbility;
    private int englishWriting;
    private int finalExamScore;
    private int midtermExamScore;
    
    public ComputerStudent(int studentID, String name, char gender, int age,
                           int operationAbility, int englishWriting, int finalExamScore, int midtermExamScore) {
        super(studentID, name, gender, age);
        this.operationAbility = operationAbility;
        this.englishWriting = englishWriting;
        this.finalExamScore = finalExamScore;
        this.midtermExamScore = midtermExamScore;
    }
    
    public double calculateTotalScore() {
        return operationAbility * 0.4 + englishWriting * 0.2 + finalExamScore * 0.2 + midtermExamScore * 0.2;
    }
}

// 文学系学生类
class LiteratureStudent extends Student {
    private int speechScore;
    private int worksScore;
    private int finalExamScore;
    private int midtermExamScore;
    
    public LiteratureStudent(int studentID, String name, char gender, int age,
                             int speechScore, int worksScore, int finalExamScore, int midtermExamScore) {
        super(studentID, name, gender, age);
        this.speechScore = speechScore;
        this.worksScore = worksScore;
        this.finalExamScore = finalExamScore;
        this.midtermExamScore = midtermExamScore;
    }
    
    public double calculateTotalScore() {
        return speechScore * 0.35 + worksScore * 0.35 + finalExamScore * 0.15 + midtermExamScore * 0.15;
    }
}

public class num6 {
    public static void main(String[] args) {
        Random random = new Random();
        Student[] students = new Student[5];
        
        // 随机生成英语系学生对象并填充到数组中
        for (int i = 0; i < 2; i++) {
            int studentID = 1001 + i;
            String name = "EnglishStudent" + i;
            char gender = (i % 2 == 0) ? 'M' : 'F';
            int age = 18 + i;
            int speechScore = random.nextInt(101);
            int finalExamScore = random.nextInt(101);
            int midtermExamScore = random.nextInt(101);
            
            students[i] = new EnglishStudent(studentID, name, gender, age,
                                             speechScore, finalExamScore, midtermExamScore);
        }
        
        // 随机生成计算机系学生对象并填充到数组中
        for (int i = 2; i < 4; i++) {
            int studentID = 2001 + (i - 2);
            String name = "ComputerStudent" + (i - 2);
            char gender = (i % 2 == 0) ? 'M' : 'F';
            int age = 18 + (i - 2);
            int operationAbility = random.nextInt(101);
            int englishWriting = random.nextInt(101);
            int finalExamScore = random.nextInt(101);
            int midtermExamScore = random.nextInt(101);
            
            students[i] = new ComputerStudent(studentID, name, gender, age,
                                              operationAbility, englishWriting, finalExamScore, midtermExamScore);
        }
}
}