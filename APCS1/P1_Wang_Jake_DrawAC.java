/*
    Name:       Jake Wang
    Date:       8/30/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/

import gpdraw.*;
import java.awt.Color;
import java.util.Random;
public class P1_Wang_Jake_DrawAC
{
    int xCenter;
    int yCenter;
    boolean IsSnowing;
    SketchPad pad;
    int scale;
    Random rand;
    DrawingTool pen;
    
    public P1_Wang_Jake_DrawAC(int x, int y, boolean snowstatus, SketchPad paper){
        this.scale = scale;
        xCenter = x;
        yCenter = y;
        IsSnowing = snowstatus;
        pad = paper;
        
        scale = 1;
    }
    
    public P1_Wang_Jake_DrawAC(int x, int y, boolean snowstatus, SketchPad paper, int scale ){
        this.scale = scale;
        this.scale = scale;
        xCenter = x;
        yCenter = y;
        IsSnowing = snowstatus;
        pad = paper;
    }
    
    public void draw(){
        pen = new DrawingTool(pad);
        
        pen.up();
        pen.move(xCenter, yCenter);
        
        pen.setColor(new Color(190, 153, 124));
        pen.down();
        pen.fillRect(scale*46,scale*48);
        pen.up();
        
        pen.setDirection(90);
        pen.move(scale*-8);
        pen.setColor(new Color(90, 99, 101));
        pen.down();
        pen.fillRect(scale*40, scale*26);
        pen.up();
        
        pen.move(xCenter-20*scale, yCenter+5*scale);
        pen.setColor(new Color(195, 201, 205));
        pen.setWidth(scale);
        
        for (int r=0; r<=12; r++){
            pen.setDirection(0);
            pen.down();
            pen.move(scale*40);
            pen.up();
            pen.setDirection(270);
            pen.move(scale*2);
            pen.setDirection(180);
            pen.move(scale*40);
        }
        if (IsSnowing==true){
            pen.move(xCenter, yCenter+scale*29);
            pen.setColor(new Color(247, 255, 241));
            pen.down();
            pen.fillRect(scale*46, scale*10);
            pen.up();
        }
    }
}
