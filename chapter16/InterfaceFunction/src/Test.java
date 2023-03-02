public class Test {
    public static void main(String[] args) {
        Menu cc = new ChinaCooker();
        Customer customer = new Customer(cc);
        customer.order(); //厨师具体实现了接口,实际上厨师已经成为了一个个menu

        Menu ac = new AmericanCooker();
        customer.setMenu(ac);
        customer.order();

    }
}
