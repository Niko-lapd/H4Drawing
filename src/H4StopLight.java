import java.applet.*;
import java.awt.*;


public class H4StopLight extends Applet{

    public void paint(Graphics graphics){

        graphics.fillRect(650,175,150,400);
        graphics.drawRect(650,175,150,400);
        graphics.drawRect(635,160,180,430);
        graphics.drawLine(650,305,800,305);
        graphics.drawLine(650,450,800,450);
        graphics.fillRect(710,590,25,175);
        graphics.drawRect(710,590,25,175);

        graphics.setColor(Color.red);
        graphics.fillOval(683,197,85,85);
        graphics.setColor(Color.orange);
        graphics.fillOval(683,335,85,85);
        graphics.setColor(Color.green);
        graphics.fillOval(683,470,85,85);

        graphics.drawOval(683,197,85,85);
        graphics.drawOval(683,335,85,85);
        graphics.drawOval(683,470,85,85);

    }
}
