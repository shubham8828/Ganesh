import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Ganesh extends JFrame {
    Ganesh() {

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Ganesh.jpg"));
        JLabel l = new JLabel(img);
        l.setBounds(35, 10, 550, 550);
        add(l);
        JLabel l2 = new JLabel("");
        add(l2);

        setVisible(true);
        setSize(635, 610);
        setResizable(false);
        setLocation(450, 30);
        while (true) {
            Color a[] = { Color.red, Color.BLUE, Color.CYAN, Color.GREEN, Color.PINK };
            Random r = new Random();
            int i = r.nextInt(a.length);
            getContentPane().setBackground(a[i]);
        }
    }

    public static void main(String[] args) {
        new Ganesh();
    }
}