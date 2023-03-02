package de.tu_ilmenau.javase.string;
/*
    String的常用方法
 */
import java.io.PrintStream;
import java.sql.SQLOutput;
//String里面是一个byte数组，byte数组是final修饰的，就是创造开始就不可变

public class StringTest05 {
    public static void main(String[] args) {
        //String当中的常用方法
        //1.char charAt(int index)
        char c = "中国人".charAt(1);//返回下标1的字符，国
        System.out.println(c);

        //2 .int compareTo(String anotherString) 字典顺序比较，按照Unicode比较
        int result = "ybb".compareTo("zky");//l在z的前面，返回的是负数
        int result1 = "cxx".compareTo("azz");//整数是前大后小，等于0表示两个相等,大写在前面
        System.out.println(result1);
        //是第一个字符先开始比，能分胜负后面就不比了
        //字符串比较大小只能使用compareTo方法

        //3. boolean contains(CharSequence s)
        System.out.println("Hello.java".contains(".java"));
        System.out.println("Hello.java".contains("yeah"));

        //4. boolean endsWith(String suffix)
        System.out.println("test.txt".endsWith("txt"));
        System.out.println("test.txt".endsWith("java"));

        //5. boolean equals(Object anObject) equals方法没有调用compareTo方法
        System.out.println("lbb".equals("zky"));

        //6. 判断2个字符串是否相等，忽略大小写
        // booelan equalsIgnoreCase(String anotherString)
        System.out.println("abc".equalsIgnoreCase("ABC"));

        //7.将字符串对象转换成字节数组
        //byte[] getBytes()
        byte[] bytes = "abcdef".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");//从97到102
        }

        //8.int indexOf(String str)
        //找到某个子字符串str 在当前字符串第一次出现的索引（下标）
        System.out.println("lbb love zky".indexOf("zky"));//注意，括号里的是子字符串

        //9.判断某个字符串是否为空 boolean isEmpty()
        String s = "";//注意不是null否则会出现空指针异常
        System.out.println(s.isEmpty());

        //10 int length();
        //面试题：判断数组长度和判断字符串长度不一样
        //数组长度是一个属性.length，字符串长度是一个方法.length()
        System.out.println("abc".length());

        //11 lastIndexOf(String str)
        //判断某个子字符串在当前字符串中最后一次出现的索引（下标）
        System.out.println("oraclejavac++javac#".lastIndexOf("java"));

        //12 String replace(char oldChar, char newChar)
        System.out.println("lbb".replace('l', 'c'));//只能替换字符

        //String replace(CharSequences target, CharSequence replacement)
        String newString = "lbb love zky".replace("lbb", "lbbs");
        String newString1 = "name=zhangsan&password=123&age=20".replace("=", ":");
        System.out.println(newString1);

        //13 Stringp[] split(String regex)拆分比较重要
        String[] ymd = "1992-11-26".split("-");//以-符号进行拆分,并且返回的是一个String数组
        for (int i = 0; i < ymd.length; i++) {
            System.out.println(ymd[i]);
        }

        //14 boolean startsWith(String prefix) 是否以prefix开始
        System.out.println("lbb".startsWith("l"));
        System.out.println("lbb".startsWith("c"));

        //15 String substring(int beginIndex,int endIndex) 截取字符串
        System.out.println("lbb love zky".substring(4, 8));//左闭右开，不包含8号所以是love不带空格【4，8）

        //16 char[] toCharArray()
        char[] chars = "zky是猪宝宝".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        //17 String toLowerCase() toUpperCase()
        System.out.println("ABCD".toLowerCase());
        System.out.println("abcd".toUpperCase());

        //18 去除空白 String trim();去除的是前后的空白
        System.out.println("          hello         world           ".trim());

        //19唯一的静态方法 valueOf()
        //将非字符串转换成字符串
        //valueOf实际上调用的是toString方法
        String s1 = String.valueOf(true);
        System.out.println(s1);//这个就是字符串的true不是布尔类型了~

        String s2 = String.valueOf(new Customer());//对一个对象valueof就是调用这个对象的toString，然后因为Customer没重写toString输出的是类@地址的形式
        System.out.println(s2);
        //同样println调用的就是string.valueOf()然后再输出的，可以从源代码看出来
        //实际上打印在控制台上的全都是字符串
        /*
        if (getClass() == PrintStream.class) {
            writeln(String.valueOf(x));
        }
        */
    }
}

class Customer{}
