package de.tuilmenau.javase.array;
/*
    冒泡排序算法
    3, 2, 7, 6, 8
    先拿着3跟右边的2进行比较，如果左边大于右边，交互位置
    2， 3， 7， 6， 8 交换 比较一次
    然后发现3小于7，就不用交换位置
    再拿上次较大的右边的数字继续往下比较
    2， 3， 6， 7， 8 比较一次，不用交换位置
    2， 3， 6， 7， 8 比较一次，不用交换位置
    再第一次循环结束之后，能保证最大的数据在最右边~

    第二次循环又从第一个开始，到倒数第二个结束
    以此反复

    总结：
        1. 每一次循环结束，都要找出最大的数据，放到这堆数据的最右边，冒出最大的气泡
        2. 核心：
            拿着左边的数字跟右边的比较，当 左边 > 右边，交换位置
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 6, 8};
        //int类型数组经过冒泡排序法对arr进行排序
        //冒泡排序的核心是什么？
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
    public static void bubbleSort(int[] arr) {
        //int count = 0;
        for (int i = arr.length - 1; i > 0 ; i--) { //比如5个元素，一共循环4次
            for (int j = 0; j < i; j++) { //比如第一次循环，比较4次，i = 4，j = 0 1 2 3
                //不管交换不交换都要比较一次
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
               // count++;
            }
        }
        //System.out.println(count);
    }

}
