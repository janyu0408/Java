public class Main {
    public static void main(String[] args)
    {
        Car nissan = new Car( "Nissan" , 11000,2020, "blue");
     
        Car dodge = new Car( "Dodge", 12000,2020,"Yellow");
        
        Car nissan2 = new Car(nissan);
        nissan2.setColour("Red");

        dodge.detail();
        nissan.detail();
        nissan2.detail();


    }
}
