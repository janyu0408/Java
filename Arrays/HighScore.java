package Arrays;

public class HighScore {


    public static void main(String[] args)
    {
        int scores[] = new int[10];
        for(int i=0 ; i < scores.length ;i++)
        {
            scores[i] = random();
        }
        for(int i=0 ; i < scores.length ;i++)
        {
            System.out.print(scores[i]+"  ");
        }
        int max =0;
        for(int i=0 ; i < scores.length ;i++)
        {
            if(max<scores[i])
            {
                max= scores[i];
            }
        }
        System.out.println("\n"+max);
        

    }
    public static int random(){
        return (int)(Math.random()*49999)+1;
    }
    
}
