package recursion.DIvideandConquerAlgorithm;

public class searchInRotatedSortedArray {
    public static int search(int arr[],int tar, int si, int ei){
        //base case
        if(si>ei){
            return -1;
        }

        //mid find
        int mid = si+(ei-si)/2;

        //case found
        if(arr[mid] == tar){
            return mid;
        }

        // case 1: mid on L1
        if(arr[si]<=arr[mid]){

        // case a : left part
        if(arr[si]<=tar && tar<=mid){
            return search(arr, tar, si, mid+1);
        } else{
        //case b: right part
            return search(arr, tar, mid-1, ei);
        }
        
        // case 2: mid on L2
       } else {
        if(arr[mid]<=tar && tar<=arr[ei]){
            return search(arr, tar, mid-1, ei);
        } else{
            return search(arr, tar, si, mid+1);
        }
       }

        
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int tarind = search(arr, target, 0, arr.length-1);
        System.out.println(tarind);
    }
} 
