import java.util.Scanner;
import java.awt.Point;
public class P1_Wang_Jake_MathDriver
{
    public static void main(String[] Args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        while (true){
            System.out.println("pick a demo");
            int id = myObj.nextInt();  // Read user input
            if (id == 0){
                break;
            }
            if (id == 2){
                System.out.printf("%.1f\u00B0C --> %.1f\u00B0C\n", 212.0, P1_Wang_Jake_Math.fToC(212.0));
                System.out.printf("%.1f\u00B0C --> %.1f\u00B0C\n", 98.6, P1_Wang_Jake_Math.fToC(98.6));
                System.out.printf("%.1f\u00B0C --> %.1f\u00B0C\n", 37.0, P1_Wang_Jake_Math.cToF(37.0));
                System.out.printf("%.1f\u00B0C --> %.1f\u00B0C\n", -15.0, P1_Wang_Jake_Math.fToC(-15.0));
            }
            if (id == 3){
                System.out.println("Volume of a sphere with radius "+1.0+" is "+P1_Wang_Jake_Math.sphereVol(1.0));
                System.out.println("Volume of a sphere with radius "+6.8+" is "+P1_Wang_Jake_Math.sphereVol(6.8));
            }
            if (id == 4){
                System.out.println("A right triangle with sides "+3+" and "+4+" has hypotenuse "+P1_Wang_Jake_Math.pythag(3,4));
                System.out.println("A right triangle with sides "+2.5+" and "+9.25+" has hypotenuse "+P1_Wang_Jake_Math.pythag(2.5,9.25));
            }
            if (id == 5){
                System.out.println(0.75+"g of \""+"Fe"+"\" contains "+P1_Wang_Jake_Math.mole(55.85,0.75)+" atoms");
                System.out.println(5.24+"g of \""+"Au"+"\" contains "+P1_Wang_Jake_Math.mole(196.9,5.24)+" atoms");
                System.out.println(2.0+"g of \""+"Ne"+"\" contains "+P1_Wang_Jake_Math.mole(20.18, 2.0)+"atoms");
            }
            if (id == 6){
                System.out.println("A random number between "+7+" and "+9+" is: "+P1_Wang_Jake_Math.randInt(7,9));
                System.out.println("A random number between "+7+" and "+9+" is: "+P1_Wang_Jake_Math.randInt(7,9));
                System.out.println("A random number between "+7+" and "+9+" is: "+P1_Wang_Jake_Math.randInt(7,9));
            }
            if (id == 7){
                Point a = new Point(1,2);
                Point b = new Point(3,4);
                Point c = new Point(5,1);
                System.out.println("A triangle with vertices:\n\t" + a.toString() + "\n\t"+b.toString()+"\n\t"+c.toString()+"\nhas perimeter "+P1_Wang_Jake_Math.perimeter(a,b,c));
            }
            System.out.println();
        }
    }
}
