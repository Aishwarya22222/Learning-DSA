package stacks.Questions;

import java.util.Stack;

public class maxAreaInHistogram {
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsRight[] = new int[arr.length];
        int nsLeft[] = new  int[arr.length];

        // nextSmallerRight
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                nsRight[i] = arr.length;

            } else{
                nsRight[i]  = s.peek();
            }
            s.push(i);
        }

        //nextSmallerLeft
         s = new Stack<>();

        for(int i = 0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                nsLeft[i] = -1;

            } else{
                nsLeft[i]  = s.peek();
            }
            s.push(i);
        }

        //current area : width = nsRight[i]-nsLeft[i]-1
        for(int i=0; i<arr.length; i++){
            int height = arr.length;
            int width = nsRight[i]-nsLeft[i]-1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("max area in histogram is : " + maxArea);

    }
    public static void main(String[] args) {
        int arr[] = {2,4};
        maxArea(arr);
    }
    
}
