package de.tu_ilmenau.javase.number;

import java.text.DecimalFormat;

/*
    数字格式化
 */
public class DecimalTest01 {
    public static void main(String[] args) {

        /*
            数字格式有哪些?
                # 代表任意数字
                , 代表千分位
                . 表示小数点
                0 代表不够时补零

         */
        DecimalFormat df = new DecimalFormat("#,###,###.###");//保留三位小数
        String s = df.format(12349999.5678); //数字转成特定格式的字符串
        System.out.println(s);

        DecimalFormat df2 = new DecimalFormat("0.000");//保留4位小数，不够补零
        String s2 = df.format(123.15);
        System.out.println(s2);

    }
}
