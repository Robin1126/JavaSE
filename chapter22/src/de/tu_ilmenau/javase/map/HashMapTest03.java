package de.tu_ilmenau.javase.map;

import java.util.HashMap;
import java.util.Map;

/*
    HashMap的元素的key允许为null吗？
    允许，但是注意：HashMap集合的key null值只能有一个

 */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(null,null);
        System.out.println(map.size());
        //HashMap集合允许为空
        map.put(null,100);
        System.out.println(map.size());
        System.out.println(map.get(null));
    }
}
