package RunTime类;
class Example{
    public static void main(String[] args) {
        Runtime rt=Runtime.getRuntime();  //获取Java程序关联的运行对象
        System.out.println("处理机的个数:"+rt.availableProcessors());
        System.out.println("空闲内存大小:"+rt.freeMemory()/1024/1024+"M");
        System.out.println("最大可用内存大小:"+rt.maxMemory()/1024/1024+"M");
    }
}