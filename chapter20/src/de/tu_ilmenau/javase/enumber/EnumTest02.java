package de.tu_ilmenau.javase.enumber;
/*
    采用枚举的方式改造程序
    总结：1.枚举是一种引用数据类型
         2. 枚举类型怎么定义？
        enum 枚举类名{
            枚举值1，枚举值2
        }
         3.结果只有两种，用布尔类型，超过2种建议使用枚举，不建议用int这种
 */
public class EnumTest02 {
    public static void main(String[] args) {
        Result r = divide(10, 0);
        System.out.println(r == Result.SUCCESS ? "计算成功":"计算失败"); //这样比较多约束，用int的情况太多了
    }

    public static Result divide(int a, int b) {
        try {
            int c = a / b;
            return Result.SUCCESS;
        } catch (Exception e) {
            return Result.FAIL;
        }
    }
}
/*
    枚举：可以一枚枚列举出来
    枚举编译之后也生成class文件
    枚举也是一种引用数据类型
    枚举中的每一个值可以看作是常量

 */
enum Result{
    SUCCESS, FAIL
}
