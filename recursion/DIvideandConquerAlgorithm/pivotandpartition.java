package recursion.DIvideandConquerAlgorithm;

public class pivotandpartition {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // recursive function
    public static void quickSort(int arr[],int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        int pidx =partition(arr, si, ei);
        quickSort(arr, si, pidx-1); //left part
        quickSort(arr, pidx+1, ei); //right part

    }
    public static int partition(int arr[],int si, int ei){
        int pivot= arr[ei];
        int i = si-1; //space for the element thatt are smaller than pivot

        for(int j=si; j<ei; j++){
            if(arr[j]<pivot){
                i++;  
            // swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        }
        // swapping for pivot
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static void main(String[] args) {
        int arr[]={4,2,6,3,6,8};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
