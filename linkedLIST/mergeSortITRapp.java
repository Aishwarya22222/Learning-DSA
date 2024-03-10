package linkedLIST;

public class mergeSortITRapp {
    public static class Node{
        int data;
        Node next;

        // /constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public Node head;
    public static Node tail;

    // creating a methods to addFirst
    public void addFirst(int data){
        //create a new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        // new nodes next = head
        newNode.next = head;

        // head = newNode
        head = newNode;
    }
    // print methods create
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();

    }
     
    //get mid ko function create gareko(slow-fast approach)
    private Node getMid(Node head){
    Node slow = head;
    Node fast = head.next;  //1st half ko last data lai mid inintialize garna
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;


    }
    return slow;
}

// creating function for merge

private Node merge(Node head1, Node head2){ //head1 = left head and head2 = right head
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;
    
    while(head1 != null && head2 != null){
        if(head1.data <= head2.data ){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }else{
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;

        }

        
    }
     while( head1 != null){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;

     }
     while (head2 != null) {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
        
     }
     return mergedLL.next;

}
    public Node mergeSort(Node head){
        // base case
        if(head == null || head.next == null){
            return head;
        }
        // mid
        Node mid = getMid(head);
        // Lhead and Rhead ms
        Node Righthead = mid.next;
        mid. next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(Righthead);
        // merge
        return merge(newLeft, newRight);
    }
    public static void main(String[] args) {
        mergeSortITRapp LL = new mergeSortITRapp();
        LL.addFirst(1);
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addFirst(4);
        LL.addFirst(5);
        LL.print();

        LL.head = LL.mergeSort(LL.head);
        LL.print();
        
        
    }
    
}
