import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel{

    Image img = new ImageIcon("/Users/kunari/Desktop/Програмирование на Java/LAB5/src/LAB5/ok.jpg").getImage();

    public static void main(String[] args){
        JFrame fr = new JFrame();
        fr.setLayout(null);
        fr.setSize(600,600);
        Main m = new Main();
        m.setBounds(0,0,600,600);
        fr.add(m);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
}
