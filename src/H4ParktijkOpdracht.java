import java.applet.*;
import java.awt.*;

public class H4ParktijkOpdracht extends Applet {
    public void paint(Graphics graphics){

        graphics.drawRect(200,175,250,150);
        graphics.drawRoundRect(600,175,250,150,25,25);
        graphics.drawOval(1020,175,125,125);

        graphics.drawOval(200,450,250,150);
        graphics.drawArc(20,20,150,75,25,360);
        graphics.setColor(Color.magenta);
        graphics.fillArc(20,20,150,75,90,45);


        graphics.setColor(Color.MAGENTA);
        graphics.drawOval(975,350,250,150);
        graphics.fillOval(975,350,251,151);

        graphics.setColor(Color.MAGENTA);
        graphics.drawRect(200,450,250,150);

        graphics.fillRect(200,450,250,150);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(200,450,250,150);


    }
}
