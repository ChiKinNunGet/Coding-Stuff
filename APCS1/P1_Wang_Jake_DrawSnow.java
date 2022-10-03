/*
    Name:       Jake Wang
    Date:       9/3/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/
import gpdraw.*;
import java.util.Random;
import java.awt.Color;
/**
 * Function to draw snow with when IsSnowing is on
 */
public class P1_Wang_Jake_DrawSnow
{
    int minimum;
    int randrange;
    Color color;
    int sizemin;
    int sizemax;
    Random rand;
    DrawingTool snow;
    SketchPad pad;
    /**
     * @param paper the gpdraw.SketchPad object to create a pen for and draw on
     */
    public P1_Wang_Jake_DrawSnow(SketchPad paper){
        minimum = 100;
        randrange = 50;
        color = new Color(247, 255, 241);
        sizemin = 1;
        sizemax = 10;
        pad = paper;
    }
    
    /**
     * @param minimum The minimum amount of snowflakes to draw
     * @param randrange The number from which the random number of snowflakes to add on top of minimum is
     * @param paper The gpdraw.SketchPad object to create a pen for and to draw on
     */
    public P1_Wang_Jake_DrawSnow(int minimum, int randrange, SketchPad paper)
    {
        // initialise instance variables
        this.minimum = minimum;
        this.randrange = randrange;
        
        color = new Color(247, 255, 241);
        sizemin = 1;
        sizemax = 10;
        pad = paper;
    }
    /**
     * @param minimum minimum number of "snowflakes". default 100
     * @param randrange range between lower and higher limits. Total number of snowflakes = minimum+(random number between 0 and randrange). default 50
     * @param color color of snowflakes. default (247, 255, 241) RGB
     * @param sizemin minimum radius of snowflake
     * @param sizemax maximum radius of snowflake
     * @param paper SketchPad object from gpdraw to draw on
     */
    public P1_Wang_Jake_DrawSnow(int minimum, int randrange, Color color, int sizemin, int sizemax, SketchPad paper){
        this.minimum = minimum;
        this.randrange = randrange;
        this.color = color;
        this.sizemin = sizemin;
        this.sizemax = sizemax;
        pad = paper;
    }
    
    /**
     * self explanatory
     */
    public void draw(){
        Random rand = new Random();
        for (int f=1; f<=minimum+rand.nextInt(randrange);f++){
            snow = new DrawingTool(pad);
            snow.setColor(color);
            snow.up();
            snow.move(-300+rand.nextInt(600), (-300+rand.nextInt(600)));
            snow.down();
            snow.fillCircle(sizemin+rand.nextInt(sizemax-1));
            snow.up();
            }
    }
    
    /**
     * @param SnowColor color of snow in RBG (using java.awt.Color0
     */
    public void SetColor(Color SnowColor){
        color = SnowColor;
    }
}
