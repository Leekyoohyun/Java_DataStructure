package collection.myLink;

public class NodeMain {
    public static void main(String[] args) {
        Node node = new Node("FootBall");
        node.next = new Node("Swimming");
        node.next.next = new Node("TableTennis");

        System.out.println(node.toString());
    }
}
