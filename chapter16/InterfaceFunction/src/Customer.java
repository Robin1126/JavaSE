public class Customer {
    //Customer has a Menu
    //以后凡是能用has a xxx来描述的，xxx用实例属性来描述
    //声明一个属性Menu
    private Menu menu; //引用数据类型 Menu是interface也是一种引用数据类型
    //为什么不写cooker类型，是因为写了以后customer就和cooker绑定了，比如就只能吃中国师傅或美国师傅做的菜了
    //但是顾客如果持有的是以一个接口，就不用直接和另外的cooker类绑定，而是通过接口去联系
    //任何一个厨师都可以去实现这个menu，这样customer也就可以吃到不同厨师做的饭菜了
    //menu要是要指向的话肯定是跟对象有关的
    //想象一下，customer是一个主板，上面有个插槽叫menu，cooker是能插到这个插槽的具体显卡
    //又假设鸟有一个插槽翅膀，然后金色翅膀，银色翅膀都能够安到这个插槽上面，鸟如果想换翅膀，就直接传入不同的参数进去就可以了，但是都是wing类型

    public Customer() {
    }

    public Customer(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void order() {
        Menu menu = this.getMenu(); //拿到菜单
        menu.chaoJiDan();
        menu.yuXiangRouSi();
    }
}
