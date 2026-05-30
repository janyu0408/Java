

import Product.Shirt;
import Product.Shirt.Size;;

public class Main {

    public static void main(String[] args)
    {
        Shirt shirt= new Shirt();
        shirt.setSize(Size.SMALL);
        shirt.setBrand("Nike");
        shirt.setPrice(233.33);
        shirt.setColor("blue");
        shirt.fold();

        
    }
    
}
