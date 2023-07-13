package RunTime类;

import java.io.IOException;

public class Example1 {
                   public static void main(String[] args) throws IOException {
                                      Runtime rt=Runtime.getRuntime();
                                      Process process=rt.exec("python3");
                                      //程序休眠3秒
                                      //关闭进程
                                      process.destroy();
                   }
}
