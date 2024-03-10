package linkedLIST;

public class loopExists {
    public static class Node{
        int data;
        Node next;

        //constructure
        public Node(int data){
            this.data = data;
            this.next = null;
    }
    

    }
    public static Node head;
    public static Node tail;

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){ //cycle or loop exists
                return true;
            }

        }
         return false; // does not exists

    }

    // removing cycle in linkedlist
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast ){
                cycle = true;
                break;

            }
        }
        if(cycle == false)
        return;

        // finding meeting point
        slow = head;
        Node prev = null; //last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
           
            
        }

        // removing cycle
        prev.next = null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node( 2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        
    }
    
}
