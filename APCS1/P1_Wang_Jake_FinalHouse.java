/*
    Name:       Jake Wang
    Date:       9/3/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/

import gpdraw.*;
import java.awt.Color;
import java.util.Random;

public class P1_Wang_Jake_FinalHouse{
    static DrawingTool pen;

    public static void main(String[] args) {
        SketchPad paper;  
        DrawingTool setup;
        P1_Wang_Jake_FinalHouse apartment = new P1_Wang_Jake_FinalHouse();
        Random rand = new Random();
        
        
        //Customizables
        double ACChance = 0.7; //chance for each pen to have an AC pen (random side)
        boolean IsSnowing = true; //Whether or not it'll be snowing
        
        paper = new SketchPad(600,600,2); 
        setup = new DrawingTool(paper); 
        
        //grid sestup
        setup.down();           
        setup.drawRect(400, 300);
        setup.drawRect(400, 600);
        setup.drawRect(600, 300);
        setup.move(-300, 0);
        setup.move(300, 0);
        setup.move(0, 0);
        setup.move(0, 300);
        setup.move(0, -300);
        setup.move(0, 0);
        setup.setDirection(90);
        
        for (int c=0; c<=3; c++){ //4 columns in each row
            for (int r=0; r<=3; r++){ //4 pens in each column
                P1_Wang_Jake_DrawUnit DrawUnit;
                DrawUnit = new P1_Wang_Jake_DrawUnit((-300+200*c), (-225+150*r), paper, ACChance);
                DrawUnit.SetSnowing(true);
                DrawUnit.Draw();
            }
        }
        if (IsSnowing==true){
            P1_Wang_Jake_DrawSnow DrawSnow;
            DrawSnow = new P1_Wang_Jake_DrawSnow(paper);
            DrawSnow.SetColor(new Color(247, 255, 241));
            DrawSnow.draw();
        }
    }   
}
