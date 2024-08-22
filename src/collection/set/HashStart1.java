package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray 현황: "+Arrays.toString(inputArray));

        int searchValue = 8;

        //4번 반복 O(n)
        for(Integer inputValue : inputArray){
            if(inputValue == searchValue){
                System.out.println("찾는 값: "+inputValue);
            }
        }

        // 값 찾으려면 배열 싹다 다 뒤져야함
    }
}
