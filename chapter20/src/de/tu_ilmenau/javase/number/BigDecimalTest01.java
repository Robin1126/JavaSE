package de.tu_ilmenau.javase.number;

import java.math.BigDecimal;

/*
    1. BigDecimal 属于大数据，精度极高。不属于基本数据类型，属于java对象，引用数据类型

    2. 财务数据使用的就是BigDecimal数据类型
 */
public class BigDecimalTest01 {
    public static void main(String[] args) {
        //不是普通的100，是精度极高的100
        BigDecimal bd = new BigDecimal(100);
        BigDecimal bd1 = new BigDecimal(200);
        //求和要用方法，不能直接用+
        BigDecimal bd2 = bd.add(bd1);
        System.out.println(bd2);

        BigDecimal bd3 = bd1.divide(bd);
        System.out.println(bd3);
    }
}
