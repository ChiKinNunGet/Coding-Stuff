/*
    Name:       Jake Wang
    Date:       8/30/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/
import gpdraw.*;
import java.util.Random;
import java.awt.Color;
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
    
    public P1_Wang_Jake_DrawSnow(SketchPad paper){
        minimum = 100;
        randrange = 50;
        color = new Color(247, 255, 241);
        sizemin = 1;
        sizemax = 10;
        pad = paper;
    }
    
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

    public P1_Wang_Jake_DrawSnow(int minimum, int randrange, Color color, int sizemin, int sizemax, SketchPad paper){
        this.minimum = minimum;
        this.randrange = randrange;
        this.color = color;
        this.sizemin = sizemin;
        this.sizemax = sizemax;
        pad = paper;
    }
    
    public void draw(){
        Random rand = new Random();
        for (int f=1; f<=minimum+rand.nextInt(randrange);f++){
            snow = new DrawingTool(pad);
            snow.up();
            snow.move(-300+rand.nextInt(600), (-300+rand.nextInt(600)));
            snow.down();
            snow.fillCircle(sizemin+rand.nextInt(sizemax-1));
            snow.up();
            }
    }
    
    public void SetColor(Color SnowColor){
        color = SnowColor;
    }
}
