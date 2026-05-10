import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        
        int diceRoll =0;
        int score = 0;
        System.out.println(">> Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println(">> Great, here are the rules:\n");
        System.out.println(">> - If you roll a 6, the game stops.");
        System.out.println(">> - If you roll a 4, nothing happens.");
        System.out.println(">> - Otherwise, you get 1 point.\n");
        System.out.println(">> You must collect at least 3 points to win. Enter anything to roll:");
        scan.nextLine();
        while(diceRoll!=6)
        {
             diceRoll = rollDice();
            
            if(diceRoll == 4 )
            {
                System.out.println("You rolled a 4 Zero Points");
                continue;
            }
            if(diceRoll == 6 )
            {
                System.out.println("You Rolled a :6 End of the game ");
                continue;
            }
            System.out.println("You Rolled a :"+diceRoll+".One Point. Keep Rolling");
            score++;
        }
        if(score >=3)
        {
            System.out.println("You won with scoring "+score+" points");
        }
        else
        {
            System.out.println("You Lost  scoring "+score+" points only");

        }

       
        




    }
    public static int rollDice()
    {
        int roll = (int)(Math.random()*6)+1;
        return roll;
    }
  
  

  
  
}