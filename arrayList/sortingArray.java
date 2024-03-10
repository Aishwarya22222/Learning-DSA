package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sortingArray {
    public static void main(String[] args) {
        ArrayList<Integer>List = new ArrayList<>();
        List.add(1);
        List.add(3);
        List.add(7);
        List.add(5);
        List.add(4);

        System.err.println(List);
        Collections.sort(List); //ascending order
        System.out.println(List);
        Collections.sort(List, Collections.reverseOrder()); //descending order
        System.out.println(List);

    }
    
}
