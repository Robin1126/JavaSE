/*
    初步体验了一下接口的使用
 */
public class InterfaceTest {
    public static void main(String[] args) {
        Wing wing = new BronzeWing();
        Bird b1 = new Bird("lbb","gold",wing);
        b1.fly();
    }
}
class Bird {
    private String name;
    private String color;
    private Wing wing;

    public Bird() {
    }

    public Bird(String name, String color, Wing wing) {
        this.name = name;
        this.color = color;
        this.wing = wing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }
    public void fly(){
        System.out.print(this.color + "色的"+ this.name + "正在");
        getWing().fly(); //这里就是bird是调用了wing接口
    }
}

interface Wing {
    void fly();
}

class GoldWing implements Wing { //GoldWing实现了Wing接口
    @Override
    public void fly() {
        System.out.println("用金翅膀飞翔！");
    }
}
class SilverWing implements Wing {
    @Override
    public void fly() {
        System.out.println("用银翅膀飞翔！");
    }
}
class BronzeWing implements Wing {
    @Override
    public void fly() {
        System.out.println("用铜翅膀飞翔！");
    }
}


