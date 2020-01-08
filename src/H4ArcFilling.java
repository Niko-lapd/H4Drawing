import javax.swing.*;
import java.applet.*;
import java.awt.*;


public class H4ArcFilling extends Applet {

    public void paint(Graphics graphics){

        graphics.drawArc(650,225,250,250,250,450);
        graphics.setColor(Color.yellow);
        graphics.fillArc(650,225,249,249,250,450);
    }
    public void init(){

        setBackground(new Color(139,154,246));
    }
}
