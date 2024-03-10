package arrays;
import java.util.*;
// updating marks
public class arguments {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;

        }
      
    }
    public static void main(String[] args) {
        int marks[]={98, 87, 99};
        update(marks);

       // to print our updated marks
       for(int i=0; i<marks.length; i++){
        System.out.print(marks[i] +" ");

       } 
    System.out.println();

    }
    
}
