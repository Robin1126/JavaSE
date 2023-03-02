package de.tuilmenau.javase.array.hotel;
/*
    二维数组模拟大厦
 */
public class Hotel {
    private Room[][] rooms;
    //盖楼用构造方法

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    public Hotel() {
        //一共有基层，每层的房间类型有什么，每个房间编号是什么
        rooms = new Room[3][10];
        for (int i = 0; i < getRooms().length; i++) {
            for (int j = 0; j < getRooms()[i].length; j++) {
                if(i == 0) {
                   rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间 ", true);
                }
                if(i == 1) {
                    rooms[i][j] = new Room((i + 1 ) * 100 + j + 1, "双人间 ", true);
                }
                if(i == 2) {
                    rooms[i][j] = new Room((i + 1 ) * 100 + j + 1, "总统套房", true);
                }
            }
        }
    }
    public void print(){
        for (int i = 0; i < getRooms().length; i++) {
            for (int j = 0; j < getRooms()[i].length; j++) {
                Room room = rooms[i][j];
                System.out.print(room + " ");
            }
            System.out.println();
        }
    }
    //订房
    public void order(int roomNo){
        //room的status修改为false
        //先获取对象再修改
        Room room = rooms[roomNo / 100][roomNo % 100 -1];
        room.setStatus(false);
    }

    public void exit(int roomNo){
        Room room = rooms[roomNo / 100][roomNo % 100 -1];
        room.setStatus(true);
    }
}
