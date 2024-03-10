package bitmanipulation;
// check if a number is ODD or EVEN
public class OddEven {
    public static void oddEven(int n) {
        int bitMask= 1;
        if((n & bitMask)== 0){
            System.out.println("even number");

        }else{
            System.out.println("odd number");
        }


        }

    public static void main(String[] args) {
        oddEven(6);
        oddEven(9);
        oddEven(4);
        oddEven(7);
        
    }
    
}
