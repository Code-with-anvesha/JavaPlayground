 /*  
 *  Arrays
 *  -> Array is a linear collection of similler elements.
 *
 */

   import java.util.*;
  public class Array {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);


        // Creating an Array 
        int marks[] = new int [50];
        int number[] = {1,2, 3, 4, 5, 6};

        String fruits[] = {"Cherry", "Apple","Orange"};

        // Inputs in Arrays

        System.out.println("Enter the 6 Subjects marks: ");
                      
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
        marks[5] = sc.nextInt();


        // Output in Array 
        System.out.println(marks[0] + " " + marks[1]+ " " + marks[2] + " " + marks[3] + " " + marks[4]+ " " + marks[5]);
     }

    }
