package de.tu_ilmenau.javase.collection;

import java.util.HashSet;
import java.util.Set;

/*
    HashSet无序不可重复
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("def");
        set.add("xyz");
        set.add("xyz");
        set.add("xyz");
        set.add("xyz"); //add方法实际上就是调用了Map的put方法
        /*
            1. 存入和取出的顺序可能不一致
            2. 存入的元素不可重复，虽然不报错，但是实际上存不进去
            3. 存入HashSet的元素实际上存到了HashMap的Key部分去了
         */

        for (String s:set
             ) {
            System.out.println(s);
        }
    }
}
