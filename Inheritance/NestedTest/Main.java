package NestedTest;

public class Main {
    public static void main(String[] args)
    {
         Outer op= new Outer();
        Outer.NestedInner.PrintNested1();
        Outer.NestedInner  inner = new Outer.NestedInner();
        inner.PrintNested1();
        inner.PrintNested();

        
    }
}
