package twoDarray;

public class QuestionOne {
    // Print the number of 7’s that are in the 2d array
    public static void main(String[]args){
        int arr[][] = {{2,3,7},{3,7,7}};
         int count = 0;

         for(int i =0; i< arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 7){
                    count++;
                }
            }
         }
         System.out.println("Count of 7 is:"+ count);
    }
    
}
