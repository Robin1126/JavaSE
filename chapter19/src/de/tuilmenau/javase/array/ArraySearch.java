package de.tuilmenau.javase.array;
/*
    数组的元素查找
        元素查找有2种方式，一个个挨着找，直接找到位置
        第二种是2分法查找，这个效率比较高
 */
public class ArraySearch {
    public static void main(String[] args) {
        //找出87，没有就返回-1
        int[] arr = {4, 5, 6, 87, 22};

        /*for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 100){
                System.out.println("100的下标是" + i);
                return;
            }
        }
        System.out.println("100不存在");*/
        int num = 100;
        int index = search(arr, num);
        System.out.println("查找元素" + num + " " + ((index == -1) ? "该元素不存在" : "该元素的下标是" + index));

    }
    //传入被查找的数组，还有要被查找的数据
    public static int search(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
