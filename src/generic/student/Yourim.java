package generic.student;

public class Yourim extends Student{
    public Yourim(String name, int age, double avgGrade) {
        super(name, age, avgGrade);
    }

    @Override
    public void major(){
        System.out.println("응용물리학과");
    }
}
