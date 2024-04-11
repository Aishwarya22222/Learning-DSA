package String;

public class LargestString {
    public static void main(String[]args){
        // Array of strings
        String fruits[] ={"apple", "banana","mango"};
        // Initialize the largest string as the first element of the array
        String largest = fruits[0];
         // Loop through the array starting from the second element
        for(int i = 1; i<fruits.length; i++){
            // Compare the current element with the current largest string
            if(largest.compareTo(fruits[i])<0){
                // If the current element is lexicographically greater than the current largest string,
                // update the largest string to the current element
                largest=fruits[i];
            }
            
        }
        // Print the largest string found
        System.out.println("Largest string is: " +largest);
    }
    
}
