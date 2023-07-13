package day11.homework;

class ColaEmployee {
                   private String name;
                   private int birthMonth;
               
                   public ColaEmployee(String name, int birthMonth) {
                       this.name = name;
                       this.birthMonth = birthMonth;
                   }
               
                   public String getName() {
                       return name;
                   }
               
                   public int getBirthMonth() {
                       return birthMonth;
                   }
               
                   public double getSalary(int month) {
                       if (birthMonth == month) {
                           return 100; // 生日月份额外奖励100元
                       } else {
                           return 0;
                       }
                   }
               }   
               
               class SalariedEmployee extends ColaEmployee {
                   private double monthlySalary;
               
                   public SalariedEmployee(String name, int birthMonth, double monthlySalary) {
                       super(name, birthMonth);
                       this.monthlySalary = monthlySalary;
                   }
               
                   @Override
                   public double getSalary(int month) {
                       return super.getSalary(month) + monthlySalary;
                   }
               }
               
               class HourlyEmployee extends ColaEmployee {
                   private double hourlyRate;
                   private int hoursWorked;
               
                   public HourlyEmployee(String name, int birthMonth, double hourlyRate, int hoursWorked) {
                       super(name, birthMonth);
                       this.hourlyRate = hourlyRate;
                       this.hoursWorked = hoursWorked;
                   }
               
                   @Override
                   public double getSalary(int month) {
                       double baseSalary = super.getSalary(month) + (hourlyRate * hoursWorked);
                       if (hoursWorked > 160) {
                           double overtimePay = (hoursWorked - 160) * (hourlyRate * 1.5);
                           return baseSalary + overtimePay;
                       } else {
                           return baseSalary;
                       }
                   }
               }
               
               class SalesEmployee extends ColaEmployee {
                   private double monthlySales;
                   private double commissionRate;
               
                   public SalesEmployee(String name, int birthMonth, double monthlySales, double commissionRate) {
                       super(name, birthMonth);
                       this.monthlySales = monthlySales;
                       this.commissionRate = commissionRate;
                   }
               
                   @Override
                   public double getSalary(int month) {
                       return super.getSalary(month) + (monthlySales * commissionRate);
                   }
               }
               
               class Company {
                   public static void printEmployeeSalary(ColaEmployee employee, int month) {
                       System.out.println("Employee: " + employee.getName());
                       System.out.println("Salary for month " + month + ": $" + employee.getSalary(month));
                       System.out.println();
                   }
               }
               
               public class num4 {
                   public static void main(String[] args) {
                       ColaEmployee[] employees = new ColaEmployee[4];
                       
                       employees[0] = new SalariedEmployee("John", 8, 2000);
                       employees[1] = new HourlyEmployee("Alice", 5, 15, 180);
                       employees[2] = new SalesEmployee("Bob", 9, 5000, 0.05);
                       employees[3] = new SalariedEmployee("Emily", 7, 2500);
               
                       int month = 7; // 指定月份为7
               
                       for (ColaEmployee employee : employees) {
                           Company.printEmployeeSalary(employee, month);
                       }
                   }
               }