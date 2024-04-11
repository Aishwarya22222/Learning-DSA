package recursion;

public class lastoccurance {
    public static int lastOccur(int arr[], int key, int i ){
        // base case
        if(i<0){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }

        return lastOccur(arr, key, i-1);
        
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,4,7,8,5};
        System.out.println(lastOccur(arr, 5, arr.length-1));
    }
    
}
