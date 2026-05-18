package OOP.Airlines;
import java.util.Arrays;

public class Person {
    private String name ; 
    private String nationality;
    private String dateOfbirth; 
    private String[] passport;
    private int seatNumber; 

    public String getName()
    {
        return name; 
    }
    public String getNationality()
    {
        return nationality;
    }
    public String getDOB()
    {
        return dateOfbirth;
    }
    public String[] getPassport()
    {
        return Arrays.copyOf(passport, passport.length);
    }
    public String getPassString()
    {
        return Arrays.toString(passport);
    }
    public int getSeatNumber()
    {
        return seatNumber;
    }
    public void setName(String name)
    {
        if(name!= "" && name !=null)
        {
            this.name = name;

        }
    }
    public void setNationality(String nationality)
    {
        if(nationality!= "" && nationality !=null)
        {
            this.nationality = nationality;

        }
    }
    public void setDOB(String dateOfbirth)
    {
        if(dateOfbirth!="" && dateOfbirth !=null)
        {
            this.dateOfbirth = dateOfbirth;
        }
    }
    public void setPassport(String[] passport)
    {
        if(passport!=null)
        {
            this.passport = Arrays.copyOf(passport, passport.length);
        }
    }
    public void setSeat()
    {
        
            this.seatNumber = chooseSeat();
        
    }

    //copy contructor 
    public Person(Person source)
    {
        this.name = source.name ; 
        this.nationality = source.nationality;
        this.dateOfbirth = source.dateOfbirth;
        this.passport= Arrays.copyOf(source.passport, source.passport.length);
        this.seatNumber = source.seatNumber;
    }

    public Person(String name , String nationality, String dateOfbirth,String[] passport , int seatNumber )
    {
        this.name = name ; 
        this.nationality = nationality;
        this.dateOfbirth = dateOfbirth;
        if(passport ==null)
        {
          this.passport=  new String[]{this.name, this.nationality, this.dateOfbirth};
        }
        else
        {
            this.passport= Arrays.copyOf(passport, passport.length);;
        }
         
        this.seatNumber = seatNumber;
    }

    public boolean applyPassport()
    {
        int num = (int)(Math.random()*2);
        if(num== 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int chooseSeat()
    {
        int num = (int)(Math.random()*11)+1;
        return chooseSeat();
    }

    public void Detail()
    {
        System.out.println("This is "+name);
        System.out.println("Date of Birth "+dateOfbirth);
        System.out.println("Nationality : "+nationality);
        System.out.println("Passport : "+Arrays.toString(passport));
        System.out.println("SeatNumber : "+seatNumber);
    }

}
