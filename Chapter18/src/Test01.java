import java.util.Objects;

/*
    Objects类中的toString()方法
    1.源代码返回值
         return getClass().getName() + '@' + Integer.toHexString(hashCode())
         类名@对象内存地址的16进制形式

    2.toString()方法是干什么的
        可以将一个对象，转换成为字符串的表现形式 Returns a string representation of the object.

    3. sun公司建议大家的子类都去重写这个方法 override,这样能更好的看到这对象的具体信息
        重写的方向越简洁越好，易读性要好，详实。
 */
public class Test01 {
    public static void main(String[] args) {
        Mytime mt = new Mytime(1992,11,26);
        System.out.println(mt.toString());
        System.out.println(mt);//默认也是调用to.String()
        //因为print()中有public static String valueOF(Object obj) {return(Obj == null)? null : obj.toString() }

        Student student = new Student(54684,"LBB",171.5);
        System.out.println(student);
    }
}
class Mytime {
    int year;
    int month;
    int day;

    public Mytime() {
    }

    public Mytime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) { //地址相同，代表同一个对象
            return true;
        }
        if (obj instanceof Mytime){
            Mytime mt = (Mytime) obj; //向下转型判断
            return (this.getYear() ==  mt.getYear() && this.getMonth() == mt.getMonth() && this.getDay() == mt.getDay() );
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Mytime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

class Student {
    private int ID;
    private String name;
    private double height;

    public Student() {
    }

    public Student(int ID, String name, double height) {
        this.ID = ID;
        this.name = name;
        this.height = height;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ID == student.ID && Double.compare(student.height, height) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}

