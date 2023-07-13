package test.test03;

public class MyDate {
     int year;
     int month;
     int day;
     public MyDate(){  }
     public int getYear() {
                   return year;
}
public int getMonth() {
                   return month;
}
public int getDay() {
                   return day;
}
public MyDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
     }
public void setYear(int year) {
                   this.year = year;
}
public void setMonth(int month) {
                   this.month = month;
}
public void setDay(int day) {
                   this.day = day;
}
public boolean isBi(int year){
     boolean leap;
     if(year%100!=0&&year%4==0){
          leap=true;
     }else if(year%100==0&&year%400==0){
          leap=true;
     }else 
          leap=false;
     if(leap==true){
          System.out.println(year+"年是闰年");
     }
     else{
          System.out.println(year+"年不是闰年");
     }
     return leap;
}
public void showDate(){
     System.out.println("日期:"+year+"年"+month+"月"+day+"日");
}   
}
