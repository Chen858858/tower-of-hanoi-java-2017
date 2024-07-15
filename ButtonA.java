//Junchen Wang


import java.awt.*;
import javax.swing.*;

public class ButtonA extends JButton{
	/*Use for variables declared below:
	 * w: variable for width,
	 *h: variable for height
	 */
	private int w;
	private int h;

	public ButtonA(String bText,int iW,int iH){
		super(bText);//set the text of the button to bText
		/*
		 * What is done below:
		 * sets w (width variable) to iW
		 * sets h (height variable) to iH
		 * sets width of button to w and height to h
		 */
		w=iW;
		h=iH;
		setSize(w,h);
		Font font = new Font("Tahoma", Font.PLAIN, 16);//font Tahoma, font size 16
		setFont(font);//sets font of button to Font object font

	}
}
//ALL COMMENTED
