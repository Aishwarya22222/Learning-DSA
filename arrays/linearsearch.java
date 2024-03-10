package arrays;
import java.util.*;
// linear search to find the index of element of a given array//

public class linearsearch {
    /* 
    public static int linear_Search(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=10;
        int index=linear_Search(numbers, key);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println("key is at "+ index);
        }
    }
   */ 



   //string use garera index ko vallue patta lagaako
   /*public static int linear_Search(String menu[], String key){
    for(int i=0; i<menu.length; i++){
        if(menu[i].equals(key)){
            return i;
        }
    }
    return -1;


   }
  public static void main(String[] args) {
    String menu[]={"Potato chips", "pizza","Burger","Bubble tea","lassi"};
    String key="Bubble";
    int index = linear_Search(menu, key);
    if(index ==-1){
        System.out.println("not found");

    }else{
        System.out.println("key is at"+ index);
    }
    
  }
  */

  //largest number in the index
  public static int getLargest(int numbers[]){
    int largest=Integer.MIN_VALUE; // -infinity
    int smallest= Integer.MAX_VALUE; // +infinity
    for(int i=0; i<numbers.length; i++){
        if(largest<numbers[i]){
            largest=numbers[i];
        }
        if(smallest>numbers[i]){
            smallest=numbers[i];
        }
        
    }
    System.out.println("smallest value is" + smallest);
    return largest;
  
  }
  public static void main(String[] args) {
    int numbers[]={1,4,6,7,3,4,7,8};
    System.out.println("largest value is" + getLargest(numbers));

  }
}
