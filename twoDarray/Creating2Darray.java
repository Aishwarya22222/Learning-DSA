package twoDarray;
import java.util.*;

public class Creating2Darray {
    public static void main(String[]args){
        System.out.print("Enter Elements:");
        // Declare a 2D integer array named 'matrix' with dimensions 3x3
        int matrix[][] = new int[3][3];
        // Create a Scanner object 'sc' to read input from the user
        Scanner sc= new Scanner(System.in);
        // Input loop: Iterate over rows and columns of the matrix to get input from the user
         for(int i=0; i<matrix.length; i++){
             for(int j = 0; j<matrix[0].length; j++){
                // Read an integer input from the user and assign it to the current element of the matrix
                matrix[i][j]=sc.nextInt();
             }

         }
        //output
        for(int i=0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        
        } 
            sc.close();  
    }

    
}
