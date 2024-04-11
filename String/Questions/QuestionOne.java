package String.Questions;
import java.util.*;

public class QuestionOne {
    // Count how many times lowercase vowels occurred in a String entered by the user.
    public static void main(String[]args){
        System.out.print("Write something:"); // Prompting the user to enter a string
        Scanner sc = new Scanner(System.in);// Creating a Scanner object to read user input       
        String str = sc.next();// Reading the string entered by the user
        int count =0; //Initializing a counter for lowercase vowels

        // Loop through each character of the input string
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i); // Get the character at index i
            
            // Check if the character is a lowercase vowel ('a', 'e', 'i', 'o', 'u')
            if(ch =='a'||ch =='e'||ch == 'i' || ch == 'o'|| ch =='u'){
                count++; // Increment the counter if a lowercase vowel is found
            } 

            
        }
        System.out.println("count of vowels is :" + count);
    }
      
}
