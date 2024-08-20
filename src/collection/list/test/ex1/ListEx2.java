package collection.list.test.ex1;
import java.util.*;

public class ListEx2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요(종료 0)");
        while(true){
            int x = in.nextInt();
            if(x != 0){
                list.add(x);
            }
            if(x == 0){
                for(int i=0; i<list.size(); i++){
                    System.out.print(list.get(i));
                    if(i != list.size()-1){
                        System.out.print(", ");
                    }
                }
                break;
            }
        }




    }
}
