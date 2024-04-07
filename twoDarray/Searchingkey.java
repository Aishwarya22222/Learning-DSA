package twoDarray;
import java.util.*;

public class Searchingkey {
    public static boolean searchKey (int matrix[][],int key){
        for(int i=0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println("Key found at cell: ("+i+","+j +")");
                    return true;
                    

                }
            }
        }
        System.out.println("Key not found");
        return false;
        
    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                 System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
        searchKey(matrix, 5);


    }
    
}
