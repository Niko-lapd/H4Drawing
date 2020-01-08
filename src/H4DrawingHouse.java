import java.applet.*;
import java.awt.*;

public class H4DrawingHouse extends Applet {

    public void paint(Graphics g)
    {
        int x[] = {150, 300, 225};
        int y[] = {150, 150, 225};
        g.drawRect(150, 150, 150, 200);
        g.drawRect(200, 200, 50, 150);
        g.drawOval(200, 75, 50, 50);
        g.drawLine(150, 150, 225, 50);
        g.drawLine(300, 150, 225, 50);
    }
}