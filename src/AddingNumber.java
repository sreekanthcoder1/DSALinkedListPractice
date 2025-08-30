class Node1{
    int data;
    Node1 next;

            Node1(int data){
        this.data=data;
        this.next=null;
            }

}
public class AddingNumber {
  static   void  Add(Node1 head){
        while (head != null){
            System.out.print(head.data);

            if(head.next != null)
                System.out.print("->");
                head=head.next;

        }
    }

    public static void main(String[] args) {
      Node1 head = new Node1(20);
      head.next=new Node1(40);
      head.next.next=new Node1(60);
      head.next.next.next = new Node1(80);
Add(head);
    }
}
