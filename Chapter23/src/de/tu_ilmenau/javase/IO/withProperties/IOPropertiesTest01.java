package de.tu_ilmenau.javase.IO.withProperties;

import java.io.FileInputStream;
import java.util.Properties;

/*
    properties是一个map集合，key和value都是string类型
    现在我们想将userinfo文件中的数据加载到properties集合当中

    如果是经常变动的信息，建议写到文件中，然后让java程序自己去动态的读信息，不需要都写到程序里面，这样不用重新编译，不用重新部署服务器
    这也就是IO流的重要作用之一！！

    类似于以上机制的文件称为配置文件，并且配置文件中的内容格式是key=value的时候，我们叫做属性配置文件
    java规范中属性规范文件以.properties结尾，但不是必须的
 */
public class IOPropertiesTest01 {
    public static void main(String[] args) throws Exception {
        //先新建一个输入流，让硬盘中的文件输入到内存中
        FileInputStream fis = new FileInputStream("userinfo.properties");

        //新建一个map集合
        Properties pro = new Properties();

        // 调用properties对象的方法，将文件中的数据加载到集合当中
        pro.load(fis); //文件中的数据顺着管道加载到map中，其中等号左边作为key，右边作为value
        fis.close();

        //通过key来获取value,使用getProperty(key)方法
        System.out.println(pro.getProperty("username"));
        System.out.println(pro.getProperty("password"));
        System.out.println(pro.getProperty("data")); //属性配置文件最好不要有空格
    }
}
