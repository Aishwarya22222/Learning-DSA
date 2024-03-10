package arrays;

public class trapping_rainWATER {
    public static int trappedRainWater (int height[]){
        // calculate left max boundary- array
        int n= height.length;
        int leftMax[] = new int [n];
        leftMax[0]= height[0];
        for(int i=1; i<n; i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        // calculate right max boundary- array
        int rightMax[] =new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2; i>0; i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
            
        }
        //loop
        int trappedRainWater=0;
        for(int i=0; i<n; i++){
            //waterlevel = min(leftmax boundary, rightmax boundary)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trapped water = water level -height[i]
            trappedRainWater+= waterLevel-height[i];


        }
        return trappedRainWater;
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));

        
    }
    
}
