/*
    String比较的时候要用equals方法比较~不要用==号
 */
public class Test04 {
    public static void main(String[] args) {
        Trainee t1 = new Trainee(50,new String("建国路小学"));
        Trainee t2 = new Trainee(50,"建国路小学");
        Trainee t3 = new Trainee(40,"和平路小学");
        Trainee t4 = new Trainee(50,"和平路小学");

        System.out.println(t1.toString());
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
        System.out.println(t2.equals(t4));
        System.out.println(t3.equals(t4));
    }
}

class Trainee {
    int no;
    String school;

    public Trainee() {
    }

    public Trainee(int no, String school) {
        this.no = no;
        this.school = school;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    //重写toString()


    @Override
    public String toString() {
        return "Trainee{" +
                "no=" + no +
                ", school='" + school + '\'' +
                '}';
    }

    //重写equals()
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj == this) return true;
        if(obj instanceof Trainee){
            Trainee trainee = (Trainee) obj;
            return (no == trainee.no && school.equals(trainee.school));
        }else {
            return false;
        }
    }
}

