//Junchen Wang


import java.awt.*;
import javax.swing.*;

public class ButtonO extends JButton{
	/*
	 * Use for variables declared below:
	 * w: variable for width,
	 * h: variable for height
	 */
	private int w,h;
	public ButtonO(String bText,int iW,int iH){
		super(bText);//sets text of button to bText
		/*
		 * sets w (width variable) to iW
		 * sets h (height variable) to iH
		 */
		w=iW;
		h=iH;
		setSize(w,h);//sets width of button to w and height to h
		Font font = new Font("Tahoma", Font.PLAIN, 36);//font Tahoma, font size 36
		setFont(font);//sets font of button to Font object font

	}
}
//ALL COMMENTED
