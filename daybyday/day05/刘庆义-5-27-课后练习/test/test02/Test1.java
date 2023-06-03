package test02;

class Test1{
    public static void main(String[] args) {
        boolean num1=doCheck(2); 
        System.out.println(num1);
        boolean num2=doCheck(3);
        System.out.println(num2);
}
    public static boolean doCheck(int iVar){
     boolean flag;
     if(iVar%2==0){
          for(int i=0;i<=20;i++){
                   iVar-=i;        
          }
          flag=true;
     }
     else{
        for(int i=0;i<=20;i++){
            iVar+=i;
        }
        flag=false;
     } 
     System.out.println(iVar);    
     return flag;        
                   }
}