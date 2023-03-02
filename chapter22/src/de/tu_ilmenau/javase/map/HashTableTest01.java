package de.tu_ilmenau.javase.map;

import java.util.Hashtable;
import java.util.Map;

/*
    HashTable的key可以为null吗？
    不可以，key和value都不可以

    Hashtable和HashMap一样，底层都是哈希表数据结构
    Hashtable的默认初始化容量是11，默认加载因子是0.75f
    扩容之后是原先容量的2倍+1

 */
public class HashTableTest01 {
    public static void main(String[] args) {
        Map map = new Hashtable();
        map.put(null,"123"); //NullPointerException
        //调用hashCode的时候出现空指针异常
        //Hashtable的key和value都不能为空
        //Hashtable方法都带有线性安全的


    }
}
