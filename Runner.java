//Junchen Wang

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class Runner extends Frame implements WindowListener, ActionListener{
	/* Use for variables declared above:
	 * window: JFrame for the window,
	 * c:counter to count the moves
	 * lm,lr,ml,mr,rm,rl: buttons to move the disks
	 * open: button to open the game
	 * r1,r2,r3: rods (left, middle, right)
	 * d1,d2,d3,d4,d5: disks (d1 smallest TO d5 largest)
	 * illegalMove: text for illegal move warning
	 * amazing, excellent, superb, goodjob: congratulations when game is finished (congratulations differs depending on how many moves made)
	 */
	private JFrame window;
	private Counter c;
	private ButtonA lm,lr,ml,mr,rm,rl;
	private ButtonO open;
	private Rod r1,r2,r3;
	private Disk d1,d2,d3,d4,d5;
	private Text illegalMove, amazing, excellent, superb, goodjob; 
	
	public static void main(String args[]){
		Runner r=new Runner();
		/*executes Runner*/
	}
	
	public Runner() {
		
		/*
		 * initializes JFrame window
		 * sets title of window to "Tower of Hanoi (5 Disks)"
		 * sets window size to fullscreen
		 */
		window = new JFrame();
		window.setTitle("Tower of Hanoi (5 Disks)");
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setVisible(true);
		/*calls Show method*/
		Show();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}
	
	public void Show(){
		/*
		 * text to display name of creator
		 */
		Text creator = new Text("By Junchen Wang","Century Gothic",28,600,41);
		creator.setForeground(new Color(219,112,147));
		window.add(creator);
		window.setVisible(true);
		
		/*
		 * Text to display name of the game
		 */
		Title title = new Title();
		title.setForeground(new Color(142,56,152));
		window.add(title);
		window.setVisible(true);
		
		/*
		 * initializes Counter c
		 */
		c = new Counter();
		window.add(c);
		c.setForeground(new Color(0,205,205));
		window.setVisible(true);
		
		/*
		 * text to tell the minimum number of moves needed
		 */
		Text minimum = new Text("Minimum moves: 31", "Verdana",24, 15, 650);
		minimum.setForeground(new Color(46,139,87));
		window.add(minimum);
		window.setVisible(true);
		
		/*
		 * text for the instructions of the game
		 */
		Text instructions = new Text("Instructions: Move all the disks to the rightmost rod. A disk can only be on top of a bigger disk.","Corbel",24,15,80);//text for the instructions
		window.add(instructions);
		window.setVisible(true);
		Text instructions2 = new Text("To move a disk, click on the \"To [rod you want to move disk to] Rod\" button under the rod of the disk you want to move.","Corbel",24,143,105);
		window.add(instructions2);
		window.setVisible(true);

		/*
		 * initializes illegalMove (warning to be shown when an illegal move is executed)
		 */
		illegalMove = new Text("Illegal move!","Verdana",56,5000,5000);
		illegalMove.setForeground(Color.RED);
		window.add(illegalMove);
		window.setVisible(true);
		
		/*
		 * congratulatory message shown when game is finished and num of moves is 31
		 */
		amazing = new Text("AMAZING!","Verdana",64,5000,5000);
		amazing.setForeground(new Color(215,215,0));
		window.add(amazing);
		window.setVisible(true);
		
		/*
		 * congratulatory message shown when game is finished and num of moves is 32<=moves<=42
		 */
		excellent = new Text("Excellent!","Verdana",64,5000,5000);
		excellent.setForeground(new Color(215,215,0));
		window.add(excellent);
		window.setVisible(true);
		
		/*
		 * congratulatory message shown when game is finished and num of moves is 43<=moves<=63
		 */
		superb = new Text("Superb!","Verdana",64,5000,5000);
		superb.setForeground(new Color(215,215,0));
		window.add(superb);
		window.setVisible(true);
		
		/*
		 * congratulatory message shown when game is finished and num of moves is more than 63
		 */
		goodjob = new Text("Good job!","Verdana",64,5000,5000);
		goodjob.setForeground(new Color(215,215,0));
		window.add(goodjob);
		window.setVisible(true);
		
		window.setLayout(null);

		/*
		 * initializes disks
		 * d5 (largest disk) to d1 (smallest disk)
		 */
		d5 = new Disk5(80,398);
		window.add(d5);
		d4 = new Disk4(100,348);
		window.add(d4);
		d3 = new Disk3(120,298);
		window.add(d3);
		d2 = new Disk2(140,248);
		window.add(d2);
		d1 = new Disk1(160,198);
		window.add(d1);
		
		/*initializes left rod*/
		r1 = new Rod();
		r1.setBounds(200, 140, 30, 308);
		r1.setBackground(new Color(165, 42, 42));
		window.add(r1);
		/*adds identification numbers of each disk to arraylist rd of r1*/
		r1.addDisk(d5.getIdentification());//adds the identification number of disk 5 (largest) to the array rd of the left rod 
		r1.addDisk(d4.getIdentification());//adds the identification number of disk 4 to the array rd of the left rod 
		r1.addDisk(d3.getIdentification());//adds the identification number of disk 3 to the array rd of the left rod 
		r1.addDisk(d2.getIdentification());//adds the identification number of disk 2 to the array rd of the left rod 
		r1.addDisk(d1.getIdentification());//adds the identification number of disk 1 (smallest) to the array rd of the left rod 
		
		/*initializes middle rod*/
		r2 = new Rod();
		r2.setBounds(600, 140, 30, 308);
		r2.setBackground(new Color(165, 42, 42));
		window.add(r2);
		
		/*initializes right rod*/
		r3 = new Rod();
		r3.setBounds(1000, 140, 30, 308);
		r3.setBackground(new Color(165, 42, 42));
		window.add(r3);
		
		/*initializes button to open the game*/
		open = new ButtonO("WELCOME TO TOWER OF HANOI 5 DISKS! Click here to open the game.",window.getWidth(),window.getHeight());//initializes the button to open the game
		open.setLocation(0,0);
		window.add(open);
		open.setMnemonic(1);
		open.addActionListener(this);
		open.setActionCommand("open");
		window.setVisible(true);
		
		/*initializes the button to move disk left rod>middle rod*/
		lm = new ButtonA("To Middle Rod >",200,50);
		lm.setLocation(115,450);
		lm.setMnemonic(1);
		lm.setActionCommand("lm");//when clicked execute ActionCommand lm
		lm.addActionListener(this);
		window.add(lm);
		window.setVisible(true);
		/*initializes the button to move disk left rod>right rod*/
		lr = new ButtonA("To Right Rod >>",200,50);
		lr.setLocation(115,500);
		lr.setMnemonic(2);
		lr.setActionCommand("lr");//when clicked execute ActionCommand lr
		lr.addActionListener(this);
		window.add(lr);
		window.setVisible(true);
		/*initializes the button to move disk middle rod>left rod*/
		ml = new ButtonA("< To Left Rod",200,50);
		ml.setLocation(515,450);
		ml.setMnemonic(3);
		ml.setActionCommand("ml");//when clicked execute ActionCommand ml
		ml.addActionListener(this);
		window.add(ml);
		window.setVisible(true);
		/*initializes the button to move disk middle rod>right rod*/
		mr = new ButtonA("To Right Rod >",200,50);
		mr.setLocation(515,500);
		mr.setMnemonic(4);
		mr.setActionCommand("mr");//when clicked execute ActionCommand mr
		mr.addActionListener(this);
		window.add(mr);
		window.setVisible(true);
		/*initializes the button to move disk right rod>middle rod*/
		rm = new ButtonA("< To Middle Rod",200,50);
		rm.setLocation(915,450);
		rm.setMnemonic(5);
		rm.setActionCommand("rm");//when clicked execute ActionCommand rm
		rm.addActionListener(this);
		window.add(rm);
		/*initializes the button to move disk right rod>left rod*/
		rl = new ButtonA("<< To Left Rod",200,50);
		rl.setLocation(915,500);
		rl.setMnemonic(6);
		rl.setActionCommand("rl");//when clicked execute ActionCommand rl
		rl.addActionListener(this);
		window.add(rl);
	

	}
	
	public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * if the open ActionCommand is triggered
		 */
		if("open".equals(e.getActionCommand())){
			open.setLocation(5000,500);//set the open button at a location off the screen
			window.repaint();//repaint
		}
		/*
		 * action executed when move for left rod's disk to middle rod is requested
		 */
		else if("lm".equals(e.getActionCommand())){
			boolean legal = legalMove(r1,r2);//checks to see if the move from left rod to middle rod is legal
			if(legal==true){
				illegalMove.changeLocation(5000,5000);
				if(r1.getFirstDisk()==1) d1.changeLocation(2,r2.getArrayLength());//if first disk of left rod is d1
				else if(r1.getFirstDisk()==2) d2.changeLocation(2,r2.getArrayLength());//if first disk of left rod is d2
				else if(r1.getFirstDisk()==3) d3.changeLocation(2,r2.getArrayLength());//if first disk of left rod is d3
				else if(r1.getFirstDisk()==4) d4.changeLocation(2,r2.getArrayLength());//if first disk of left rod is d4
				else if(r1.getFirstDisk()==5) d5.changeLocation(2,r2.getArrayLength());//if first disk of left rod is d5
				c.addMove();//add move
				r2.addDisk(r1.getFirstDisk());//adds id of first disk in left rod to middle rod
				r1.removeDisk();//removes id of moved disk from left rod rd array
				window.repaint();
			}
			else if(legal==false){//if legal is false (illegal), set illegalMove warning to a location on the screen
				illegalMove.changeLocation(350,630);
				window.repaint();
			}
		}
		/*
		 * action executed when move for left rod's disk to right rod is requested
		 */
		else if("lr".equals(e.getActionCommand())){
			boolean legal = legalMove(r1,r3);//checks to see if the move from left rod to right rod is legal
			if(legal==true){
				illegalMove.changeLocation(5000,5000);
				if(r1.getFirstDisk()==1) d1.changeLocation(3,r3.getArrayLength());//if first disk of left rod is d1
				else if(r1.getFirstDisk()==2) d2.changeLocation(3,r3.getArrayLength());//if first disk of left rod is d2
				else if(r1.getFirstDisk()==3) d3.changeLocation(3,r3.getArrayLength());//if first disk of left rod is d3
				else if(r1.getFirstDisk()==4) d4.changeLocation(3,r3.getArrayLength());//if first disk of left rod is d4
				else if(r1.getFirstDisk()==5) d5.changeLocation(3,r3.getArrayLength());//if first disk of left rod is d5
				c.addMove();//add move
				r3.addDisk(r1.getFirstDisk());//adds id of first disk in left rod to right rod
				r1.removeDisk();//removes id of moved disk from left rod rd array
				if(r3.getArrayLength()==5){//if there are 5 disks on right rod, execute finished method
					finished();
				}
				window.repaint();
			}
			else if(legal==false){//if legal is false (illegal), set illegalMove warning to a location on the screen
				illegalMove.changeLocation(350,630);
				window.repaint();
			}
		}
		/*
		 * action executed when move for middle rod's disk to left rod is requested
		 */
		else if("ml".equals(e.getActionCommand())){
			boolean legal = legalMove(r2,r1);//checks to see if the move from middle rod to left rod is legal
			if(legal==true){
				illegalMove.changeLocation(5000,5000);
				if(r2.getFirstDisk()==1) d1.changeLocation(1,r1.getArrayLength());//if first disk of middle rod is d1
				else if(r2.getFirstDisk()==2) d2.changeLocation(1,r1.getArrayLength());//if first disk of middle rod is d2
				else if(r2.getFirstDisk()==3) d3.changeLocation(1,r1.getArrayLength());//if first disk of middle rod is d3
				else if(r2.getFirstDisk()==4) d4.changeLocation(1,r1.getArrayLength());//if first disk of middle rod is d4
				else if(r2.getFirstDisk()==5) d5.changeLocation(1,r1.getArrayLength());//if first disk of middle rod is d5
				c.addMove();//add move
				r1.addDisk(r2.getFirstDisk());//adds id of first disk in middle rod to left rod
				r2.removeDisk();//removes id of moved disk from middle rod rd array
				window.repaint();
			}
			else if(legal==false){//if legal is false (illegal), set illegalMove warning to a location on the screen
				illegalMove.changeLocation(350,630);
				window.repaint();
			}
		}
		/*
		 * action executed when move for middle rod's disk to right rod is requested
		 */
		else if("mr".equals(e.getActionCommand())){
			boolean legal = legalMove(r2,r3);//checks to see if the move from middle rod to right rod is legal
			if(legal==true){
				illegalMove.changeLocation(5000,5000);
				if(r2.getFirstDisk()==1) d1.changeLocation(3,r3.getArrayLength());//if first disk of middle rod is d1
				else if(r2.getFirstDisk()==2) d2.changeLocation(3,r3.getArrayLength());//if first disk of middle rod is d2
				else if(r2.getFirstDisk()==3) d3.changeLocation(3,r3.getArrayLength());//if first disk of middle rod is d3
				else if(r2.getFirstDisk()==4) d4.changeLocation(3,r3.getArrayLength());//if first disk of middle rod is d4
				else if(r2.getFirstDisk()==5) d5.changeLocation(3,r3.getArrayLength());//if first disk of middle rod is d5
				c.addMove();//add move
				r3.addDisk(r2.getFirstDisk());//adds id of first disk in middle rod to right rod
				r2.removeDisk();//removes id of moved disk from middle rod rd array
				if(r3.getArrayLength()==5){//if there are 5 disks on right rod, execute finished method
					finished();
				}
				window.repaint();
			}
			else if(legal==false){//if legal is false (illegal), set illegalMove warning to a location on the screen
				illegalMove.changeLocation(350,630);
				window.repaint();
			}
		}
		/*
		 * action executed when move for right rod's disk to middle rod is requested
		 */
		else if("rm".equals(e.getActionCommand())){
			boolean legal = legalMove(r3,r2);//checks to see if the move from right rod to middle rod is legal
			if(legal==true){
				illegalMove.changeLocation(5000,5000);
				if(r3.getFirstDisk()==1) d1.changeLocation(2,r2.getArrayLength());//if first disk of right rod is d1
				else if(r3.getFirstDisk()==2) d2.changeLocation(2,r2.getArrayLength());//if first disk of right rod is d2
				else if(r3.getFirstDisk()==3) d3.changeLocation(2,r2.getArrayLength());//if first disk of right rod is d3
				else if(r3.getFirstDisk()==4) d4.changeLocation(2,r2.getArrayLength());//if first disk of right rod is d4
				else if(r3.getFirstDisk()==5) d5.changeLocation(2,r2.getArrayLength());//if first disk of right rod is d5
				c.addMove();//add move
				r2.addDisk(r3.getFirstDisk());//adds id of first disk in right rod to middle rod
				r3.removeDisk();//removes id of moved disk from right rod rd array
				window.repaint();
			}
			else if(legal==false){//if legal is false (illegal), set illegalMove warning to a location on the screen
				illegalMove.changeLocation(350,630);
				window.repaint();
			}
		}
		/*
		 * action executed when move for right rod's disk to left rod is requested
		 */
		else if("rl".equals(e.getActionCommand())){
			boolean legal = legalMove(r3,r1);//checks to see if the move from right rod to left rod is legal
			if(legal==true){
				illegalMove.changeLocation(5000,5000);
				if(r3.getFirstDisk()==1) d1.changeLocation(1,r1.getArrayLength());//if first disk of right rod is d1
				else if(r3.getFirstDisk()==2) d2.changeLocation(1,r1.getArrayLength()); //if first disk of right rod is d2
				else if(r3.getFirstDisk()==3) d3.changeLocation(1,r1.getArrayLength());//if first disk of right rod is d3
				else if(r3.getFirstDisk()==4) d4.changeLocation(1,r1.getArrayLength());//if first disk of right rod is d4
				else if(r3.getFirstDisk()==5) d5.changeLocation(1,r1.getArrayLength());//if first disk of right rod is d5
				c.addMove();//add move
				r1.addDisk(r3.getFirstDisk());//adds id of first disk in right rod to left rod
				r3.removeDisk();//removes id of moved disk from right rod rd array
				window.repaint();
			}
			else if(legal==false){//if legal is false (illegal), set illegalMove warning to a location on the screen
				illegalMove.changeLocation(350,630);
				window.repaint();
			}
		}
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		amazing.changeLocation(350,630);
		
	}
	
	/*
	 * determines if the move from rod rA to rB is legal
	 */
	public boolean legalMove(Rod rA, Rod rB){
		/*
		 * if the number of disks on the rod whose disk is requested to be moved is greater than 0
		 */
		if(rA.getArrayLength()>0){
			/*
			 * if the identification of the top disk in rod rA is smaller than the top disk of rod rB <OR> if there are no disks on rB, approve move
			 */
			if((rA.getFirstDisk()<rB.getFirstDisk())||(rB.getArrayLength()==0)) return true;
			/*
			 * if the identification of the top disk in rod rA is bigger than the top disk of rod rB, return false
			 */
			else return false;
		}
		/*return false if there are no disks on the rod whose disk (in this case none) is requested to be moved*/
		return false;
	}
	
	/*
	 * executed when all disks are on the right rod
	 */
	public void finished(){
		if(c.getMoves()==31) amazing.changeLocation(350,630);//if # of moves is equal to 31, display "AMAZING!"
		else if(32<=c.getMoves() && 42>=c.getMoves()) excellent.changeLocation(350,630);//if # of moves is between 32 and 42 inclusive, display "Excellent!"
		else if(43<=c.getMoves() && 63>=c.getMoves()) superb.changeLocation(350,630);//if # of moves is between 43 and 63 inclusive, display "Superb!"
		else goodjob.changeLocation(350,630);//if # of moves is more than 61, display "Good Job!"
		/*
		 * disable all buttons which are used to move disks
		 */
		lm.setEnabled(false);
		lr.setEnabled(false);
		ml.setEnabled(false);
		mr.setEnabled(false);
		rm.setEnabled(false);
		rl.setEnabled(false);
	}
	
}
// ALL COMMENTED
