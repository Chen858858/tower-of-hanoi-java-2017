//Junchen Wang

public class Disk1 extends Disk{
	public Disk1(int iX, int iY){
		/*
		 * calls super with arguments
		 * 110: width
		 * iX: x position
		 * iY: y position
		 * 204: red for rgb
		 * 0: green for rgb
		 * 0: blue for rgb
		 */
		super(110, iX, iY, 204, 0, 0);
		//[40]|[30]|[40]
	}
	
	/*returns identification, which is 1*/
	public int getIdentification(){
		return 1;
	}
	
	public void changeLocation(int rN, int rS){

		/* If rod the disk is being sent to is the left one, 
		 * changeLocation method in the super class with the argument 160, 398-([number of disks on the rod]*50)
		 * */
		if(rN==1){
			super.changeLocation(160, 398-(rS*50));
		}
		/* If rod the disk is being sent to is the middle one, 
		 * call the changeLocation method in the super class with the argument 560, 398-([number of disks on the rod]*50)
		 * */
		else if(rN==2){
			super.changeLocation(560, 398-(rS*50));
		}
		/* If rod the disk is being sent to is the right one, 
		 * call the changeLocation method in the super class with the argument 960, 398-([number of disks on the rod]*50)
		 * */
		else if(rN==3){
			super.changeLocation(960, 398-(rS*50));
		}
	}

}
//ALL COMMENTED
