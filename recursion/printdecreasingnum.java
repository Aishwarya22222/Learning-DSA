package recursion;

public class printdecreasingnum {
    public static void printdec(int n){
        // Base case: if n is 1, print it and return
        if(n==1){
            System.out.println(n);
            return;
        }
        // Print the current value of n
        System.out.print(n+" ");
        // Recursive call with n-1
        printdec(n-1);
    } 
    public static void main(String[] args) {
        int n =10;
        printdec(n);
    }
    
}
