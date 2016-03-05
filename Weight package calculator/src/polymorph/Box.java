package polymorph;

import java.util.*;

public class Box implements Package {
	private int weight;
	
	//Default Constructor
	public Box(){

	}
	public double cost(){
			return 1.2 * weight;
	}
	public void input(){
		Scanner read = new Scanner(System.in);
		System.out.printf("%s","Please input the weight for the box (lbs): ");
		weight = read.nextInt();
	}

}//End of Box Class
