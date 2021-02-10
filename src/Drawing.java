import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Drawing extends Canvas {


    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {

        Rectangle half = new Rectangle(0, 100, 200, 200);
        g.setColor(Color.BLUE);
        g.fillRect(half.x, half.y, half.width, half.height);
        half.translate(200, 0);
        g.setColor(Color.RED);
        g.fillRect(half.x, half.y, half.width, half.height);
        g.setColor(Color.BLACK);
        g.drawLine(0, 20, 100, 120);
    }
}