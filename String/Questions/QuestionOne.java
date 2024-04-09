package String.Questions;
import java.util.*;

public class QuestionOne {
    // Count how many times lowercase vowels occurred in a String entered by the user.
    public static void main(String[]args){
        System.out.print("Write something:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch =='a'||ch =='e'||ch == 'i' || ch == 'o'|| ch =='u'){
                count++;
            } 

            
        }
        System.out.println("count of vowels is :" + count);
    }
      
}
