package EXP;

public class Microscope extends LabEquipment {
    private int magnification;
    private static final int MIN_MAG = 1;

    public Microscope(Microscope source) {
        super(source.getManufacturer(), source.getModel(), source.getYear());
        setMagnification(source.magnification);
    }

    public Microscope(String manufacturer, String model, int year, int magnification) {
        super(manufacturer, model, year);
        setMagnification(magnification);
    }

    public void setMagnification(int magnification) throws IllegalArgumentException {
        if (magnification < MIN_MAG) {
            throw new IllegalArgumentException(
                    "Magnification must be greater than or equal to the minimum magnification.");
        }

        this.magnification = magnification;
    }

    public int getMagnification() {
        return magnification;
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }
    public LabEquipment Clone()
    {
        return new Microscope(this);
    }

}
