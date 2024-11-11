package arrayList.array_1st;

import java.util.*;

public class ArrayMethodTest {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[1]= 1;

        System.out.println(Arrays.toString(arr));

        List<Integer> arr1 = new ArrayList<>();
        arr1.addFirst(10);
        arr1.add(1,20);
        arr1.add(2,30);// 추가할때마다 grow 메소드 쓰겠네.
        arr1.addLast(60);

        System.out.println(arr1);
        System.out.println(arr1.toArray().length);
    }
}
