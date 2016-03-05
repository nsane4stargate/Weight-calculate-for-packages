package polymorph;

import java.util.*;

public abstract class Crate implements Package{
	protected int weight;
	
	//Default Constructor
	public Crate(){
	
	}
	public void input(){
		Scanner read = new Scanner(System.in);
		if(getClass() != null){ 
			System.out.printf("%s%s%s","Please input weight for the ", getClass().getSimpleName()," (lbs) :" );
			weight = read.nextInt();
		}
	}
}// End Of Crate class


