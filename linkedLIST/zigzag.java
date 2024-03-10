package linkedLIST;

public class zigzag {
    public static class Node{
        int data;
        Node next;

        // constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public int size;

    //add First
    public void addFirst(int data){
        //create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        // newNodes next = head
        newNode.next = head;

        //head = newNode
        head = newNode;

    }

    // add last
    public void addLast(int data){
        //create a new node
        Node newNode = new Node(data);
        size++;
        if (head==null){
            head = tail = newNode;
            return;
        }
        //tail.next = newNode
        tail.next = newNode;

        // head = newnode
        tail = newNode;

    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void zigZag(){
        //mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //2nd part reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;


        //zigzag function
        Node nextL, nextR;
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
    
            left = nextL ;
            right = nextR;

        }
       
    }
    public static void main(String[] args) {
        zigzag ll = new zigzag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addFirst(0);
        ll.addLast(6);

        ll.print();
        System.out.println("size of a linkedlist is : " + ll.size);

        ll.zigZag();
        ll.print();
        
    }
    
}
