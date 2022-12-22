package zajavka._warsztaty.w1.genericsQuiz.p4;

public class Student extends Person{
    public static <P extends Person> void print(P p){
        System.out.println(p.getName());
    }

    public static void main(String[] args) {
        Student.print(new Person());
        Student.print(new Student());
        Student.<Person>print(new Student());
//        Student.<Student>print(new Person());  //bad
        Student.<Student>print(new Student());
//        Student.<String>print(new Student());  //bad

    }
}
