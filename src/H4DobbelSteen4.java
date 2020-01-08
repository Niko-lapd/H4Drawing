    import javax.swing.*;
    import java.applet.*;
    import java.awt.*;



    public class H4DobbelSteen4 extends  Applet{

        public void paint(Graphics graphics){

            getGraphics().drawRoundRect(575,300,240,240,175,175);
            graphics.fillOval(625,340,50,50);
            graphics.drawOval(625,340,50,50);
            graphics.fillOval(715,340,50,50);
            graphics.drawOval(715,340,50,50);
            graphics.fillOval(625,450,50,50);
            graphics.drawOval(625,450,50,50);
            graphics.fillOval(715,450,50,50);
            graphics.drawOval(715,450,50,50);

        }
    }