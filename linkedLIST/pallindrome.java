package linkedLIST;

public class pallindrome {
    public static class Node{
        int data;
        Node next;

        //constructor create
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head;
    public static Node tail;


    //addFirst
    public void addFirst(int data){
        //create a new node
        Node newNode = new Node(data);
        if (head == null){
            head=tail=newNode;
            return;

        }
        // newnode's next = head
        newNode.next = head;

        //head = newNode
        head = newNode;


    }

    //printing output

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ->");
            temp = temp.next;

            
        }
        System.out.println("null");

    }
    //slow-fast approach 
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2

        }
        return slow; // mid
    }

    public boolean checkPallindrome(){
        // base case
        if(head == null || head.next == null){
            return true;
        }
        // find midNode
        Node midNode = findMid(head);
        // 2nd half reverse
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // check 1st == 2nd half
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            right = right.next;
            left = left.next;
            
        }
        return true;
    }



    public static void main(String[] args) {
        pallindrome LL = new pallindrome();
        LL.addFirst(1);
        LL.addFirst(2);
        LL.addFirst(2);
        // LL.addFirst(1);
        LL.print();
        System.out.println(LL.checkPallindrome());

        
    }
    
}
