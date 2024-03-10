package linkedLIST;

public class linkedlist {
    // we will be creating a class
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
        public int Size;


    // methtods
    //addFirst
    public void addFirst(int data){
        // 1st step-create a new node
        Node newNode = new Node(data);
        Size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //2nd step-newNode's next = head
        newNode.next = head; //link
        //3rd step- head = newNode
        head = newNode;
    }

    //addLast
    public void addLast(int data){
        Node newNode  = new Node(data);
        Size++;
        if(head == null){
            head = tail = newNode; 
            return;
        }
        tail.next = newNode; // link
        tail = newNode;
    }

    //printing output
    
    public void print(){
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + "->" );
            temp = temp.next;
            
            
        }
        System.out.println("null");

    }

    // randomly adding value
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
            
        }
        Node newNode= new Node(data);
        Size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp= temp.next;
            i++;
        }
        //main work - temp=previous
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //removeFirst
    public int removeFirst(){
        if(Size == 0){
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }else if(Size == 1){
            int val = head.data;
            Size = 1;
            head = tail = null;
            return val;
        }
        int val = head.data;
        Size--;
        head = head.next;
        return val;  
    }

    // removeLast
    public int removeLast(){
        if(Size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(Size == 1){
            int val = head.data;
            head = tail = null;
            Size = 0;
            return val;
        }
        Node prev = head;
        for(int i = 0; i<Size-2; i++){
            prev = prev.next;
        }
        int val=prev.next.data;
        prev.next = null;
        Size--;
        return val;
    }

    // finding key position using Iterative Search
    public int itrSearch(int key){
        Node temp = head;
        int i =0;
        while(temp != null){
            if( temp.data == key){ //key found case
                return i;
            }
            temp = temp.next;
            i++;
            }
            return -1; 
    }
    // recursive  Search
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
            if(idx == -1){
                return -1;
            }
            return idx+1;
        }
    public int recSearch(int key){
        return helper(head, key);

    }
    //  reverse linkedlist(iterative approach)
    public void reverse(){
        Node prev = null;
        Node curr = tail= head;
        Node next ;
        while(curr!=null){
            next = curr.next;
            curr.next = prev; //reverse
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // remove nth node from end
    public void delNthfromEnd(int n){
        //calculating size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        
        //base case
        if(n == sz){
            head = head.next;
            return;
        }

        //size-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        linkedlist LL = new linkedlist();
        LL.print();
        LL.addFirst(2);
        LL.print();
        LL.addFirst(1);
        LL.print();
        LL.addLast(3);
        LL.print();
        LL.addLast(4);
        LL.add(3, 9);
        LL.add(4, 6);
        LL.add(3, 7);
        LL.print();
         
        LL.removeFirst();
        LL.print();
        LL.removeLast();
        LL.print();
        System.out.println("Size of a linkedlist = " + LL.Size);
        System.out.println("Key found : "+LL.itrSearch(9));
        System.out.println(" "+LL.itrSearch(10));
        System.out.println("Key found at idx : "+LL.recSearch(2));
        System.out.println(LL.recSearch(10));
        LL.reverse();
        LL.print();
        LL.delNthfromEnd(2);
        LL.print();

        
    }

    
}
