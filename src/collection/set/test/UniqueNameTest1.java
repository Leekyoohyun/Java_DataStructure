package collection.set.test;
import java.util.*;

public class UniqueNameTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        Set<Integer> set = new HashSet<>(); //HashSet을 사용하면 중복 데이터는 저장되지 않는다.
        for(Integer s : inputArr){          // HashSet은 순서를 보장하지 않는다.
            set.add(s);
        }
        for(Integer s : set){
            System.out.println(s);
        }
    }
}
