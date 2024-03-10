package bitmanipulation;

public class operations {
    //  Get ith bit
    /*
    public static int getithBit(int n, int i){
        int bitMask=1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getithBit(10, 3));
        
    }
     */


    //Set ith bit
    /*public static int setIthBit(int n, int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
    */

    // clear ith bit
    /* 
    public static int clearIthBit(int n, int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
        
    }
    */

    // update ith bit
    public static int updateIthbit(int n, int i, int newBit){
        
    }
    public static void main(String[] args) {
        
    }
    
}
