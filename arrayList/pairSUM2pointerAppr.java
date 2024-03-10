package arrayList;

import java.util.ArrayList;

public class pairSUM2pointerAppr {
    public static boolean pairSum1(ArrayList<Integer>List, int target){
        int LP = 0;
        int RP = List.size()-1;
        
        while(LP!=RP){
             //case 1
            if(List.get(LP)+List.get(RP) == target){
                return true;
            }
            //case2
            if(List.get(LP)+ List.get(RP) < target){
                LP++;
          }else{
            //case3
              RP--;
           }  
        }
         return false; 
}
    public static void main(String[] args) {
         ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);

        int target = 70;
        System.out.println(pairSum1(List, target));
        
    }
    
}
