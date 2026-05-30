package EXP;

public abstract class LabEquipment {
    private String manufacturer;
    private String model;
    private int year;
    private static final int MIN_YEAR = 1960;

    public LabEquipment(String manufacturer, String model, int year) {
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) throws IllegalArgumentException {
        if (MIN_YEAR > year) {
            throw new IllegalArgumentException("Year must be greater than or equal to the minimum year.");
        }

        this.year = year;
    }

    public void setManufacturer(String manufacturer) throws IllegalArgumentException {
        if (manufacturer == null || manufacturer.isEmpty() || manufacturer.isBlank()) {
            throw new IllegalArgumentException("Manufacturer can not be blank");
        }
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) throws IllegalArgumentException {
        if (model == null || model.isEmpty() || model.isBlank()) {
            throw new IllegalArgumentException("model can not be blank");
        }
        this.model = model;
    }
    public abstract String  performMaintenance() ;
    public abstract LabEquipment Clone();

}
