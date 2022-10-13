// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE

        g.drawLine(25, 25, 25, 200);
        g.drawLine(25, 25, 200, 25);
        g.drawLine(25, 200, 200, 200);
        g.drawLine(200, 25, 200, 200);
        g.drawLine(75, 250, 250, 250);
        g.drawLine(75, 75, 250, 75);
        g.drawLine(75, 75, 75, 250);
        g.drawLine(250, 75, 250, 250);
        g.drawLine(25, 25, 75, 75);
        g.drawLine(200, 25, 250, 75);
        g.drawLine(25, 200, 75, 250);
        g.drawLine(200, 200, 250, 250);

        // DRAW SPHERE
        g.drawOval(550, 50, 200, 200);
        g.drawOval(575, 50, 150, 200);
        g.drawOval(600, 50, 100, 200);
        g.drawOval(625, 50, 50, 200);

        g.drawOval(550, 125, 200, 50);
        g.drawOval(550, 100, 200, 100);
        g.drawOval(550, 75, 200, 150);

        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

        g.drawOval(25, 300, 400, 400);

        g.drawLine(30, 450, 360, 350);
        g.drawLine(30, 450, 150, 684);
        g.drawLine(150, 684, 360, 350);

        g.drawOval(66, 415, 188, 167);

        // DRAW APCS
        // Letter A
        g.drawRect(675, 600, 50, 200);
        g.fillRect(675, 600, 50, 200);
        g.drawRect(675, 575, 150, 50);
        g.fillRect(675, 575, 150, 50);
        g.drawRect(775, 600, 50, 200);
        g.fillRect(775, 600, 50, 200);
        g.drawRect(675, 660, 150, 50 );
        g.fillRect(675, 660, 150, 50);
        // Letter P
        g.drawRect(875, 575, 50, 225);
        g.fillRect(875,575, 50, 225);
        g.drawRect(875, 575, 150, 50);
        g.fillRect(875, 575, 150, 50);
        g.drawRect(875, 660, 150, 50);
        g.fillRect(875, 660, 150, 50);
        g.drawRect(975, 575, 50, 125);
        g.fillRect(975, 575, 50, 125);
        // Letter C
        g.drawRect(1075, 575, 50, 225);
        g.fillRect(1075, 575, 50, 225);
        g.drawRect(1075, 575, 150, 50);
        g.fillRect(1075, 575, 150, 50);
        g.drawRect(1075, 750, 150, 50);
        g.fillRect(1075, 750, 150, 50);
        // Letter S
        g.drawRect(1275, 750, 150, 50);
        g.fillRect(1275, 750, 150, 50);
        g.drawRect(1275, 660, 150, 50 );
        g.fillRect(1275, 660, 150, 50);
        g.drawRect(1275, 575, 150, 50);
        g.fillRect(1275, 575, 150, 50);
        g.drawRect(1275,575, 50, 130);
        g.fillRect(1275, 575, 50, 130);
        g.drawRect(1375, 660, 50, 130);
        g.fillRect(1375, 660, 50, 130);

        // DRAW PACMEN FLOWER

        g.fillArc(775, 350, 125, 100, 40, 275);
        g.fillArc(700, 290, 125, 100, 120, 300);
        g.fillArc(625, 350, 125, 100, 200, 300);
        g.fillArc(700, 415, 125, 100, 300, 300);

    }

}


