package de.tu_ilmenau.javase.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap集合：
        1. HashMap集合底层是哈希表/散列表的数据结构
        2. 哈希表是一个怎么样的数据结构？
            哈希表是一个数组和单向链表的结合体
                数组：随机增删的效率很低，检索的效率很高
                链表：随机增删的效率高，但是检索的效率很低
                哈希表就是一个将以上两种数据结构融合在一起，充分发挥它们的特长
        3. 类似门帘：上面的横线是数组，每一个串都是单项链表
            数组里面的是Node[]数组,Node<K,V>[]
            HashMap集合底层的源代码
                public class HashMap {
                // HashMap底层实际上就是一个数组
                    Node<K,V>[] table;
                    static class Node<K,V> implements Map.Entry<K,V> {
                        final int hash; //哈希值（哈希值是key的hashCode（）方法的执行结果，哈希值通过哈希算法，可以转换存储成数组的下标）
                        final K key; //存储到Map集合中的那个key
                        V value; //存储到Map集合中的那个value
                        Node<K,V> next; //下一个节点的内存地址
                    } //静态内部类
                }
             哈希表/散列表：一维数组，这个数组中每一个元素是一个单向链表。因此是数组和链表的集合体
         4. 最主要掌握的是：
            map.put(k,v)
            v = map.get(k)

            map.put(k,v)如何实现的
            1. 先将k，v封装到Node对象中
            2. 底层调用k的hashCode（）得出hash值
            3. 通过哈希算法将hash值计算出在Node[]数组中的下标
            4. 下标位置上如果没有任何元素，就直接添加到当前位置上
               如果下标对应的位置上有链表/元素，那就拿着k和链表上每一个节点中的k进行equals，如果所有的equals方法返回都是false，那么新节点就加到链表末尾
               如果其中一个equals返回的是true，那么就将新节点的value替换掉链表上对应位置的value

            目的：Node[]数组就相当于目录，能定位到一个大概的位置，然后再在一个不太长的链表上面索引，增加元素。
                增删在链表上完成，查询也不是全部查询。

            map.get(k)如何实现的
            1.  先利用k调用hashCode（）计算到对应的数组下标
            2. 如果这个位置上什么也没有，返回null
            3. 如果这个位置上有链表，那么拿着这个k和单向链表上的所有k进行比较，equals
            4. 如果没有equals返回true，那么最后返回null
            5. 如果有其中一个equals方法返回true，那么返回对应位置的value

            因此比较关键的是equals和hashcode这两个方法，都要重写

         5. HashSet为什么是无序，不可重复？
            因为不一定挂到哪个单项链表上面
            而如果k相同的时候，value就被替代了
            放在HashMap集合k部分的元素其实就是放在了HashSet集合中了
            所以HashSet集合中的元素也需要同时重写hashCode（）和equals方法

            注意：同一个链表上，它们的hash值是一样的，因为它们的数组下标一样
                 但同一个链表上的k和k的equals方法肯定返回的是false，因为它们的k值肯定不一样，一样的会替换
                 hashCode()返回一个固定值可以吗？
                    就成为了一个单项遍历了，无法发挥hash表的性能，这种情况我们称为散列分布不均匀
                    什么是散列分布均匀？
                        假设100个元素，10个单项链表，那么每个单项链表上面有10个节点，这是最好的，就是散列分布均匀的。
                 hashCode()所有都返回不同的值？
                    就成了一个数组，无法发挥链表的性能，也是散列分布不均匀

                  因此为了散列分布均匀，需要你重写hashCode()方法时候有一定的技巧！！

          6. 重点！放在HashMap集合key部分的元素，以及放在HashSet集合中的元素，需要同时重写equals和hashCode()方法
          7. HashMap集合的默认初始化容量是16，默认加载因子是0.75
             这个默认加载因子是当HashMap集合底层数组的容量达到75%的时候，数组开始扩容~
             初始化容量必须是2的倍数，为了达到散列分布均匀，提高HashMap的存储效率所必须的
             扩容之后是原来的两倍

          8. HashSet初始容量也是16，默认加载因子0.75，扩容后是原来的2倍，初始化容量建议是2的倍数

 */
public class HashMapTest01 {
    public static void main(String[] args) {
        //测试HashMap集合key部分的元素
        Map<Integer,String> map = new HashMap<>();
        map.put(1111,"bubu");
        map.put(2222,"yier");
        map.put(3333,"lbb");
        map.put(4444,"zky");

        System.out.println(map.size());

        //遍历map集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> entry: set
             ) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
