package Arrays;
import java.util.Scanner;

public class JavaPedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.
        int numofFig = scan.nextInt();
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
         String [][] histbook = new String[numofFig][3];
         scan.nextLine();
        //Watch out for the nextLine() pitfall. 
        
        
        for (int i=0;i<histbook.length;i++) {

            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
              histbook[i][0] = scan.nextLine();

            System.out.print("\t - Date of birth: ");
              histbook[i][1] = scan.nextLine();
            

            System.out.print("\t - Occupation: ");
              histbook[i][2] = scan.nextLine();
            

            System.out.print("\n");

        }
        
        
        System.out.println("These are the values you stored:"); 
        //Task 4: call print2DArray. 
        print2DArray(histbook);


        System.out.print("\nWho do you want information on? ");  

        
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */        

        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */
    public static void print2DArray(String[][] arr)
    {
        for(int i =0;i<arr.length; i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

}