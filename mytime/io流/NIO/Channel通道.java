import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.Random;
import java.util.RandomAccess;

public class Channel通道 {
    public static void main(String[] args) throws Exception{
        //创建RandomAccessFile对象，指定源文件
        RandomAccessFile infile=
           new RandomAccessFile("src.jpg", "rw");
           //获取读取源文件FileChannel通道
           FileChannel inChannel=infile.getChannel();
        //创建RandomAccessFile对象，指定目标文件
        RandomAccessFile outfile=
           new RandomAccessFile("dest.jpg", "rw");
           //获取读取复制目标文件FileChannel通道
           FileChannel outChannel=outfile.getChannel();
           //使用transferTo()方法进行整体复制
           long transferTo=inChannel.transferTo(0, inChannel.size(), outChannel);
           if(transferTo>0){
               System.out.println("复制成功");
           }
           infile.close();
           outfile.close();
           inChannel.close();
           outChannel.close();
           
    }
}
