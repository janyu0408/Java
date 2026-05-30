
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // this was for lesson 1 
        // List<String> facts = Arrays.asList(
        //     "Marie Curie was the first woman to win a Nobel Prize.",
        //     "She received the Nobel Prize in Physics in 1903, and the Nobel Prize in Chemistry in 1911.",
        //     "Curie was a pioneer in the field of radioactivity, and her work led to the development of X-ray technology.",
        //     "She was the first woman to become a professor at the Sorbonne, and the first woman to be entombed on her own merits in the Panthéon.",
        //     "Curie died at the age of 66 from complications related to her prolonged exposure to radiation.",
        //     "She is remembered as one of the most influential scientists in history.",
        //     "Her legacy lives on through the Marie Curie Cancer Care charity, which provides care and support to people with terminal illnesses.",
        //     "Curie's contributions to science and medicine have been recognized and celebrated worldwide."
        // );
        // facts.forEach(fact->System.out.println(fact));

        //  List<Integer> integers = Arrays.asList(25, 19, 23, 45, 38, 23, 59, 12);
        //  integers.sort((right, left)->{
        //     return right.compareTo(left);       
        //  });

         List<Double> prices = Arrays.asList(55.99, 33.99, 88.99, 11.49, 55.99, 111.99, 77.99);

        // TODO
        prices.sort((a,b)-> b.compareTo(a));
        
        System.out.println("\nPrices\n------");

        // TODO
        prices.forEach(num -> System.out.println(num));

        List<String> books = Arrays.asList(
            "To Kill a Mockingbird",
            "The Great Gatsby",
            "Pride and Prejudice",
            "The Catcher in the Rye",
            "The Alchemist",
            "One Hundred Years of Solitude",
            "Moby-Dick",
            "The Brothers Karamazov",
            "The Lord of the Rings",
            "The Picture of Dorian Gray"
        );

        // TODO
        books.sort((a,b)-> a.compareTo(b));

        System.out.println("\nLibrary\n--------");

        // TODO
        books.forEach(b->System.out.println(b));

        
        
        
    }
}