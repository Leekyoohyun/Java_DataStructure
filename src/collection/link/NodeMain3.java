package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("nodeA");
        first.next = new Node("nodeB");
        first.next.next = new Node("nodeC");

        System.out.println(first);

        //모든 노드 탐색
        System.out.println("모든 노드 탐색");
        printAll(first);

        //마지막 노드 조회
        Node lastNode = getLastNode(first);
        System.out.println("마지막 노드 = "+lastNode);

        //특정 index의 노드 조회
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index 2의 노드 = "+index2Node);

        //데이터 추가하기(마지막에 계속 추가하기)
        add(first,"nodeD");
        System.out.println("nodeD 추가 후 = "+first);
        add(first,"nodeE");
        System.out.println("nodeE 추가 후 = "+first);
        add(first,"nodeF");
        System.out.println("nodeF 추가 후 = "+first);
        add(first,"nodeG");
        System.out.println("nodeG 추가 후 = "+first);

    }
    private static void printAll(Node node){
        Node x = node;
        while (x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node){
        Node x = node;
        while (x.next != null){
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node node, int index){
        Node x = node;
        for(int i=0; i< index; i++){
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String param){
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }

}
