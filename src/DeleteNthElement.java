class Node5 {
    int data;
    Node5 next;

    Node5(int data) {
        this.data = data;
        this.next = null;
    }
}
 class DeleteNthElement {
    static Node5 deleteElement(Node5 head,int n ) {
        Node5 dummy = new Node5(0);
        dummy.next = head;
        Node5 fast = dummy;
        Node5 slow = dummy;
        for (int i = 0; i <= n; i++) {
            if (fast == null)
                return head;
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return dummy.next;
    }


        static void printList(Node5 head){
        Node5 temp = head;
        while (temp != null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
            System.out.println(" ");

        }

     public static void main(String[] args) {
         Node5 head = new Node5(1);
         head.next = new Node5(2);
         head .next.next= new Node5(3);
         head.next.next.next=new Node5(4);
         System.out.println("solved programming list ");
         printList(head);
         head=deleteElement(head,3);
         System.out.println("After deletion:");
         printList(head);
     }

    }
