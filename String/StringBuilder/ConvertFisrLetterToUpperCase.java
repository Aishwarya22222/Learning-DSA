package String.StringBuilder;

public class ConvertFisrLetterToUpperCase {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder(""); // StringBuilder to store the modified string

        // Convert the first character of the input string to uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Iterate through the characters of the input string starting from the second character
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i)); // Append the space to the StringBuilder
                i++; //Move to the next character

                // Convert the next character to uppercase and append it to the StringBuilder
                sb.append(Character.toUpperCase(str.charAt(i)));  
            }else{
                sb.append(str.charAt(i));// Append the current character to the StringBuilder
            }
        }
        return sb.toString(); //Convert the StringBuilder to a String and return
    }
    public static void main(String[]args){
        String str = "my name is aishwaraya neupane";
        System.out.println(toUpperCase(str)); // Output: "My Name Is Aishwaraya Neupane"
    }
    
}
