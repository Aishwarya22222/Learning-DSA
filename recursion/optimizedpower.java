package recursion;

public class optimizedpower {
    public static int optimizedpPOWER(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower= optimizedpPOWER(x, n/2);
        int halfPowerSquare=halfPower*halfPower;

        //odd
        if(n%2 != 0){
            halfPowerSquare=x*halfPowerSquare;
        }
        return halfPowerSquare;
    }
public static void main(String[] args) {
    int x=2;
    int n=10;
    System.out.println(optimizedpPOWER(x, n));
}
    
}
  
