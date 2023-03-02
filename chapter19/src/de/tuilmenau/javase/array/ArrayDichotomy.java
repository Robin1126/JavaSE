package de.tuilmenau.javase.array;
/*
    二分法查找：二分法查找18
    10 11 12 13 14 15 16 17 18 19 20
    其中10开始下标0 ，20结尾下标10

    先找到中间下标5，然后下标为5的数据是15，15<18在右边
    此时5成为新的下标，结尾下标仍为10，然后再找中间坐标在往复

    注意！！二分法查找是基于排序上的，必须这堆元素已经排好序列才有意义
 */
public class ArrayDichotomy {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400, 600, 688, 900, 1010, 1080, 2030};

        int index = binarySearch(arr,1010);
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标是" + index);
    }

    private static int binarySearch(int[] arr, int i) {
        int begin = 0; //开始下标
        int end = arr.length - 1; //结束下标

        while(begin < end) { //只要开始在结束的左边，就证明这一个段落中还有数据
            int mid = (begin + end) / 2;
            if (arr[mid] == i) return mid;
            else if (arr[mid] < i) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

}
