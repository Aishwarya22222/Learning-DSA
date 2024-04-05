package sorting;
import java.util.*;

public class inbuiltsort {
    //For ascending order
    /* 
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        //sort the array in ascending order
        Arrays.sort(arr);
        //print the sorted array
        System.out.print("Sorted numbers in ascending order: ");
        for(int num : arr){
            System.out.print( num + " ");
        }
        
    }
    */

    //For descending order
    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};
        //sort the array in decending order
        Arrays.sort(arr,Collections.reverseOrder());
        //print the sorted array
        System.out.print("Sorted numbers in descending order: ");
        for(int num : arr){
            System.out.print(num +" ");
        }
    }

    
}
