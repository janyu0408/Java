import java.util.Scanner;

public class Survey {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = scan.nextInt();
        System.out.println("Enter your Name ");
        String Name = scan.nextLine();
        
        System.out.println("Enter your Salary ");
        double sal = scan.nextDouble();
        System.out.println("Enter your Company ");
        boolean  company = scan.nextBoolean();
        

        System.out.println(company + " "+sal +" "+age+" "+Name);
        

        scan.close();
    }
}
