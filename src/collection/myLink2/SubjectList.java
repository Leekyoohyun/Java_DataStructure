package collection.myLink2;

import java.time.Period;

public class SubjectList {
    private Node first;
    private int size = 0;

    public void add(Object e){
        Node newNode = new Node(e);
        if(first == null) {
            first = newNode;
        }else{
            Node lastNode = getLastNode(); //생성
            lastNode.next = newNode;
        }
        size++;
    }
    public void add(int index, Object e){
        //특정 위치에 추가할거임
        Node newNode = new Node(e);
        if(index == 0){
            newNode.next = first;
            first = newNode;
        }else{
            Node prev = getNode(index -1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;

    }

    public Node getLastNode(){
        Node x = first;
        while(x.next != null){
            x =x.next;
        }
        return x;
    }


    public Object remove(int index){
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if(index == 0){
            first = removeNode.next;
        }else{
            Node prev = getNode(index-1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size --;
        return removedItem;
    }

    public Node getNode(int index){
        Node x = first;
        for(int i=0; i<index;i++){
            x = x.next;
        }
        return x;
    }

    @Override
    public String toString() {
        return "SubjectList{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }


}
