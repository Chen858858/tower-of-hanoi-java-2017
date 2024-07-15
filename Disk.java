//Junchen Wang

import javax.swing.*;
import java.awt.*;
import java.util.*;

public abstract class Disk extends JPanel {
	private int w,x,y,rC,gC,bC;
	/* 
	 * Use for variables declared above:
	 * w:variable for width, 
	 * x:variable for x position, 
	 * y:variable for y position, 
	 * rC: variable for red of rgb, 
	 * gC: variable for green of rgb, 
	 * bC: variable for blue of rgb 
	 */
	public Disk(int iW, int iX, int iY, int iR, int iG, int iB){
		/*
		 * sets w to iW
		 * sets x to iX
		 * sets y to iY
		 * sets rC to iR
		 * sets gC to iG
		 * sets bC to iB
		 */
		w=iW;
		x=iX;
		y=iY;
		rC=iR;
		gC=iG;
		bC=iB;
		DrawDisk();//calls method to draw the disk
	}
	
	/* method to draw the disk */
	public void DrawDisk(){
		/*sets position to x,y;width to w;height to 50*/
		setBounds(x,y,w,50);
		setBackground(new Color(rC, gC, bC));//sets color of disk
	}
	public void changeLocation(int nX, int nY){
		/*changes the location of the disk when called*/
		x=nX;//sets x to nX
		y=nY;//sets y to nY
		DrawDisk();//redraws disk
	}
	abstract int getIdentification();/*abstract method to get identification of disk*/
	
}
//ALL COMMENTED
