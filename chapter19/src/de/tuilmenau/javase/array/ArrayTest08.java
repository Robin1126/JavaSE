package de.tuilmenau.javase.array;
/*
    关于一维数组的扩容
    在Java开发当中，数组长度一旦确定不可改变，那么如何扩容呢？
        Java中对数组的扩容是 ：
            先建立一个大容量的数组，然后将小容量的数组中的数据一个个的拷贝到大数组当中

    结论：数组扩容的效率较低，因为设计到拷贝的问题。以后的设计程序要注意：尽可能少的进行数组的扩容
    在创建数组对象的时候预估计多长合适，最好预估准确，这样可以减少数组的扩容次数，提高效率

 */
public class ArrayTest08 {
    public static void main(String[] args) {
        //java中的数组如何进行拷贝呢？
        //System.arraycopy(5个参数); System类当中的静态方法
        //System.arraycopy(源数组，从源数组拷贝开始的位置，目标数组，复制到目标的位置，拷贝的长度);
        //这里的位置指的是下标
        int[] a = {1, 2, 3, 4};
        int[] b = new int[10];
        System.arraycopy(a,0, b, 3, 4);
        System.out.print("数组b：");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        int[] c = new int[4];
        System.out.println();
        System.out.print("数组c：");
        System.arraycopy(a, 0, c, 0, 4);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        String[] strs = {"hello", "welcome", "my", "friend", "!"};
        String[] newStrs = new String[10];
        System.arraycopy(strs, 0, newStrs, 3, 5);
        System.out.println();
        System.out.print("StringArray newStrs: ");
        for (int i = 0; i < newStrs.length; i++) {
            System.out.print(newStrs[i] + " ");
        }
        //拷贝Object[]的时候，拷贝的是地址而不是真正的对象，从内存图就可以很清晰的看到！
    }
}
