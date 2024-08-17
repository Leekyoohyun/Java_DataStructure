package collection.myArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        MyArray arr = new MyArray();
        Scanner input = new Scanner(System.in);
        for(int i=0; i<arr.arr.length;i++){
            System.out.println("write the food you want");
            String a = input.next();
            arr.addFirst(a);
        }
        System.out.println(Arrays.toString(arr.arr));
    }
}
