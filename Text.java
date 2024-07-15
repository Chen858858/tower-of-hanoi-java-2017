//Junchen Wang
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class Text extends JPanel{
	/*
	 * Use for variables declared below:
	 * text:variable for the text
	 * fontName:variable for font name
	 * textSize:variable for text size
	 * x:variable for x position
	 * y:variable for y position
	 */
	private String text;
	private String fontName;
	private int textSize;
	private int x;
	private int y;
	
	public Text(String t, String f, int tSize, int xIn, int yIn){
		text=t;//sets text to t
		fontName=f;//sets fontName to f
		textSize=tSize;//sets textSize to tSize
		x=xIn;//sets x to xIn
		y=yIn;//sets y to yIn
	}
	
	/*paints the text*/
	public void paint(Graphics g) {
	      Graphics2D g2 = (Graphics2D)g;
	      g2.setRenderingHint(
	         RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	   
	      /*
	       * font=fontName
	       * text size=textSize
	       */
	      Font font = new Font(fontName, Font.PLAIN, textSize);
	      g2.setFont(font);//sets font of text to Font font
	      g2.drawString(text, x, y);//sets the text to display, x and y position
	   }
	
	/*changes location of the text*/
	public void changeLocation(int nX, int nY){
		x=nX;//sets x to nX
		y=nY;//sets y to nY
	}
}
//ALL COMMENTED
