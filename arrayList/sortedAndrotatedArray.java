package arrayList;

import java.util.ArrayList;

public class sortedAndrotatedArray {
    public static boolean pairSum2(ArrayList<Integer> List, int target ){
        int bp= -1;
        int n = List.size();
        for(int i= 0; i< n; i++){
            if(List.get(i)>List.get(i+1)){
                bp = i;
                break;
            }
        }
        int LP = bp+1;
        int RP = bp;
        while(LP!=RP){
            if(List.get(LP)+List.get(RP)==target){
                return true;
            }
            if(List.get(LP)+List.get(RP)<target){
                LP=(LP+1)% n;
            }else{
                RP=(n+RP-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(11);
        List.add(15);
        List.add(6);
        List.add(7);
        List.add(8);
        List.add(9);

        int target =90;
        System.out.println(pairSum2(List, target));

    }
    
}
