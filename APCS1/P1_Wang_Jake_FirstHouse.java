/*
    Name:       Jake Wang
    Date:       8/28/22
    Period:     1

    Is this lab fully working?  yes
    If not, explain:
*/

import gpdraw.*;
import java.awt.Color;
import java.util.Random;
public class P1_Wang_Jake_FirstHouse {
    public void Unit(int xCenter, int yCenter, SketchPad paper, double ACChance, boolean IsSnowing, P1_Wang_Jake_FirstHouse house){ //drawing a single apartment unit 
        DrawingTool unit;
        unit = new DrawingTool(paper);
        Random rand = new Random();
        
        //since starting location is passed in, all movements should be relative, not absolute
        unit.up();
        unit.move(xCenter, yCenter); //center in middle of frame
        unit.setDirection(90);
        
        Color Concrete = new Color(217,208,193); //not used, just for semi-random color
        Color ConcreteLight = new Color(237,228,213);
        Color ConcreteDark = new Color(207,198,183);
        Color WindowDark = new Color(142,190,216);
        Color WindowLight = new Color(180,212,229);
        Color Black = new Color (40,48,32);
        
        //drawing unit now
        unit.down(); //Centered
        int RedRand = rand.nextInt(30);
        int GreenRand = rand.nextInt(30);
        int BlueRand = rand.nextInt(30);
        unit.setColor(new Color(202+RedRand, 193+GreenRand, 178+BlueRand));
        unit.fillRect(200, 150);
        unit.up();
        
        //windows
        unit.move(20); //(0, 20)
        unit.down();
        unit.setColor(Black);
        unit.fillRect(190, 90);
        unit.setColor(WindowDark);
        unit.fillRect(188, 88);
        unit.setColor(ConcreteLight);
        unit.fillRect(104, 88);
        unit.setColor(WindowLight);
        unit.fillRect(94, 88);
        unit.setColor(ConcreteLight);
        unit.fillRect(5, 88);
        unit.up();
        
        //bars below windows
        unit.move(-70); //(0, -50)
        unit.down();
        unit.setColor(ConcreteDark);
        unit.fillRect(190, 40);
        unit.up();
        unit.move(-20); //(0, -70), 5 from bottom margin
        unit.setDirection(180);
        unit.move(95); //(-95, -70). (5, 5) if origin were at bottom left
        unit.down();
        unit.setColor(Black);
        unit.setWidth(2);
       
        for (int i = 0; i<=9; i++) {
            unit.move((xCenter+i*19-85.5), (yCenter-30));
            unit.move((xCenter+i*19-76), (yCenter-70));
        }  
        
        int RandVal = rand.nextInt(100);
        if (RandVal<=100*ACChance){
            if (RandVal%2 != 0){
                house.DrawAC((xCenter-23), yCenter, IsSnowing, paper);
            }
            else {
                house.DrawAC((xCenter+23), yCenter, IsSnowing, paper);
            }
        }
    }

    public void DrawAC(int xCenter, int yCenter, boolean IsSnowing, SketchPad paper){
        DrawingTool DrawAC;
        DrawAC = new DrawingTool(paper);
        
        DrawAC.up();
        DrawAC.move(xCenter, yCenter);
        
        DrawAC.setColor(new Color(190, 153, 124));
        DrawAC.down();
        DrawAC.fillRect(46,48);
        DrawAC.up();
        
        DrawAC.setDirection(90);
        DrawAC.move(-8);
        DrawAC.setColor(new Color(90, 99, 101));
        DrawAC.down();
        DrawAC.fillRect(40, 26);
        DrawAC.up();
        
        DrawAC.move(xCenter-20, yCenter+5);
        DrawAC.setColor(new Color(195, 201, 205));
        DrawAC.setWidth(1);
        
        for (int r=0; r<=12; r++){
            DrawAC.setDirection(0);
            DrawAC.down();
            DrawAC.move(40);
            DrawAC.up();
            DrawAC.setDirection(270);
            DrawAC.move(2);
            DrawAC.setDirection(180);
            DrawAC.move(40);
        }
        if (IsSnowing==true){
            DrawAC.move(xCenter, yCenter+29);
            DrawAC.setColor(new Color(247, 255, 241));
            DrawAC.down();
            DrawAC.fillRect(46, 10);
            DrawAC.up();
        }
    }

    public static void main(String[] args) {
        SketchPad paper;  
        DrawingTool setup;
        P1_Wang_Jake_FirstHouse apartment = new P1_Wang_Jake_FirstHouse();
        Random rand = new Random();
        
        
        //Customizables
        double ACChance = 0.5; //chance for each unit to have an AC unit (random side)
        boolean IsSnowing = false; //Whether or not it'll be snowing
        
        paper = new SketchPad(600,600); 
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
            for (int r=0; r<=3; r++){ //4 units in each column
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