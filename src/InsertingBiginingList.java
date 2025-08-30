import org.w3c.dom.ls.LSOutput;

class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data =data;
        Node3 nex =null;
    }
}
public class InsertingBiginingList {
    static Node3 inserBiginingList(Node3 head, int data) {
        Node3 newdata = new Node3(data);
        newdata.next = head;
        return newdata;

    }

    static void printList(Node3 head) {
        Node3 currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            if (currentNode.next != null){
                System.out.print("->");
        }
        currentNode = currentNode.next;
    }
        System.out.println();


}
    public static void main(String[] args) {
        Node3 head = new Node3(2);
        head.next = new Node3(3);
        head.next.next = new Node3(4);
        head.next.next = new Node3(5);

        int data =1;
        head = inserBiginingList(head,data);
        printList(head);
    }
    }