package de.tuilmenau.javase.array;
/*
    选择排序：
        每次从这堆参与比较的数据当中找出最小值
        拿着这个最小值和最前面的元素交换位置
        下一次循环的时候第一位就不用考虑了，它已经是最小的了
        选择排序比冒泡排序好在：每一次交换位置都能确定一个元素的位置，不像冒泡排序，有些交换没有意义，效率高在交换次数少了

        核心：怎么找最小的
            先令第一个为最小的，拿这个跟后面的比，一旦找出比当前最小的，更改一下最小值，再拿这个最小值继续跟后面的比较
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 10, 3, 2, 31, 44};
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            //找最小的值和最小的值所在的位置
            //每次循环参加的数据最左边的元素的下标跟i一致
            //如 第一次 最左边的元素下标是0，第二次循环变成1，因为0下边的位置已经拍好了
            int min = i;//直接记录最小值下标的位置
            for (int j = i + 1; j < arr.length; j++ ) { //从起点i的下一个位置开始比较，比到数组的末尾
                //总是用当前的最小值跟下一个值比较
                if (arr[min] > arr[j]){
                    min = j;//记录新的最小值下标
                }
            }
            //交换a[min]和arr[i]的位置
            if (min != i) { //当min=i的时候，表示最初的猜测是对的，如果不相等了就要交换位置了
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }
    }
}
