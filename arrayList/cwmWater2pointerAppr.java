package arrayList;

import java.util.ArrayList;

public class cwmWater2pointerAppr {
    public static int storeWater(ArrayList<Integer>height){
        int maxWater= 0;
        int LP= 0; 
        int RP= height.size()-1;

        while(LP<RP){
            //calculating water area
            int ht = Math.min(height.get(LP), height.get(RP));
            int width = RP-LP;
            int currWater= ht* width;
            maxWater = Math.max(maxWater, currWater);

            //update pointer
            if(height.get(LP)<height.get(RP)){
                LP++;
            }else{
                RP--;
            }
        }
        return maxWater;

        }
     public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }

    
}
