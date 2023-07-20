package Calendar类;

import java.util.Calendar;

public class Example {
   public static void main(String[] args) {
                   Calendar calendar=Calendar.getInstance();
                   int year=calendar.get(Calendar.YEAR);   //获取当前年份
                   int month=calendar.get(Calendar.MONTH)+1;  //获取当前月份
                   int date=calendar.get(Calendar.DATE);    //获取当前日
                   int hour=calendar.get(Calendar.HOUR);   //获取时
                   int minute=calendar.get(Calendar.MINUTE);  //获取分
                   int second=calendar.get(Calendar.SECOND);   //获取秒
                   System.out.println("当前时间为："+year+"年"+month+"月"+date+"日"
                   +hour+"时"+minute+"分"+second+"秒");
                   //设置指定日期
                   calendar.set(year,month,date);
                   //为指定日期增加时间
                   calendar.add(Calendar.DATE,100);
                   //返回指定日期的年
                   year=calendar.get(Calendar.YEAR);
                   //返回值定日期的月
                   month=calendar.get(Calendar.MONTH);
                   //返回指定日期的日
                   date=calendar.get(Calendar.DATE);
                   System.out.println("当前时间为："+year+"年"+month+"月"+date+"日"
                   +hour+"时"+minute+"分"+second+"秒");

   }

}
