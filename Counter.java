//Junchen Wang

import javax.swing.*;
import java.awt.*;

public class Counter extends JPanel{
	/*variable which represents the number of moves made*/
	private int moves = 0;
	/*+1 to variable moves when another move is executed (cannot do it automatically, needs to be called)*/
	public void addMove(){
		moves++;
	}
	public void paint(Graphics g) {
	      Graphics2D g2 = (Graphics2D)g;
	      g2.setRenderingHint(
	         RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	   
	      Font font = new Font("Verdana", Font.PLAIN, 48);//font Verdana, font size 48
	      g2.setFont(font);//sets font to Font object font
	      g2.setBackground(new Color(0,205,205));//sets text color
	      g2.drawString("Moves: " + moves,15, 620);//sets text (Moves: [variable moves]) and position of text at 15,620
	   }
	
	/*returns the number of moves made*/
	public int getMoves(){
		return moves;
	}
}
//ALL COMMENTED
