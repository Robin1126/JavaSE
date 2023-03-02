package de.tuilmenau.javase.array;
/*
    二维数组的遍历
 */
public class ArrayTest11 {
    public static void main(String[] args) {
        String[][] array = {
                {"java", "oracle", "c++", "c#", "python"},
                {"张三", "李四", "王五"},
                {"lucy", "jack", "rose"}
        };
        for (int i = 0; i < array.length; i++) { //用两层循环来遍历
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
