package recursion;

public class pairs {
    public static int friendspairing(int n){
        //base case
        if(n<=2){
           return n;
        }
        // single
        int fnm1= friendspairing(n-1);

        // pairs
        int fnm2 = friendspairing(n-2);
        int pair = (n-1)* fnm2;
        int totalpair= fnm1+pair;
        return totalpair;

        //  return friendspairing(n-1) + (n-1) * friendspairing(n-2);


    }
    public static void main(String[] args) {
        System.out.println(friendspairing(4));
        
    }
    
}
