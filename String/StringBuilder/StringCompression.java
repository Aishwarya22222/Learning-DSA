package String.StringBuilder;

public class StringCompression {
    // Method to compress the input string
    public static String compress(String str){
        // StringBuilder to store the compressed string
        StringBuilder sb = new StringBuilder("");
        
        // Loop through each character in the input string
        for(int i=0; i<str.length(); i++){
            // Initialize a counter for the current character
            Integer count =1;

            // While the current character is the same as the next character, increment the counter
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;  // Move to the next character
        }

        // Append the current character to the compressed string
        sb.append(str.charAt(i));

        // If the count is greater than 1, append it to the compressed string
        if(count>1){
            sb.append(count);
        }
        }
        // Convert the StringBuilder to a String and return
        return sb.toString();
    }
    public static void main(String[] args) {
        // Input string
        String str = "aabbccdde";
        // Print the original string
        System.out.println("Original string: "+ str);
        // Print the compressed string by calling the compress method
        System.out.println("Compressed String :" + compress(str));
    }
    
}
