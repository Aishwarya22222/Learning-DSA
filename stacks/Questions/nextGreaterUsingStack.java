package stacks.Questions;

import java.util.*;

public class nextGreaterUsingStack {
    public static void main(String[]args){
        int arr[] = { 2,5,2,8,0,2,6,7};
        Stack <Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];
        
        for(int i=arr.length-1; i>=0; i-- ){
            //1st step:while loop
            while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
                s.pop();
            }
            // 2nd step: if-else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            } else{
                nextGreater[i] = arr[s.peek()];
                
            }

            //3rd step: push
            s.push(i);
        }
        for(int i = 0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
    
}

// next Greater Right(solved)
// next Greater Left
// next Smaller Right
// next smaller Left
