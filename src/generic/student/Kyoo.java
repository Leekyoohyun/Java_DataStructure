package generic.student;

public class Kyoo extends Student{
    public Kyoo(String name, int age, double avgGrade){
        super(name, age, avgGrade);
    }

    @Override
    public void major(){
        System.out.println("디자인대학");
    }
}
