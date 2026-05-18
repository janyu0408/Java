package OOP.Airlines;


public class Main {
    public static void main(String[] args)
    {
        Person person1 = new Person("Janyu","Indian","04/08/2001", null,0 );
        String[] passport1 = person1.getPassport();
        //this is trap because when i called get passport it shared the reference of the array so whateven i change 
        //will be changed there too. it happens with arrays 
            String name = person1.getName();
            name ="harsh";
        passport1[0] = "Harsh";
        System.out.println("Before mutation");
        person1.Detail();
         // similarly 
         Person  person2 = person1; // this also share the reference too it so whatever we change 
         // in person 2 will reflect in person 1 also 

         person2.setName("Ajay");
         System.out.println("after person 1 ");
         person2.Detail();
         System.out.println("after person 2 ");

         person1.Detail();
         // this situation leads to create a copy contructor 
         


        
      

        
    }
}
