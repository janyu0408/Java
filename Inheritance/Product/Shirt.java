package Product;

public class Shirt extends Product{

    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void fold()
    {
        System.out.println("\nFolding my Shirt hi kehde");
    }


}