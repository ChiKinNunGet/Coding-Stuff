import java.awt.Point;
/**
 * This class offers various math functions including: Farenheight to Celcius converters,
 * sphere volume finder, right triangle hypotenuse solver, chemistry atom count calculator,
 * random integer generator,and triangle perimeter finder.
 * @author Jake Wang Ferrante P1
 */
public class P1_Wang_Jake_Math
{
    static final double AVOCADO = 6.022140857e23;
    /**
     * Converts farenheit temperature to equivalent celcius temperature 
     * @param F The temperature in degrees Farenheit (double)
     * @return The equivalent temperature in degrees Celcius (double)
     */
    public static double fToC(double F){
        double C = 5*(F-32)/9;
        return C;
    }
    
    /**
     * Converts celcius temperature to equivalent farenheit temperature
     * @param C The temperature in degrees Celcius (double)
     * @return The equivalent temperature in degrees Farenheit (double)
     */
    public static double cToF(double C){
        double F = 1.8*C+32;
        return F;
    }
    
    /**
     * Finds the volume of sphere with given radius 
     * @param r The radius of the given sphere (double)
     * @return The volume of the same sphere (double)
     */
    public static double sphereVol(double r){
        double vol = ((double)4/3)*(Math.PI*Math.pow(r,3));
        return vol;
    }
    
    /**
     * Finds the hypotenuse of a right triangle with given leg lengths using the pythagorean theorem
     * @param a The first leg length (double)
     * @param b The other leg length (double)
     * @return The length of the hypotenuse of the triangle (double)
     */
    public static double pythag(double a, double b){
        double c = Math.pow(Math.pow(a,2)+Math.pow(b,2),0.5);
        return c;
    }
    
    /**
     * Finds the amount of atoms in a pure chemical sample given gram mass and molar mass of molecule, using Avogadro's number
     * @param m_m The molar mass of the chemical in question (double)
     * @param m The mass, in grams, of the substance (double)
     * @return The number of molecules/atoms in the sample, in scientific notation (double)
     */
    public static double mole(double m_m, double m){
        double num = AVOCADO*m/m_m;
        return num;
    }
    
    /**
     * Generates a random integer between two values, inclusive
     * @param a The lower bound of the range to pick random numbers from (int)
     * @param b The upper bound of the range to pick random numbers from (int)
     * @return A randomly generated integer between a and b, inclusive (int)
     */
    public static int randInt(int a, int b){
        int matt = (int)((b-a+1)*Math.random()) + a;
        return matt;
    }
    
    /**
     * Finds the perimeter of a triangle given three java.awt.Point objects representing vertices
     * @param a One of the vertices of the triangle (Point)
     * @param b Another of the vertices of the triangle (Point)
     * @param c The last vertex of the triangle (Point)
     * @return The perimeter of the triangle (double)
     */
    public static double perimeter(Point a, Point b, Point c){
        double p = a.distance(b)+b.distance(c)+c.distance(a);
        return p;
    }
}
