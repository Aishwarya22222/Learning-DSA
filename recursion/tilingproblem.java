package recursion;

public class tilingproblem {
    public static int tileProb(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
        //choice 
        //vertical choice
        int fnm1 = tileProb(n-1);
        // horizontal choice
        int fnm2 = tileProb(n-2);
        //Count Total Ways
        int totWays = fnm1+fnm2;
        return totWays;

    }
    public static void main(String[] args) {
        System.out.println(tileProb(4));
        
    }
    
}
