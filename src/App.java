import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Mon App");
        ImageIcon icone = new ImageIcon("src/icone.png");
        JLabel label = new JLabel();

        frame.setSize(1580, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // label.setBounds(0, 0, 512, 512);
        // label.setVerticalAlignment(JLabel.TOP);
        // label.setOpaque(true);
        // label.setBackground(Color.black);
        // label.setForeground(new Color(0x456789));
        // label.setFont(new Font("Andale Mono", Font.BOLD, 30));
        // label.setHorizontalTextPosition(JLabel.CENTER);
        // label.setVerticalTextPosition(JLabel.TOP);
        // label.setText("First Test with Swing");

        int signe = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                hexagon p = new hexagon();
                p.setBackground(Color.red);
                p.setOpaque(false);
                if(i%2==0)
                    p.setBounds(j*220,i*220 - 60*(i==0?0:i), 220, 220);
                else{
                    p.setBounds(j*220+110*signe,i*220 - 60*i, 220, 220);
                    signe *= signe*-1 ;
                }
                p.setLayout(null);
                frame.add(p);
            }
        }
                
 
        //label.setIcon(icone); 
        frame.setLayout(null);
        frame.add(label);

    }
}
