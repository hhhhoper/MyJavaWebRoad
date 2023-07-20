import java.io.FileOutputStream;

public class 字节流追加 {
                   public static void main(String[] args) throws Exception{
                                     //创建文件输出流对象，并指定输出文件名称
                                     FileOutputStream out=new FileOutputStream("/home/lqy/文档/MyJavaWebRoad/mytime/io流/1.字节流/字节流文件读取/out.txt", true);
                                     //定义一个字符串
                                     String str="world";
                                     //将字符串转换为字节数组进行写入操作
                                      try{
                                          out.write(str.getBytes());
                                      }catch(Exception e){
                                                         e.printStackTrace();
                                      }
                                      finally{
                                                         try{
                                                                            if(out!=null){
                                                                                               out.close();
                                                                                }      
                                                         }
                                                         catch(Exception e){
                                                                            e.printStackTrace();
                                                         }
                                                         }
                                                         
                                      
                                      
                   }
}
