package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{
    List<Item> list = new ArrayList<>();

    public void addItem(Item item){
        list.add(item);
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(int i=0; i<list.size(); i++){
            System.out.println("상품명: "+list.get(i).getName());
        }
        System.out.println("전체가격 합: ");


    }



}
