package collection.set.test;
import java.util.*;

public class UniqueNameTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for(Integer s : inputArr){
            linkedHashSet.add(s);
        }
        for(Integer s : linkedHashSet){
            System.out.println(s);
        }
    }

    /*
    배열을 리스트로 변환하기
    List<Integer> list = Arrays.asList(inputArr);
    List<Integer> list = List.of(inputArr);

    편리한 리스트 생성
    List<Integer> list = Arrays.asList(1,2,3);
    List<Integer> list = List.of(1,2,3);
     */

}
