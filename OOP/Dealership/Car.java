public class Car
{
    private String make ;
    private String colour;
    private int year;
    private double price;
    public Car(String make, double price, int year, String colour){
        this.make = make ;
        this.price = price;
        this.year= year;
        this.colour = colour;
    }
    //copy contructor fro saving the reference trap 
    //now this will not share the reference and will create it as the new object 
    public Car(Car source)
    {
        this.make =  source.make ;
        this.price = source.price;
        this.year=  source.year;
        this.colour =source.colour;

    }

    //getter 
    public String getMake()
    {
        return make;
    }
    public String getColour()
    {
        return colour;
    }
    public int getYear()
    {
        return year;

    }
    public double getPrice()
    {
        return price;
    }
    //setter 
    public void setMake(String make)
    {
        if(make!= "" && make!= null)
        {
            this.make=make;
        }
    }
    public void setColour(String colour)
    {

        if(colour!= "" && colour!= null)
        {
            this.colour=colour;
        }
    }
    public void setPrice(double price)
    {
        if (price>0)
        {
            this.price = price;
        }
    }
    public void setYear(int year)
    {
        if(year>1799 && year <2050)
        {
            this.year= year;
        }
    }


    public void drive()
    {
        System.out.println(this.make+" Driving to the nearest exit");
    }
    public void detail()
    {
        System.out.println(make +" is built in "+year+" it is of "+colour+" colour and worth $"+price);
    }
}