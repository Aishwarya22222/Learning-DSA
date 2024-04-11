package twoDarray;

public class DiagonalSum {
    //BruteForce Approach TimeComplexity:O(n^2)
    /* 
    public static int sum (int matrix[][]){
        int sum = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum+=matrix[i][j];
                }
            }

        }
        return sum;
    }
    */

    //Optimised Approach(Time Complexity:O(n))
    public static int sumOfDiagonal(int matrix[][]){
        // Initialize a variable to store the sum of diagonal elements
        int sum = 0;
        // Iterate through the rows of the matrix
        for(int i =0; i<matrix.length; i++){
            // Add the element at the current diagonal position to the sum
            sum+=matrix[i][i];
            
            // Check if the current row is not in the middle of the matrix
           // If it's not in the middle, add the element at the opposite side of the diagonal to the sum
            if(i!= matrix.length-1-i)
            sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    } 
    public static void main(String[]args){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(sumOfDiagonal(matrix));
    }
    
}
