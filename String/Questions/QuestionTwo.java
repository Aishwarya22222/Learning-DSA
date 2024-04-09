package String.Questions;

import java.util.Arrays;

public class QuestionTwo {
    //Anagrams of string
    public static boolean isAnagram(String str1, String str2){
        //remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();

        //check length if both string have not equal length they are noo anagram
        if(str1.length() != str2.length()){
            System.out.println("Given Strings are not anagrams");
            return false;
        }
        //convert string to char arrays and sort them
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        //compare sorted arrays
        System.out.println("Given string is an Anagram");
        return Arrays.equals(charArr1, charArr2);
    }
    public static void main(String[] args) {
      String str1 = "listen";
      String str2 = "silent";
      isAnagram(str1, str2);
    }
    
}
