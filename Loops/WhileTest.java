import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args)
    {
        // int count =0; 
        // int roll =0 ; 
        // while(roll !=6)
        // {
        //     roll = (int)(Math.random() *6)+1;
        //     System.out.println("You rolled "+roll);
        // }
        Scanner scan = new Scanner(System.in);
        int secretNum = (int)(Math.random()*6) +1;
        System.out.println("Guess the number between 1 to 10 ");
        int guess = scan.nextInt();
        while (guess!=secretNum)
        {
            System.out.print("Guess again :");
            guess = scan.nextInt();
        }
        System.out.println("You Guessed it right "+guess +" = "+secretNum);


        

    }
}
