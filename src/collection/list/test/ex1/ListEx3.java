package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("n개의 정수 입력 ㄱㄱ(0 누르면종료)");
        while(true){
            int x = in.nextInt();
            if(x != 0){
                list.add(x);
            }
            int sum = 0;
            for(int i=0; i<list.size(); i++){
                sum += list.get(i);
            }
            double avg = (double)sum/list.size();

            if(x ==0){
                System.out.println("정수 합계: "+sum);
                System.out.println("정수 평균: "+(double)avg);
                break;
            }
        }
    }
}
