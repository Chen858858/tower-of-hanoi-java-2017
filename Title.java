//Junchen Wang
import javax.swing.*;
import java.awt.*;

/*Paints text*/
public class Title extends JPanel{
	public void paint(Graphics g) {
		  // Edited July 2024, fixed "5 Disks" text overlap.
	      Graphics2D g2 = (Graphics2D)g;
	      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	      /*
	       * font=Colonna MT
	       * font size=48
	       */
	      Font font = new Font("Colonna MT", Font.BOLD, 48);
	      g2.setFont(font);//sets font to Font object font
	      /*
	       * sets text to
	       * "Tower of Hanoi (5 Disks)"
	       */
	      g2.drawString("Tower of Hanoi       Disks", 15, 45);
	      g2.drawString("5",395,35);
	      g2.drawString("(             )",375,40);
	   }
}
//ALL COMMENTED

