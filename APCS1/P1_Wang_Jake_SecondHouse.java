/*
    Name:       Jake Wang
    Date:       8/29/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/

import gpdraw.*;
import java.awt.Color;
import java.util.Random;


public class P1_Wang_Jake_SecondHouse {
    static DrawingTool pen;
    
    public void Unit(int xCenter, int yCenter, SketchPad paper, double ACChance, boolean IsSnowing, P1_Wang_Jake_SecondHouse house){ //drawing a single apartment pen 
        pen = new DrawingTool(paper);
        Random rand = new Random();
        
        //since starting location is passed in, all movements should be relative, not absolute
        pen.up();
        pen.move(xCenter, yCenter); //center in middle of frame
        pen.setDirection(90);
        
        Color Concrete = new Color(217,208,193); //not used, just for semi-random color
        Color ConcreteLight = new Color(237,228,213);
        Color ConcreteDark = new Color(207,198,183);
        Color WindowDark = new Color(142,190,216);
        Color WindowLight = new Color(180,212,229);
        Color Black = new Color (40,48,32);
        
        //drawing pen now
        pen.down(); //Centered
        int RedRand = rand.nextInt(30);
        int GreenRand = rand.nextInt(30);
        int BlueRand = rand.nextInt(30);
        pen.setColor(new Color(202+RedRand, 193+GreenRand, 178+BlueRand));
        pen.fillRect(200, 150);
        pen.up();
        
        //windows
        pen.move(20); //(0, 20)
        pen.down();
        pen.setColor(Black);
        pen.fillRect(190, 90);
        pen.setColor(WindowDark);
        pen.fillRect(188, 88);
        pen.setColor(ConcreteLight);
        pen.fillRect(104, 88);
        pen.setColor(WindowLight);
        pen.fillRect(94, 88);
        pen.setColor(ConcreteLight);
        pen.fillRect(5, 88);
        pen.up();
        
        //bars below windows
        pen.move(-70); //(0, -50)
        pen.down();
        pen.setColor(ConcreteDark);
        pen.fillRect(190, 40);
        pen.up();
        pen.move(-20); //(0, -70), 5 from bottom margin
        pen.setDirection(180);
        pen.move(95); //(-95, -70). (5, 5) if origin were at bottom left
        pen.down();
        pen.setColor(Black);
        pen.setWidth(2);
       
        for (int i = 0; i<=9; i++) {
            pen.move((xCenter+i*19-85.5), (yCenter-30));
            pen.move((xCenter+i*19-76), (yCenter-70));
        }  
        
        int RandVal = rand.nextInt(100);
        if (RandVal<=100*ACChance){
            if (RandVal%2 != 0){
                house.DrawAC((xCenter-23), yCenter, IsSnowing, paper, 1);
            }
            else {
                house.DrawAC((xCenter+23), yCenter, IsSnowing, paper, 1);
            }
        }
    }

    public void DrawAC(int xCenter, int yCenter, boolean IsSnowing, SketchPad paper, int scale){
        pen = new DrawingTool(paper);
        
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

    public static void main(String[] args) {
        SketchPad paper;  
        DrawingTool setup;
        P1_Wang_Jake_SecondHouse apartment = new P1_Wang_Jake_SecondHouse();
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
                apartment.Unit((-300+200*c), (-225+150*r), paper, ACChance, IsSnowing, apartment);
            }
        }
        if (IsSnowing==true){
            setup.setColor(new Color(247, 255, 241));
            for (int f=1; f<=100+rand.nextInt(50);f++){
                setup.up();
                setup.move(-300+rand.nextInt(600), (-300+rand.nextInt(600)));
                setup.down();
                setup.fillCircle(1+rand.nextInt(10));
                setup.up();
            }
        }
    }   
}
