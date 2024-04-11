package recursion;

public class removingduplicate {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
       if(idx == str.length()){
        System.out.println(newStr);
        return;
       }
    // stringma vako idx ko value currCahr lai assign gareko
    char currChar = str.charAt(idx);
    //if currChar is already seen in the map then skip it and move to the next index
    if (map[currChar-'a']==true){
        removeDuplicates(str, idx+1, newStr, map);

    //if currchar is not seen int he map then make it seen and append it to the newStr.
    }else{
        map[currChar- 'a']= true;
        removeDuplicates(str, idx+1, newStr.append(currChar), map);

    }

    }
    public static void main(String[] args) {
        String str="aappnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
       
    }
}
