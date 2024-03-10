package arrayList;

import java.util.ArrayList;

public class swap2numbers {
    public static void swap(ArrayList<Integer>List, int idx1, int idx2){
        //swap
        int temp = List.get(idx1);
        List.set(idx1,List.get(idx2));
        List.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>List = new ArrayList<>();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(6);
        List.add(3);
        List.add(7);

        int idx1=3; int idx2=5;
        System.out.println(List);
        swap(List, idx1, idx2);
        System.out.println(List);
        
    }
    
}
