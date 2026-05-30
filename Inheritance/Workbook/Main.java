package Workbook;

import Workbook.Shape.Cylinder;
import Workbook.Shape.Sphere;

public class Main {
    public static void main(String[] args)
    {
        Cylinder c= new Cylinder(2.2,    10);
        System.out.println(c.getHeight() +" "+ c.getRadius());
        Sphere s = new Sphere(3);
        System.out.println(" "+ c.getRadius());

    }
    
}
