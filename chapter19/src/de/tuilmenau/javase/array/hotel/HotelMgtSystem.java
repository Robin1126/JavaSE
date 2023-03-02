package de.tuilmenau.javase.array.hotel;

/*第二题：（java软件工程师人生路上第一个小型项目。锻炼一下面向对象。）
        为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
        1、该系统的用户是：酒店前台。
        2、酒店使用一个二维数组来模拟。“Room[][] rooms;”
        3、酒店中的每一个房间应该是一个java对象：Room
        4、每一个房间Room应该有：房间编号、房间类型、房间是否空闲.
        5、系统应该对外提供的功能：
        可以预定房间：用户输入房间编号，订房。
        可以退房：用户输入房间编号，退房。
        可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。

        注意！只要是新建的类，都要有构造方法，getter and setter, 重写toString, equals方法
        */
public class HotelMgtSystem {
    public static void main(String[] args) {
        //剩下的就是用户交互界面了
    }
}

class Room{
    private int no;
    private String type;
    private boolean status;

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //要重写toString
    public String toString() {
        return "[" + no + "," + type + "," + (isStatus() ? "空闲" : "占用") + "]";
    }

    public boolean equals(Object obj){ //假设传过来一个对象，和当前房间对象进行比较
        if(obj == null || !(obj instanceof Room)) return false;
        if(this == obj) return true;
        Room room = (Room)obj;
        return this.getNo() == room.getNo();
    }
}


