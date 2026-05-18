package OOP.Contact;

import java.time.LocalDate;
import java.time.Period;

public class Contact {
     private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact (String name, String phoneNumber , String birthDate )
    {
        this.name = name ; 
        this.phoneNumber = phoneNumber;
        
        this.birthDate = birthDate;
        if(!this.birthDate.isBlank() && !this.birthDate.isEmpty())
        {
            this.age = toAge(this.birthDate);
        }

    }
    public Contact (Contact source)
    {
        this.name = source.name ; 
        this.phoneNumber = source.phoneNumber;
        
        this.birthDate = source.birthDate;
        if(!this.birthDate.isBlank() && !this.birthDate.isEmpty())
        {
            this.age = toAge(this.birthDate);
        }

    }
    private int toAge(String birthDate)
    {
        LocalDate date = LocalDate.parse(birthDate);
        Period period = Period.between(date, LocalDate.now());
        return period.getYears();
    }

}
