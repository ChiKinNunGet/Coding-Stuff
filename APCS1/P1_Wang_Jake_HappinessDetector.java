/*
    Name:       Jake Wang
    Date:       9/26/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/
import com.controlStructures.*;
public class P1_Wang_Jake_HappinessDetector implements HappinessDetector
{
    public boolean isHappy(int num, int a, int b)
    {
        boolean general = ((num%a==0)&&(!(num%b==0)));
        boolean rule2 = (31<=num)&&(num<=53);
        boolean rule3 = num<=15;
        boolean rule4 = (num%2==1)&&(81<=num)&&(num<=99);
        boolean rule5 = num<0;
        
        if (rule5 == true){
            return false;
        }
        if (rule3){
            if (!general){
                return true;
            }else{
                return false;
            }
        }
        if (general == true || rule2 == true || rule4 == true){
            return true;
        }
        return false;
    }
    public static void P1_Wang_Jake_HappinessDetector(){}
}
