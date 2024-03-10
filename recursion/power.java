package recursion;

public class power {
    public static int npowerx(int x, int n){
        if(n==0){
            return 1;
        }
        return (x*npowerx(x,n-1));
        
        
    }
    public static void main(String[] args) {
        System.out.println(npowerx(2, 10));
        
    }
    
}
