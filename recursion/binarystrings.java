package recursion;
// print all binary of size N without consecutive zeros

public class binarystrings {
    /*public static void printBinStrings(int n, int lastplace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        printBinStrings(n-1, 1,str +" 1");
        if (lastplace == 1){
            printBinStrings(n-1, 0,str +" 0");
        }
    }
    public static void main(String[] args) {
        printBinStrings(3, 1, "");
        
    }
    */



    // print all binary of size N without cons3cutive ones
    
    public static void printBinaryStrings(int n, int lastplace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //recursive function
        printBinaryStrings(n-1, 0, str +" 0");
        if(lastplace==0){
            printBinaryStrings(n-1, 1, str +" 1");

        }
    }
    public static void main(String[] args) {
        printBinaryStrings(3, 0, " ");
    }
}
