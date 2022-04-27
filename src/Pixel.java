import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Pixel extends JPanel
{
   BufferedImage image;
   int width;
   int height;

    public Pixel() throws IOException
    {
      int size = 400;
      BufferedImage bi = new BufferedImage(size+300, size, BufferedImage.TYPE_INT_RGB);
      ImageIcon icon = new ImageIcon( bi );
      add( new JLabel(icon) );
      File input = new File("src/test.png");
      image = ImageIO.read(input);
      width = image.getWidth();
      height = image.getHeight();

      for (int y = 0; y < 400; y++)
      {
         for (int x = 0; x < 700; x++)
         {
               int imageX=1, imageY=1;
               Color c = new Color(image.getRGB(y%100, x%100));
               int colorValue = c.getRGB();
               bi.setRGB(imageY*y/100+y%100, imageX*x/100+x%100, colorValue);
         }
      }
    }

    public static void main(String[] args) throws IOException  
    {
      JFrame frame = new JFrame("Pixel");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add( new Pixel() );
      frame.setLocationByPlatform( true );
      frame.pack();
      frame.setVisible( true );
    }
}