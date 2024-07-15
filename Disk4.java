//Junchen Wang

public class Disk4 extends Disk{
	public Disk4(int iX, int iY){
		/*
		 * calls super with arguments
		 * 230: width
		 * iX: x position
		 * iY: y position
		 * 0: red for rgb
		 * 0: green for rgb
		 * 204: blue for rgb
		 */
		super(230, iX, iY, 0, 0, 204);
		//[100]|[30]|[100]
	}
	/*returns identification, which is 4*/
	public int getIdentification(){
		return 4;
	}
	public void changeLocation(int rN, int rS){
		/* If rod the disk is being sent to is the left one, 
		 * call the changeLocation method in the super class with the argument 100, 398-([number of disks on the rod]*50)
		 * */
		if(rN==1){
			super.changeLocation(100, 398-(rS*50));
		}
		/* If rod the disk is being sent to is the middle one, 
		 * call the changeLocation method in the super class with the argument 500, 398-([number of disks on the rod]*50)
		 * */
		else if(rN==2){
			super.changeLocation(500, 398-(rS*50));
		}
		/* If rod the disk is being sent to is the right one, 
		 * call the changeLocation method in the super class with the argument 900, 398-([number of disks on the rod]*50)
		 * */
		else if(rN==3){
			super.changeLocation(900, 398-(rS*50));
		}
	}
}
//ALL COMMENTED
