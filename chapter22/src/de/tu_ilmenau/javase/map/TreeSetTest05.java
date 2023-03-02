package de.tu_ilmenau.javase.map;

import java.util.TreeSet;

/*
    先按照年龄升序，如果年龄一样再按照姓名升序
    compareTo的返回值很重要，返回0相同，
    小于0往左子树上找，大于0会在右子树上找

    1. TreeMap/TreeSet是自平衡二叉树，遵循左小右大的原则
    2. 遍历二叉树的三种方式
        前序遍历：根左右
        中序遍历：左根右
        后序遍历：左右根

        注意：前中后说的是根的位置

     3. TreeMap/set采用的是中序遍历方式 左根右

     4. 100 200 50 60 80 120 140 130 135 180 666 40 55放到自平衡二叉树
        最终存储是
                     100
              50              200
          40       60     120          666
                 55   80     140
                         130   180
                           135
        如果按照中序遍历的方式取出元素，取出的数据就是从小到大排序的
        40 50 55 60 80 100 120 130 135 140 180 200 666 秒啊~ 自动排序了从小到大~
 */
public class TreeSetTest05 {
    public static void main(String[] args) {
        VIP vip1 = new VIP("bubu",18);
        VIP vip2 = new VIP("yier",18);

        TreeSet<VIP> ts = new TreeSet<>();
        ts.add(vip2);
        ts.add(vip1);

        for (VIP p: ts
             ) {
            System.out.println(p);
        }
    }
}
class VIP implements Comparable<VIP> {
    String name;
    int age;

    public VIP(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "VIP{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(VIP vip) {
        if (this.age != vip.age) {
            return this.age - vip.age;
        } else {
            return this.name.compareTo(vip.name); //String类型sun公司已经给你写好了compareTo方法
        }
    }
}
