
import java.awt.*;
import java.applet.*;


public class Lab04110pt extends Applet
{

    public void paint(Graphics g)
    {


        // DRAW CUBE
        g.drawLine(50,250,125,350);
        g.drawLine(125,350,125,150);
        g.drawLine(125,150,50,75);
        g.drawRect(125,150,175,200);
        g.drawRect(50,75,175,175);
        g.drawLine(225,250,300,350);
        g.drawLine(225,75,300,150);


        // DRAW SPHERE
        g.drawOval(175,125,25,175);
        g.drawOval(150,125,75,175);
        g.drawOval(125,125,125,175);
        g.drawOval(100,125,175,175);
        g.drawOval(100,200,175,25);
        g.drawOval(100,175,175,75);
        g.drawOval(100,150,175,125);
        g.drawOval(100,125,175,175);


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(650,300,300,300);
        g.drawLine(670,375,940,400);
        g.drawLine(940,400,725,580);
        g.drawLine(725,580, 670,375);
        g.drawOval(696,383,129,150);


        // DRAW APCS
        g.fillRect(50,475,25,125);
        g.fillRect(75,475,50,25);
        g.fillRect(100,500,25,100);
        g.fillRect(75,525,25,25);
        g.fillRect(150,475,25,125);
        g.fillRect(175,475,50,25);
        g.fillRect(200,500,25,25);
        g.fillRect(175,525,50,25);
        g.fillRect(250,475,25,125);
        g.fillRect(275,475,50,25);
        g.fillRect(275,575,50,25);
        g.fillRect(350,475,25,75);
        g.fillRect(375,475,50,25);
        g.fillRect(375,525,50,25);
        g.fillRect(400,550,25,25);
        g.fillRect(350,575,75,25);

        // DRAW PACMEN FLOWER
        g.fillArc(400,250,75,75,140,255);
        g.fillArc(350,300,75,75,140,-280);
        g.fillArc(400,350,75,75,330,240);
        g.fillArc(450,300,75,75,45,280);


    }

}


