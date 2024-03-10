package recursion.DIvideandConquerAlgorithm;

public class mergesort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // recursive function
    public static void mergeSort(int arr[],int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int mid = si+(ei-si)/2;
        //left part
        mergeSort(arr, si, mid);
        //right part
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);

    }
    public static void merge(int arr[],int si, int mid, int ei){
        int temp[]= new int[ei-si+1];
        int i = si; //iteration for left part
        int j = mid+1; //iteration for right part
        int k= 0; // iteration for temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;

            }
            k++;
        }
        //for left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //for right part
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        // copying temp arr to original arr
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
   
    
}
