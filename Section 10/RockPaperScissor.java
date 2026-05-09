import java.util.Scanner;


public class RockPaperScissor {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to play Rock Paper Scissor? ");
        String response = scan.nextLine();
        while(!response.toLowerCase().equals("no"))
        {
             System.out.println("\nLets Play");
            System.out.println("Rock Paper Scissor");
            String user  = scan.nextLine();
            user = user.toLowerCase();
            if(!user.equals("rock") && !user.equals("paper") && !user.equals("scissor"))
            {
                System.out.println("Invalid Response");
                System.exit(0);
            }
            int n = (int)(Math.random() *3);
            String computer = computerResponse(n); 
            System.out.println("You :"+user+"\n"+"Computer :"+computer);
            checkWinner(user, computer);
            System.out.println("Do You want to play again");
            response= scan.nextLine();

        }
        
           
            
        
      
            System.out.println("No Issue lets play some another time!");
        

        scan.close();
    }
    public static String computerResponse(int num)
    {
        String arr[] = {"rock", "paper" , "scissor"};


        return arr[num];
    }
    public  static void checkWinner(String user , String Computer)
    {
        if(user.equals(Computer))
        {
            System.out.println("It's a Tie");
            return;
        }
        if(user.equals("rock"))
        {
            if(Computer.equals("paper"))
            {
                System.out.println("Computer Won");
            }
            else{
                System.out.println("You Won");
            }
        }
        if(user.equals("paper"))
        {
            if(Computer.equals("scissor"))
            {
                System.out.println("Computer Won");
            }
            else{
                System.out.println("You Won");
            }
        }
        if(user.equals("scissor"))
        {
            if(Computer.equals("rock"))
            {
                System.out.println("Computer Won");
            }
            else{
                System.out.println("You Won");
            }
        }
    }
}
