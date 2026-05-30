package EXP;

public class City {
    private String name;
    private String country;
    private long population;

    public City(String name , String country , long population)
    {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }  
    public City (City source)
    {
        setName(source.name);
        setCountry(source.country);
        setPopulation(source.population);
    } 

    public String getName()
    {
        return this.name ;
    }
    public String getCountry()
    {
        return this.country;
    }
    public long getPopulation()
    {
        return this.population;
    }
    public void setName (String value) throws IllegalArgumentException
    {
        if(value == null ||value.isBlank() || value.isEmpty()   )
        {
            throw new IllegalArgumentException("Name cannot be Null/blank/empty");
        }
        else
        {
            this.name = value;
        }

    }
    public void setCountry (String value) throws IllegalArgumentException
    {
        if(value == null ||value.isBlank() || value.isEmpty()  )
        {
            throw new IllegalArgumentException("Country cannot be Null/blank/empty");
        }
        else
        {
            this.country = value;
        }

    }
     public void setPopulation (long value) throws IllegalArgumentException
    {
        if(value<0 )
        {
            throw new IllegalArgumentException("Population cannot be less than 0 ");
        }
        else
        {
            this.population = value;
        }

    }

}
