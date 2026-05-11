package Hangman;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lets Play Hangman!");
        System.out.println("Press Any Key!");
        scan.nextLine();
        int num  = words.length;
        int random  = (int)(Math.random()*num);
        String word = words[random];

        char[] wordArr = new char[word.length()];
        for(int i =0; i<wordArr.length; i++)
        {
            wordArr[i]='_';
        }
        int misses = 0;
        String missesChar ="";
        while(misses<6)
        {
            System.out.println(gallows[misses]+"\n");
            System.out.println("Word :"+Arrays.toString(wordArr));
            System.out.println("\nMisses :"+missesChar);
            System.out.print("\nGuess :");
            char guess = scan.nextLine().charAt(0);
            if(checkGuess(guess, word))
            {
                //update placeholder
                updatePlaceholders(word,wordArr,guess);
                 
            }
            else{
                misses ++;
                missesChar+=guess;
            }
             if (Arrays.equals(wordArr, word.toCharArray())) {
                System.out.print(gallows[misses]);
                System.out.print("\nWord:   ");
                System.out.println("Word :"+Arrays.toString(wordArr));
                System.out.println("\nGOOD WORK!");                
                break;
            }


        }
        
            if (misses == 6) {
            System.out.print(gallows[6]);
            System.out.println("\nRIP!");
            System.out.println("\nThe word was: '" + word + "'");
        }
        
        
scan.close();


    }
    public static boolean checkGuess (char guess ,String word)
    {
        char [] wordarr = word.toCharArray();
        for(int i=0; i < wordarr.length; i++)
            {
                if(guess==wordarr[i])
                {
                    return true;
                }

            } 
        return false;
        
    }
     public static void updatePlaceholders(String word, char[] placeholders, char guess) {

            for (int j = 0; j < word.length(); j++) {

                if (word.charAt(j) == guess) {
                    placeholders[j] = guess;
                }
            }
        }
    

}