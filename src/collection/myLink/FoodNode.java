package collection.myLink;

public class FoodNode {
    Object item;
    FoodNode next;

    public FoodNode(Object item){
        this.item = item;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        FoodNode x = this;
        sb.append("[");
        while (x != null){
            sb.append(x.item);
            if(x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");

        return sb.toString();
    }
}
