package collection.set.test;
import java.util.*;

public class UniqueNameTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        TreeSet<Integer> tree = new TreeSet<>();
        for(Integer s : inputArr){
            tree.add(s);
        }
        for(Integer s : tree){
            System.out.println(s);
        }
    }

}
