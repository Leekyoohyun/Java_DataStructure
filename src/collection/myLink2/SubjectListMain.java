package collection.myLink2;

public class SubjectListMain {
    public static void main(String[] args) {
        SubjectList list = new SubjectList();
        list.add("Physics");
        list.add("Biology");
        list.add("CS");
        list.add("Math");
        list.remove(1);
        list.add(1,"Biology");



        System.out.println(list);
    }
}
