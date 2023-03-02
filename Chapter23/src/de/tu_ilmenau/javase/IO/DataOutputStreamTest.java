package de.tu_ilmenau.javase.IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
    java.io.DataOutputStream：数据专属的流
    这个流可以将数据连同数据的类型一并写入文件
    注意：这个不是普通的文档，使用记事本打不开

    这种文件一般读不出来，必须用DataInputStream才能拿出来
 */
public class DataOutputStreamTest {
    public static void main(String[] args) throws Exception{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data")); //包装流，里面是OutputStream
        //写数据
        byte b = 100;
        short s = 256;
        int i = 3080;
        long l = 4090;
        float f = 3.14f;
        double d = 3.1415926;
        boolean bo = true;
        char ch = '猪';

        //将类型也一并写入到文件当中
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(bo);
        dos.writeChar(ch);

        dos.flush();
        dos.close();
    }
}
