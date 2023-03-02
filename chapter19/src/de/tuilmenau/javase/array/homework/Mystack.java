package de.tuilmenau.javase.array.homework;
/*第一题：
        编写程序，使用一维数组，模拟栈数据结构。
        要求：
        1、这个栈可以存储java中的任何引用类型的数据。使用Object数组
        2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。）
        3、在栈中提供pop方法模拟弹栈。（栈空了，也有有提示信息。）
        4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
        */
public class Mystack {
    //存到栈当中相当于存到数组中，我们选择Object数组是因为它可以存储任何的引用数据类型，比如Animal，Bird，String等等都可以
    private Object[] elements;
    private int index;//栈帧是一个数字标记

    public Mystack(int volume) {
        this.elements = new Object[volume];
        this.index = -1;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void push(Object object) {
        if (index >= getElements().length - 1) { //注意这里是减一
            System.out.println("栈已经满，压栈失败");
            return;
        }
        index++;
        getElements()[index] = object;
        System.out.println("压栈" + object + "成功，栈帧指向" + index);
    }

    public void pop() {
        if (index < 0) {
            System.out.println("栈为空，无法弹栈");
            return;
        }
        System.out.print("弹栈" + elements[index] + "成功");
        getElements()[index--] = null;
        System.out.println("栈帧指向：" + index);
    }
}
class Test{
    public static void main(String[] args) {
        Mystack ms = new Mystack(4);
        ms.push(new Object());
        ms.push(new Object());
        ms.push(new Object());
        ms.push(new Object());
        ms.push(new Object());
        ms.pop();
        ms.pop();
        ms.pop();
        ms.pop();
        ms.pop();
    }
}
