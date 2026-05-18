public class Dealership {
    public Car[] cars;

    public Dealership(Car[] cars)
    {
        this.cars = new Car[cars.length];
        for(int i=0;i<cars.length;i++)
            {
                this.cars[i] = new Car(cars[i]); // this is called deep copying 
            } 
    }

    // the need of deep copying is because we want to have the array of objects and then passing it into another object 
    // the reference of the object inside the object is passed so thats the reaon of deep copying so now every element have there own address and they 
    // will not refer to another 
    
    
}
