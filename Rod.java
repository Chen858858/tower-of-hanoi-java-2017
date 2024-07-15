//Junchen Wang

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Rod extends JPanel{
	/*
	 * Use for variables declared below:
	 * rod: JPanel for rod,
	 * x:x-coordinate for location,
	 * y:y-coordinate for location
	 * rd:arraylist to store the identification numbers for the disks on the rod
	 */
	private JPanel rod;
	private int x,y;
	ArrayList<Integer> rd = new ArrayList<>();
	
	/*adds the identification of a disk to the beginning of the array rd because the disk is going to be on top of the rod*/
	public void addDisk(int d){
		rd.add(0,d);
	}
	/*removes the identification of the disk on the top of the rod*/
	public void removeDisk(){
		rd.remove(0);
	}
	/*returns the identification number of the top disk on the rod*/
	public int getFirstDisk(){
		if(rd.size()==0) return 0;//returns 0 if there are no disks on the rod
		return rd.get(0);
	}
	/*gets the size of the array rd which is how many disks are on the rod*/
	public int getArrayLength(){
		return rd.size(); 
	}
}

//ALL COMMENTED
