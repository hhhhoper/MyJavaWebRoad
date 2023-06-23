package test.test03;

public class Duck extends Poultey{
      String name;
      String symptom;
      String illness;
      int age;
      public Duck(){};
      public Duck(String name,String symptom,int age, String illness){
          super(name, symptom, age, illness);
          this.name=name; 
          this.symptom=symptom;
          this.age=age;
          this.illness=illness;
      }
      public void showSymptom(){
          System.out.println("症状为:"+symptom);         
      }
public String getName() {
                   return name;
}
public String getSymptom() {
                   return symptom;
}
public String getIllness() {
                   return illness;
}
public void setName(String name) {
                   this.name = name;
}
public void setSymptom(String symptom) {
                   this.symptom = symptom;
}
public void setIllness(String illness) {
                   this.illness = illness;
}

}
