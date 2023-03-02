package de.tu_ilmenau.javase.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Java.util.Map接口中的常用方法：
        1. Map和Collection之间没有继承关系
        2. Map集合以key和value的形式存储数据：键值对
            key和value都是引用数据类型
            key和value都是存储对象的内存地址
            key起到主导的地位，value是key的附属品
        3. Map接口中的常用方法：
            V put(K key, V value) //添加键值对
            void clear() //清空
            boolean containsKey(Object key) //是否含有某个key
            boolean containsValue(Object value) //是否含有某个value
            V get(Object key) //通过key获取value
            boolean isEmpty() //判断是否为空
            Set<K> keySet() //获取Map集合所有的key，所有的key是一个set集合
            V remove(Object key)//通过key删除整个键值对
            int size() //Map的键值对个数
            Collection<V> values() //拿走所有的values
            Set<Map.Entry<K,V>> entrySet() //将Map集合转换成set集合
                转成 1=zhangsan 这样的，它的类型是Map.Entry,这个类也有泛型<K,V>,Map.Entry是静态内部类
 */
public class MapTest01 {
    //测试使用各种方法
    public static void main(String[] args) {
        //创建map
        Map<Integer,String> map = new HashMap<>();
        //向Map集合中添加键值对
        map.put(1,"zky");
        map.put(2,"bubu");
        map.put(3,"yier");
        map.put(4,"lbb");
        //通过key获取value
        String s = map.get(2);
        System.out.println(s);
        //获取键值对数量
        System.out.println("键值对数量：" + map.size());
        //remove方法，通过key删除对应的key-value
        map.remove(1);
        System.out.println("键值对数量：" + map.size());
        //判断是否包含某个key或者value
        map.put(1,"zky");
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue(new String("bubu")));
        System.out.println(map.containsValue("zbb"));
        //contains方法都是底层调用了equals的，所以自定义的class要重写equals方法

        //获取所有的values
        System.out.println("*****************");
        map.remove(1);
        Collection<String> values = map.values();
        for (String s2: values
             ) {
            System.out.println(s2);
        }

        //获取所有的key
        Set<Integer> keys = map.keySet();
        for (Integer s1: keys
             ) {
            System.out.println(s1);
        }
        System.out.println("*************");
        //清空集合
        map.clear();
        System.out.println("键值对数量：" + map.size());
        //判断是否为空
        System.out.println(map.isEmpty());

    }
}
