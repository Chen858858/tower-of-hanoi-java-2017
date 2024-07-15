//Junchen Wang

public class Disk3 extends Disk{
	public Disk3(int iX, int iY){
		/*
		 * calls super with arguments
		 * 190: width
		 * iX: x position
		 * iY: y position
		 * 76: red for rgb
		 * 153: green for rgb
		 * 0: blue for rgb
		 */
		super(190, iX, iY, 76, 153, 0);
		//[80]|[30]|[80]
	}
	/*returns identification, which is 3*/
	public int getIdentification(){
		return 3;
	}
	public void changeLocation(int rN, int rS){
		/* If rod the disk is being sent to is the left one, 
		 * call the changeLocation method in the super class with the argument 120, 398-([number of disks on the rod]*50)
		 * */
		if(rN==1){
			super.changeLocation(120, 398-(rS*50));
		}
		/* If rod the disk is being sent to is the middle one, 
		 * call the changeLocation method in the super class with the argument 520, 398-([number of disks on the rod]*50)
		 * */
		else if(rN==2){
			super.changeLocation(520, 398-(rS*50));
		}
		/* If rod the disk is being sent to is the right one, 
		 * call the changeLocation method in the super class with the argument 920, 398-([number of disks on the rod]*50)
		 * */
		else if(rN==3){
			super.changeLocation(920, 398-(rS*50));
		}
	}
}
//ALL COMMENTED
