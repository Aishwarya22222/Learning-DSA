package arrays;

public class binary_search {
    /* 
    public static int binarysearch(int numbers[], int key){
        int start=0, end=numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key=14;
        System.out.println("index for key is: " +binarysearch(numbers, key));
    }
    */
    
    // resverse array
    /* 
    public static void reverse(int numbers[]){
        int first=0, last=numbers.length-1;
        while(first< last){
          //swap
             int temp = numbers[last];
             numbers[last]= numbers[first];
             numbers[first]=temp;
             first ++;
             last --;
         }
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6};
        
        reverse(numbers);
        // print
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ "");
            
        }
        System.out.println();
    }
    */

    // pairs in an array
    /*
    public static void printPairs(int numbers[]){
        int totalpairs=0;
        for(int i=0; i<numbers.length; i++){
            int curr =numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr + ","+numbers[j]+ ")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs= "+totalpairs);

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printPairs(numbers);
    }
     */


     //print subarray
 
 /*     public static void printSubarray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end =j; 
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
      
     }
     public static void main(String[] args) {
        int numbers[]={ 2,4,6,8,10};
        printSubarray(numbers);
     }

     */
     


     //to print sum of sub arrays
     
     public static void sum_of_subarrays(int numbers[]){
        for(int i=0; i<numbers.length; i++){         
            for (int j=i; j<numbers.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum+=numbers[k];

                    System.out.print(numbers[k] +" ");
                }
                System.out.println("(sum is:"+sum +")");
               
            }
            System.out.println();
       
        }
        
     }
     public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        sum_of_subarrays(numbers);
     }
     

     // max subarray sum
      
    //  public static void maxSubarraySum(int numbers[]) {
    //     int maxSum = Integer.MIN_VALUE;
    //     int currSum = 0;
    
    //     for (int i = 0; i < numbers.length; i++) {
    //         int start = i;
    
    //         for (int j = i; j < numbers.length; j++) {
    //             int end = j;
    //             currSum = 0;
    
    //             for (int k = start; k <= end; k++) {
    //                 currSum += numbers[k];
    //             }
    
    //             System.out.println(currSum);
    
    //             if (maxSum < currSum) {
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
    
    //     System.out.println("max sum = " + maxSum);
    // }
    
    // public static void main(String[] args) {
    //     int numbers[] = {1, -2, 6, -1, 3};
    //     maxSubarraySum(numbers);
    // }
    


    //max subarray prefix sum
    /* 
    public static void maxSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[]= new int[numbers.length];

        prefix[0] =numbers[0];
        //calculate prefix array
        for (int i = 1; i < numbers.length; i++) {
            prefix[i]=prefix[i-1]+numbers[i];
        }
            for(int i=0; i<numbers.length; i++){
            for (int j = i; j < numbers.length; j++) {

                currSum = i == 0? prefix[j] : prefix[j]-prefix[i-1];
    
                // for (int k = start; k <= end; k++) {
                //     currSum += numbers[k];
                // }
    
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
    
        System.out.println("max sum = " + maxSum);
    }
    
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);
    }
    */
    
    // kadens algorithm//
    /*public static void kadens_algorithm(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<numbers.length; i++){
            maxSum= currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;

            }
            maxSum =Math.max(currSum, maxSum);
        }
        System.out.println("Our max subarray sum is: " +maxSum);


    }

    public static void main(String[] args) {
        int numbers[]={-2, -3, 4, -1, -2, 1, 5, -3};
        kadens_algorithm(numbers);
    }
    */

}
    
