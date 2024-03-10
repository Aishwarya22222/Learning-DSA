package arrayList;

import java.util.ArrayList;

public class maxArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>List = new ArrayList<>();
        List.add(2);
        List.add(5);
        List.add(7);
        List.add(8);
        List.add(9);

        //maximum arrayList
        int max = Integer.MIN_VALUE;
        for(int i=0; i<List.size(); i++){
        //     if(max<List.get(i)){
        //         max=List.get(i);
        //     }
        max=Math.max(max,List.get(i));
        }
        System.out.println("Maximum arrayList = "+ max);

        
    }
}   
    
