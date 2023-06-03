class Student{
      String sid;
      String sname;
      int sage;
      //定义有参构造器
      public Student(String id,String name,int age){
                   sid=id;
                   sname=name;
                   sage=age;
      }
      //定义无参构造器
      public Student(){
                   
      }
      public void info() {
             System.out.println(sname+","+sid+","+sage);
      }
}

