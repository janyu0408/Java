package StaticFinal.EXP;

public class Car {
    private String make;
    private String model;
    public enum bodyType {SEDAN, COUPE, VAN, HATCHBACK, TRUCK , SUV};  // Should this really be a String?
    private int productionYear;
    private double price;
}
