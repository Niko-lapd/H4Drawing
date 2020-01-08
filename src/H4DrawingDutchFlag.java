import java.applet.*;
import java.awt.*;

public class H4DrawingDutchFlag extends Applet {

    public void paint(Graphics graphics)
    {
        graphics.setColor(Color.black);
        graphics.drawLine(200, 50, 200, 200);
        graphics.setColor(Color.red);
        graphics.fillRect(200, 50, 125, 25);
        graphics.setColor(Color.white);
        graphics.fillRect(200, 75, 125, 25);
        graphics.setColor(Color.blue);
        graphics.fillRect(200, 100, 125, 25);

        graphics.setColor(Color.black);
        graphics.drawRect(200, 50, 125, 25);
        graphics.drawRect(200, 75, 125, 25);
        graphics.drawRect(200, 100, 125, 25);
    }
}