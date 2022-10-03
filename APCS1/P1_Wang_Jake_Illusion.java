/*
    Name:       Jake Wang
    Date:       9/17/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/
import java.awt.Color;
import gpdraw.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;
public class P1_Wang_Jake_Illusion {
    BufferedImage image;
    String url;
    int w;
    int h;
    int xMin;
    int yMin;
    SketchPad pad;
    DrawingTool pen0;
    Color filter = new Color(0,100,100);
    
    /**
     * Just initializes the url to read the file from
     * @param link url to draw, example is https://i.imgur.com/pN82jdV.png. Things in this imgur link format tend to work
     */
    public P1_Wang_Jake_Illusion(String link){
        url = link;
    }

    /**
     * This loads the image using ImageIO and BufferedImage, and initialized image dimensions/position. Helper function, no need to explicitly run
     */
    public void loadAndDraw(){
        try{
            image = ImageIO.read(new URL(url));
        }
        catch(Exception e){
            System.out.println("sad!");
        }
        w = image.getWidth();
        h = image.getHeight();
        xMin += image.getMinX();
        yMin += image.getMinY();
        pad = new SketchPad(w, h, 0);
        pen0 = new DrawingTool(pad);
        for (int j=-(h/2);j<(h/2);j++){
            row(j, image);
        }
    }
    
    /**
     * @param link url for the image (optical illusion) that will be drawn. Preferably one with a filename extension
     */
    public void setLink(String link){
        url = link;
    }
    
    /**
     * Draws except with a color filter over the image, the exact formula is complicated but its similar to adding.
     * @param filter the color filter to be added (java.awt.Color)
     */
    public void setFilter(Color filter){
        this.filter = filter;
    }
    
    /**
     * Shifts the image so that its center is on (cX, cY), in gpdraw coordinates
     * @param cX x value of new image center
     * @param cX x value of new image center
     */
    public void setLocation(int cX, int cY){
        xMin+=cX;
        yMin+=cY;
    }
    
    /**
     * sets gpdraw DrawingTool
     * @param pen0 pen to use
     */
    public void setPen(DrawingTool pen0){
        this.pen0=pen0;
    }
    
    /**
     * helper function to add and scale two numbers
     * @param a primary number to be added to, this is the original color
     * @param b secondary number to added, this is the color filter
     */
    private double scale(double a, double b){
        int max = 255;
        double sum = a + (b/255)*(255-a);
        return sum;
    }
    /**
     * Draws pixel from buffered image by taking the color of corresponding pixel. helper function, no need to explicitly run
     * @param x x value on gpdraw coords
     * @param y y value on gpdraw coords
     */
    private Color findColor(int x, int y, BufferedImage image){
        Color c;
        Color i = new Color(image.getRGB(x+w/2, y+h/2));
        c = new Color((int)scale(i.getRed(),filter.getRed()),(int)scale(i.getGreen(),filter.getGreen()),(int)scale(i.getBlue(),filter.getBlue()));
        return c;
    }
    /**
     * This draws a single row based on the height of the row and the source image. Helper function, no need to explicitly run
     * @param j gpdraw y value of the pixel row to draw
     * @param image BufferedImage image passed in to pass down to findColor
     */
    private void row(int j, BufferedImage image){
        for (int i=-w/2;i<w/2;i++){
            pen0.up();
            pen0.move(i, -j);
            pen0.setColor(findColor(i, j, image));
            pen0.down();
            pen0.drawRect(1, 1);
            pen0.up();
        }
    }
}