package NestedTest;
public  class Outer {

    public static class NestedInner
    {

        public void PrintNested()
        {
            System.out.println("Printed from nested static normal function");
        }
         public static void PrintNested1()
        {
            System.out.println("Printed from nested static static function");
        }

    }
     public class nonStatic
    {

        public void PrintNested()
        {
            System.out.println("Printed from nonstatic normal function");
        }
         public static void PrintNested1()
        {
            System.out.println("Printed from nonstatic static function");
        }

    }



    
}
