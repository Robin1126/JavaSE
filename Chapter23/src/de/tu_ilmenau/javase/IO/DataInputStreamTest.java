package de.tu_ilmenau.javase.IO;

import java.io.DataInputStream;
import java.io.FileInputStream;

/*
    DataOutputStream写的文件只能用DataInputStream才能够读出来
    并且读的时候你还要提前知道写入的顺序，读的顺序和写的顺序要一致，才可以正常取出数据

    !注意！ 一定要取出的顺序一致才可以！！
 */
public class DataInputStreamTest {
    public static void main(String[] args) throws Exception{
        DataInputStream dis = new DataInputStream(new FileInputStream("data"));
        byte b = dis.readByte();
        //dis.skip()也是有的
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean bo = dis.readBoolean();
        char ch = dis.readChar();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bo);
        System.out.println(ch);


        dis.close();
    }
}
