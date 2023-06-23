package test.test03;

public abstract  class Poultey {
   private String name;
   private String symptom;
   private int age;
   private String illness;

   public Poultey(){}

   public Poultey(String name,String symptom,int age,String illess){
       this.name=name;
       this.symptom=symptom;
       this.age=age;
       this.illness=illess;
   }

   public abstract void showSymptom();
   public void showMsg(){
        System.out.println("动物种类”:"+this.name+"，年龄:"
        +this.age);
   }
   
}
