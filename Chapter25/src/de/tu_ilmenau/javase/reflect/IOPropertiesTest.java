package de.tu_ilmenau.javase.reflect;

import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class IOPropertiesTest {
    public static void main(String[] args) throws Exception {
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath();
        System.out.println(path);
        Properties properties = new Properties();
        FileReader reader = new FileReader(path);
        properties.load(reader);
        reader.close();

        //通过key获取value
        Object obj = properties.getProperty("className");
        System.out.println(obj); //路径不能有中文，空格这种，命名规范按照java的标识符来是最好的！
        //也可以直接以流的方式返回
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo2.properties");
        properties.load(in);
        in.close();
        obj = properties.getProperty("className");
        System.out.println(obj);

    }
}
