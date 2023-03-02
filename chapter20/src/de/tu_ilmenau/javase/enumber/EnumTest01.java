package de.tu_ilmenau.javase.enumber;
/*
    分析以下程序在设计上有什么缺陷？

 */
public class EnumTest01 {
    public static void main(String[] args) {
        System.out.println(divide(10,1)  ? "计算成功":"计算失败");
    }

    /**
     * 计算商，成功返回1，否则返回0
     * @param a
     * @param b
     * @return 返回1成功，否则返回0
     */
    public static boolean divide(int a, int b) {
        try { //尝试执行程序
            int c = a / b;
            return true;
        } catch (Exception e) {
            return false; //异常处理
        }
        //缺陷在返回值类型上面，既然结果只是成功和失败，返回int可能误操作，但是编译器检查不出来
        //尽量追求所有的错误都让编译器找出来
        //如果结果有多种情况，但是如果可以枚举出来的话，就无法用布尔类型，而是使用枚举类型
    }
}
