package test.test08;

public class Book {
     String name;
     String isbn;
     double salary;
     String date;
     String booknum;  
     public Book(){}
     public Book(String name,String booknum,String isbn,double salary,String date){
          this.name=name;
          this.date=date;
          this.booknum=booknum;
          this.salary=salary;
          this.isbn=isbn;
     }
public void showBook(){
    System.out.println("最贵的书是:"+booknum+","+name+","+"isbn"+isbn+","+salary+","+date);
}
public String getName() {
                   return name;
}
public void setName(String name) {
                   this.name = name;
}
public void setIsbn(String isbn) {
                   this.isbn = isbn;
}
public void setSalary(double salary) {
                   this.salary = salary;
}
public void setDate(String date) {
                   this.date = date;
}
public String getIsbn() {
                   return isbn;
}
public double getSalary() {
                   return salary;
}
public String getDate() {
                   return date;
}           

}
