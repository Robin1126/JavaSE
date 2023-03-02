package de.tu_ilmenau.javase.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合的遍历
 */
public class MapTest02 {
    public static void main(String[] args) {
        // 第一种方式，获取所有的key，通过key来遍历value
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"yier");
        map.put(2,"bubu");
        map.put(3,"zky");
        map.put(4,"lbb");
        // 拿到所有的key，用keySet方法
        Set<Integer> key = map.keySet();
        //遍历key，通过key获得value
        // 1. 用Iterator
        Iterator<Integer> it = key.iterator();
        while(it.hasNext()) {
            String s = map.get(it.next());
            System.out.println(s);
        }
        // 2. 用foreach
        System.out.println("++++++++++++++++");
        for (Integer i: key
             ) {
            System.out.println(map.get(i));
        }

        // 第二种遍历的方式 Set<Map.Entry<K,V>>  entrySet()
        // 这种方法就是把Map集合直接全部转换成Set集合
        // Set集合中元素的类型是Map.Entry
        Set<Map.Entry<Integer,String>> set = map.entrySet(); //new出来的set的元素就是Map.Entry类型的，它又含有Integer和String两个属性
        // 底层其实是一个Node对象，一个属性是Integer，一个属性是String,它是一个单向链表
        // 遍历Set集合，一次取出一个Node
        // 这种效率比较高，直接从node中获取比再检索一次的效率高
        for ( Map.Entry<Integer,String> node: set
             ) {
            System.out.println(node.getKey() + "--->" + node.getValue()); //node里面就有key和value属性
        }

        Iterator<Map.Entry<Integer,String>> it1 = set.iterator(); //注意泛型的使用，如果不使用，默认就是Object，后面访问还要转型
        while (it1.hasNext()) {
            Map.Entry<Integer,String> me = it1.next();
            System.out.println(me.getKey() + "--->" + me.getValue());
        }
    }
}
