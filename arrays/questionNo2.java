package arrays;

public class questionNo2 {
    public static int rotatedSortedArray(int nums[], int target){
        int start= 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target)
            return mid;

        //check if the left side is sorted
        if(nums[start]<=nums[mid]){
            //check if target is within the ranger of left
            if(target>=nums[start] && target < nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
            
        }else{ //check if the right side is sorted
            if(target > nums[mid] && target <= nums[end]){
                start = mid+1;

            }else{
                end =mid-1;


            }

        }

        }
        return -1;
    }
    public static void main(String[]args){
        int nums[]={4,5,6,7,0,1,2,3};
        int target= 2;
        System.out.println("Index of " + target +": "+ rotatedSortedArray(nums, target));
    }
}
                           
    
    

