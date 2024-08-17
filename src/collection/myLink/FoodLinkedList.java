package collection.myLink;

public class FoodLinkedList {
    private FoodNode head;
    private int size = 0;

    public void add(Object e){
        FoodNode newNode = new FoodNode(e);
        if(head == null){
            head = newNode;
        }else{
            FoodNode lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    public FoodNode getLastNode(){
        FoodNode x = head;
        while (x.next != null){
            x= x.next;
        }
        return x;
    }

    public void add(int index, Object e){
        FoodNode newNode = new FoodNode(e);
        if(index == 0){
            newNode.next = head;
            head = newNode;
        }else{
            FoodNode prevNode = getNode(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }

    public Object set(int index, Object element){
        FoodNode x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public Object get(int index){
        FoodNode node = getNode(index);
        return node.item;
    }

    public FoodNode getNode(int index){
        FoodNode x = head;
        for(int i=0; i< index; i++){
            x = x.next;
        }
        return x;
    }
}
