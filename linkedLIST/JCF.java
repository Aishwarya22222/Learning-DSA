package linkedLIST;
import java.util.LinkedList;

public class JCF { // java collections framework
    public static void main(String[] args) {
        //create
        LinkedList<Integer> LL = new LinkedList<>();

        //add

        LL.addLast(1);
        LL.addLast(2);
        LL.addFirst(0);

        System.out.println(LL);

        // remove
        LL.removeLast();
        System.out.println(LL);
    }
    
}
