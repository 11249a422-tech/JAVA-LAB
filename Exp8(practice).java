
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class BarChart extends Applet {
    public void paint(Graphics g) {
        int[] marks = {80, 60, 90, 70, 50};
        int x = 50;
        int base = 200;

        g.setColor(Color.BLUE);

        for (int i = 0; i < marks.length; i++) {
            int height = marks[i];

            // Draw the bar
            g.fillRect(x, base - height, 40, height);

            // Display marks above the bar
            g.setColor(Color.BLACK);
            g.drawString(String.valueOf(marks[i]),
                         x + 10, base - height - 5);

            g.setColor(Color.BLUE);
            x += 60;
        }
    }
}
