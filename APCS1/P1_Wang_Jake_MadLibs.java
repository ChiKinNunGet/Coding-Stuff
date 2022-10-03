/*
    Name:       Jake Wang
    Date:       9/23/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/
import java.util.Scanner;
public class P1_Wang_Jake_MadLibs
{
    static Scanner matt;
    /* Peladophobia is the irrational fear of bald *people*. *Strange* as it is, it is possible. About *0* 
       people, or *0.0*% of the world suffers from Peladophobia. Someone suffering from this condition can 
       expect to experience a very high amount of anxiety from merely thinking of bald *people*, let alone 
       actually seeing them in real life. In fact, their anxiety may be so *intense* that they may even 
       endure a full blown *panic attack* as a result of it. Currently *0.0*% of known peladophobia-induced 
       panic attacks resulted in a catatonic state. Although such an influx of *anxiety* will not always be 
       the case for everyone suffering from peladophobia, it is still very plausible to occur nonetheless 
       when there are *_* bald people around the *globe*.*/
    
    public static void main(String[] Args){
        matt = new Scanner(System.in); 
        System.out.println("Time to play a madlibs game");
        
        String s1 = promptString("living thing");
        String s2 = promptString("adjective");
        int i1 = promptInt();
        
        System.out.println("Please enter a double: ");
        double d1 = matt.nextDouble();
        
        //weird behavior
        System.out.println("Please enter another living thing: ");
        String s3 = matt.nextLine();
        s3 = matt.nextLine();
        
        String s4 = promptString("another adjective");
        String s5 = promptString("acute medical issue");
        
        System.out.println("Please enter a double: ");
        double d2 = matt.nextDouble();
        d2 = (double)d2;
        
        //weird behavior
        System.out.println("Please enter a noun: ");
        String s6 = matt.nextLine();
        s6 = matt.nextLine();
        
        int i2 = promptInt();
        System.out.println("Please enter a noun: ");
        String s7 = matt.nextLine();
        s7 = matt.nextLine();
        
        System.out.println();
        System.out.println("Thanks! Here's your madlibs story: \n");
        System.out.printf("Peladophobia is the irrational fear of bald %s. %s as it is, it is\n" + 
                            "possible. About %d people, or %.1f percent of the world suffers from\n" +
                            "Peladophobia. Someone suffering from this condition can expect to\n" + 
                            "experience a very high amount of anxiety from merely thinking of bald\n" +
                            "%s, let alone actually seeing them in real life. In fact, their\n" + 
                            "anxiety may be so %s that they may even endure a full blown\n" + 
                            "%s as a result of it. Currently %.1f percent of known peladophobia-induced\n " + 
                            "panic attacks resulted in a catatonic state. Although such an influx of\n" + 
                            "%s will not always be the case for everyone suffering from peladophobia,\n" +
                            "it is still very plausible to occur nonetheless when there are\n" + 
                            "%d bald people around the %s.", s1,s2,i1,d1,s3,s4,s5,d2,s6,i2,s7);
    }
    
    /**
     * Function that simply prompts and returns an integer
     */
    private static int promptInt(){
        System.out.println("Please enter an integer: ");
        int out1 = matt.nextInt();
        return out1;
    }
    
    /**
     * Function that simply prompts and returns a double
     */
    private static double promptDouble(){
        System.out.println("Please enter a double: ");
        double out2 = matt.nextDouble();
        return out2;
    }
    
    /**
     * Function that prompts and returns a String. "type" is simply what comes after "Please enter a "
     */
    private static String promptString(String label){
        System.out.println("Please enter a "+label+": ");
        String out3 = matt.nextLine();
        return out3;
    }
    
}
