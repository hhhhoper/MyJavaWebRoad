package throwa.自定义异常;
class DivideByMinusException extends Exception{
    public DivideByMinusException(){
        super();   //调用Exception无参构造方法
    }
    public DivideByMinusException (String message){
                   super(message);
    }
    
}