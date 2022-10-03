/*
    Name:       Jake Wang
    Date:       9/13/22
    Period:     1

    Is this lab fully working?  Yes
    If not, explain:
    If resubmitting, explain:
*/
import gpdraw.*;
//import period_1_house_parts.*;
import period_2_house_parts.*;
import java.awt.Color;
public class P1_Wang_Jake_CoolHouse
{
    public static void main(String[] Args){
        
        SketchPad canvas = new SketchPad(800, 600, 1);
        P2_Emani_Krishna_Background bg = new P2_Emani_Krishna_Background(false, canvas);
        bg.drawBackground();
        
        P2_Shen_Florence_Bush bush = new P2_Shen_Florence_Bush(-320, -200, 40, 8, canvas);
        bush.setColor(new Color(60, 190, 60));
        bush.draw();
        
        P2_Chou_Eric_House home = new P2_Chou_Eric_House((new DrawingTool(canvas)),400,200,0,0,(new Color(160,127,118)),30,(new Color(106,180,105)));
        home.draw();
        
        P2_Nakazato_Mayu_Cat cta = new P2_Nakazato_Mayu_Cat(300, -220, canvas);
        cta.draw();
        
        P2_Laxmanan_Asteya_Door door = new P2_Laxmanan_Asteya_Door(canvas, 60, 100, 230, -148);
        door.setDoorColor(new Color(210,136,17));
        door.draw();
        
        
        P2_Gowda_Apoorva_Window dowwin = new P2_Gowda_Apoorva_Window(115,-100,new DrawingTool(canvas));
        dowwin.setFrameWidth(4);
        dowwin.draw();
        dowwin = new P2_Gowda_Apoorva_Window(315,-100,new DrawingTool(canvas));
        dowwin.setFrameWidth(4);
        dowwin.draw();
    }
}
