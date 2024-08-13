package generic.exForStudent;

import generic.student.Kyoo;
import generic.student.Student;
import generic.student.Yourim;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("학생",0,0);
        Kyoo kyoo = new Kyoo("이규현", 27, 3.85);
        Yourim yourim = new Yourim("고유림", 23, 4.5);

        Box<Kyoo> kyooBox = new Box<>();
        kyooBox.setValue(kyoo);
        Kyoo findKyoo = kyooBox.getValue();
        System.out.println("findKyoo = "+findKyoo);

        Box<Yourim> youBox = new Box<>();
        youBox.setValue(yourim);
        Yourim findYou = youBox.getValue();
        System.out.println("findYou = "+findYou);

        Box<Student> studentBox = new Box<>();
        studentBox.setValue(student);
        Student findStu = studentBox.getValue();
        System.out.println("findStu = "+findStu);

    }
}
