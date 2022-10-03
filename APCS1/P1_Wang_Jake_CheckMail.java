/*
    Name:       Jake Wang
    Date:       9/28/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/
import java.util.Scanner;
public class P1_Wang_Jake_CheckMail
{
    public P1_Wang_Jake_CheckMail()
    {
        Scanner matt = new Scanner(System.in);
        
        System.out.println("a, b, and c are three measurements in inches for each dimension of the package. \nThe order does not matter.");
        System.out.println("please enter a value for a");
        double a = matt.nextDouble();
        System.out.println("please enter a value for b");
        double b = matt.nextDouble();
        System.out.println("please enter a value for c");
        double c = matt.nextDouble();
        
        System.out.println("please enter the weight in pounds of the package");
        double w = matt.nextDouble();
        
        double p = 2*(a+b+c);
        p -= findGreatest(a,b,c);
        
        if (w > 70){
            if (p>100){
                System.out.println("Package is too large and too heavy");
            }else{
                System.out.println("Package is too heavy");
            }
        }else{
            if (p>100){
                System.out.println("Package is too large");
            }else{
                System.out.println("Package is acceptable");
            }
        }
    }

    private double findGreatest(double x, double y, double z){
        double max;
        if (x>=y){
            if (x>=z){
                max = x;
            }else{
                max = z;
            }
        }else{
            if (y>=z){
                max = y;
            }else{
                max = z;
            }
        }
        return max;
    }
}
