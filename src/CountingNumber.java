class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class CountingNumber {


    static int lengthFind(Node head) {
        int count = 0;
        Node curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }


    public static void main(String[] args) {
        Node head =new Node(1);
        head.next =new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        System.out.println(lengthFind(head));

    }
}
