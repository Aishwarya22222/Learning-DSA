package recursion;

public class power {
    public static int power(int x, int n){
        // Base case: if n is 0, return 1 (anything raised to the power of 0 is 1)
        if(n==0){
            return 1;
        }
        // Recursive case: return x multiplied by npowerx(x, n-1)
        // This effectively calculates x^(n-1) in each recursive call
        return (x*power(x,n-1));
        
        
    }
    public static void main(String[] args) {
        // Calculate and print 2 raised to the power of 10
        System.out.println(npowerx(2, 10)); // Output: 1024
        
    }
    
}
