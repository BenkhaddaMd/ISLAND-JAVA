import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class hexagon extends JPanel{

    public hexagon(){
        setPreferredSize(new Dimension(220, 220));
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int[] xPoints = {110,210,210,110,10,10};
        int[] yPoints = {210,160,60,10,60,160};
        g.fillPolygon(xPoints, yPoints, xPoints.length);
    }
}
