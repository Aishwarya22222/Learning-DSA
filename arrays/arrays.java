package arrays;
import java.util.*;

public class arrays {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("marks of phy : "  +marks[0]);
        System.out.println("marks of che : "  +marks[1]);
        System.out.println("marks of math : "  +marks[2]);
        sc.close();

        marks[2]=100;
        System.out.println("marks of math : "  +marks[2]);

        marks[1]=marks[1]+3;
        System.out.println("marks of che : "  +marks[1]);
    //    to check percentage of the above subjects
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage = " +percentage +" % " );

    }
    
}
