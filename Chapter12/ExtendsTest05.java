/*
	java当中的类默认继承Object，那么这个老祖宗给我们提供了哪些方法呢？
*/



/**

package java.lang;

import jdk.internal.vm.annotation.IntrinsicCandidate;


public class Object {

   
    @IntrinsicCandidate
    public Object() {}


    @IntrinsicCandidate
    public final native Class<?> getClass();

    
    @IntrinsicCandidate
    public native int hashCode();

    
    public boolean equals(Object obj) {
        return (this == obj);
    }

    
    
	 //已经有对象a如果想创造一个和a一样的对象，可以调用clone()方法
	 @IntrinsicCandidate
    protected native Object clone() throws CloneNotSupportedException;

    
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    
    @IntrinsicCandidate
    public final native void notify();

   
    @IntrinsicCandidate
    public final native void notifyAll();

   
    public final void wait() throws InterruptedException {
        wait(0L);
    }

   
    public final native void wait(long timeoutMillis) throws InterruptedException;

    
    public final void wait(long timeoutMillis, int nanos) throws InterruptedException {
        if (timeoutMillis < 0) {
            throw new IllegalArgumentException("timeoutMillis value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }

        if (nanos > 0 && timeoutMillis < Long.MAX_VALUE) {
            timeoutMillis++;
        }

        wait(timeoutMillis);
    }

   
    @Deprecated(since="9")
    protected void finalize() throws Throwable { }
}

//注意:当源码当中一个方法以;结尾，并且修饰符列表中有native关键字
//表示底层调用c++写的dll程序（dll动态链接库文件）

**/

public class ExtendsTest05 {
	public static void main(String[] args) {
		ExtendsTest05 et = new ExtendsTest05();
		
		String retValue = et.toString(); //不可以，它是实例方法，必须new对象才可以使用
		System.out.println(retValue); //ExtendsTest05@372f7a8d 一定有一个at符号
		//ExtendsTest05@372f7a8d 前面是类名，后面可以等同看作对象在堆内存当中的内存地址
		//实际是内存地址经过hash算法得出的十六进制结果
		
		Product pro = new Product();
		String retValue2 = pro.toString();
		System.out.println(retValue2); //Product@28a418fc
		System.out.println(pro); //Product@28a418fc
		//当直接输出引用的时候System.out.println(引用)，就相当于System.out.println(引用.toString())

		//System.out.println(pro.toString());
	}
}

class Product
{
}