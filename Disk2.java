//Junchen Wang

public class Disk2 extends Disk{
	public Disk2(int iX, int iY){
		/*
		 * calls super with arguments
		 * 150: width
		 * iX: x position
		 * iY: y position
		 * 255: red for rgb
		 * 235: green for rgb
		 * 0: blue for rgb
		 */
		super(150, iX, iY, 255, 235, 0);
		//[60]|[30]|[60]
	}
	/*returns identification, which is 2*/
	public int getIdentification(){
		return 2;
	}
	public void changeLocation(int rN, int rS){
		/* If rod the disk is being sent to is the left one, 
		 * call the changeLocation method in the super class with the argument 140, 398-([number of disks on the rod]*50)
		 * */
		if(rN==1){
			super.changeLocation(140, 398-(rS*50));
		}
		/* If rod the disk is being sent to is the middle one, 
		 * call the changeLocation method in the super class with the argument 540, 398-([number of disks on the rod]*50)
		 * */
		else if(rN==2){
			super.changeLocation(540, 398-(rS*50));
		}
		/* If rod the disk is being sent to is the right one, 
		 * call the changeLocation method in the super class with the argument 940, 398-([number of disks on the rod]*50)
		 * */
		else if(rN==3){
			super.changeLocation(940, 398-(rS*50));
		}
	}
}
//ALL COMMENTED
