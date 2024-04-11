package String.StringBuilder;

public class CreatingSB {
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder(""); // Create a StringBuilder object named 'sb' with an initial empty string

        // Loop to append each lowercase English alphabet character from 'a' to 'z' to the StringBuilder
        for(char ch ='a'; ch<='z'; ch++){
            sb.append(ch);  // Append the current character to the StringBuilder
        }
        System.out.println(sb); // Print the contents of the StringBuilder
        System.out.println(sb.length()); // Print the length of the StringBuilder (number of characters)
    }
    
}
