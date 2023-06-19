public class Persion {
                   // 属性私有化
                   private String name;
                   private String address;
                   private int age;
                   // 提供属性访问器 setter/getter
                   public String getName() {
                                      return name;
                   }
                   public String getAddress() {
                                      return address;
                   }
                   public int getAge() {
                                      return age;
                   }
                   public void setName(String name) {
                                      this.name = name;
                   }
                   public void setAddress(String address) {
                                      this.address = address;
                   }
                   public void setAge(int age) {
                                      if(age>0&&age<=150){
                                          this.age = age;               
                                      }else{
                                          System.out.println("您输入的年龄不符合！");
                                      }
                 
                   }
                   @Override
                   public String toString(){
                             return "Persion:"+name+","+address+","+age;
                   }
                   
}