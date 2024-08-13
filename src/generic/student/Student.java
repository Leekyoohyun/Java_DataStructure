package generic.student;

public class Student <T> {
    private String name;
    private Integer age;
    private double avgGrade;

    public Student(String name, int age, double avgGrade) {
        this.name = name;
        this.age = age;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void major(){
        System.out.println("전공");
    }

    @Override
    public String toString(){
        return name+ " "+age+ " "+ avgGrade;
    }
}
