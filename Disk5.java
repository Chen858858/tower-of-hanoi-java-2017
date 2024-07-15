//Junchen Wang

public class Disk5 extends Disk{
	public Disk5(int iX, int iY){
		/*
		 * calls super with arguments
		 * 270: width
		 * iX: x position
		 * iY: y position
		 * 204: red for rgb
		 * 0: green for rgb
		 * 204: blue for rgb
		 */
		super(270, iX, iY, 204, 0, 204);
		//[120]|[30]|[120]
	}
	/*returns identification, which is 5*/
	public int getIdentification(){
		return 5;
	}
	public void changeLocation(int rN, int rS){
		/* If rod the disk is being sent to is the left one, 
		 * call the changeLocation method in the super class with the argument 80, 398-([number of disks on the rod]*50)
		 * */
		if(rN==1){
			super.changeLocation(80, 398-(rS*50));
		}
		/* If rod the disk is being sent to is the middle one, 
		 * call the changeLocation method in the super class with the argument 480, 398-([number of disks on the rod]*50)
		 * */
		else if(rN==2){
			super.changeLocation(480, 398-(rS*50));
		}
		/* If rod the disk is being sent to is the right one, 
		 * call the changeLocation method in the super class with the argument 880, 398-([number of disks on the rod]*50)
		 * */
		else if(rN==3){
			super.changeLocation(880, 398-(rS*50));
		}
	}
}
//ALL COMMENTED
