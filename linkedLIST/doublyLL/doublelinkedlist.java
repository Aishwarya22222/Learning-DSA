package linkedLIST.doublyLL;

public class doublelinkedlist {
    public class Node{
        int data;
        Node next;
        Node prev;

        //constructor
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;


        }
    }
    public static Node head;
    public static Node tail;
    public int size;
  // add (addFirst)
    public void addFirst(int data){
        //create a node
        Node newNode = new Node(data);
        size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        // add(addLast)
        public void addLast(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return; 
            }
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            return; 

        }

        //remove first
        public int removeFirst(){
            if(head == null){
                System.out.println("Dll is empty");
                return Integer.MIN_VALUE;
            }
            if(size == 1 ){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            int val = head.data;
            head = head.next;
            head.prev = null;
            size --;
            return val;

        }

        //remove last
        public int removeLast(){
            if(head == null){
                System.out.println(" Dll is empty");
                return Integer.MIN_VALUE;
            }
            if(size == 1){
                int val = head.data;
                head = tail = null;
                size --;
                return val;
            }
            int val = tail.data;
            tail = tail.prev;
            tail.next = null;
            size --;
            return val;


        }

        //print method create
        public void print(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + "<->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        //reverse a doublyLinkedList
        public void reverse(){
            Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr =next;

        }
        head = prev;
        
        }
    public static void main(String[] args) {
        doublelinkedlist Dll = new doublelinkedlist();
        Dll.addFirst(3);
        Dll.addFirst(5);
        Dll.addFirst(2);
        Dll.addLast(1);
        Dll.addLast(7);
        Dll.print();
        
        Dll.removeFirst();
        Dll.print();
        Dll.removeLast();
        Dll.print();
        System.out.println(" size of an doubly linkedlist is: "+Dll.size );

        Dll.reverse();
        Dll.print();

        
    }
    
}
