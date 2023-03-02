package de.tu_ilmenau.javase.date;
/*
    java对日期的处理,java.util.Date这个类可以搞
    Date()方法就是当前时间

    知识点：
    1. 获取当前时间 Date()方法
    2. Date -> String 先用SimpleDateFormat（"格式"）创建一个格式，然后再用 格式名.format（时间）导入格式即可
    3. String-> Date 也是先用SimpleDateFormat创建格式，然后用 格式名.parse(时间)即可到Date格式 parse是解析的意思


 */
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateTest01 {
    public static void main(String[] args) throws Exception {
        // 获取系统当前时间
        Date nowTime = new Date();//精确到毫秒，直接调用无参数构造方法
        System.out.println(nowTime);//sun公司已经重写过toString方法了

        //日期可以格式化么？转换成指定的格式
        //Date转换成具有一定日期格式
        //重写方法也不合适

        //java.text包下的，专门负责日期格式化
        //yyyy年，MM月，dd日，HH时，mm分，ss秒，SSS毫秒
        //注意在日期格式中，除了y M d H m s S 这些字符不能随便写以外，剩下的自己组织
        //date -> String

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        //new出来以后调用format方法,写入现在的时间
        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);

        /*
            现在有个字符串，怎么转换成为date呢？
            所有跟日期相关的都是Date类型
            String -> date

         */
        String time = "2008-08-08 08:08:08 888";
        //SimpleDateFormat sdf1 = new SimpleDateFormat("格式不能随便写，要和日期字符串格式相同")
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");//自定义了一个格式

        Date dateTime = sdf1.parse(time);
        System.out.println(dateTime);//Date的toString没有包含毫秒，所以显示不出来~
    }
}
