import javax.swing.*;
import java.applet.*;
import java.awt.*;


public class H4BarChart extends JApplet {


public void paint(Graphics graphics)
{


   // graphics.drawLine(200,10,200,200);
    graphics.drawLine(200,200,385,200);
    graphics.drawString("Jeroen", 215, 225);
    graphics.drawString("Valerie", 275, 225);
    graphics.drawString("Hans", 335, 225);
    graphics.drawString("40KG", 150, 150);
    graphics.drawString("80KG", 150, 55);
    graphics.drawString("100KG", 150,25);

    graphics.setColor(Color.green);
    graphics.fillRect(210,14,40,185);
    graphics.setColor(Color.blue);
    graphics.fillRect(275,144,40,55);
    graphics.setColor(Color.CYAN);
    graphics.fillRect(340,49,40,150);

    graphics.drawRect(210,14,40,185);
    graphics.drawRect(275,144,40,55);
    graphics.drawRect(340,49,40,150);
}



}