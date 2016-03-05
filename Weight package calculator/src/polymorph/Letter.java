package polymorph;

import java.util.*;

public class Letter implements Package {
	private int numOfPages;
	
	//Default Constructor
	public Letter(){
		
	}
	public double cost(){
		return .5 *numOfPages;
	}
	
	public void input(){
		Scanner read = new Scanner(System.in);
		System.out.printf("%s","Please input the number of pages for the letter (pgs): ");
		numOfPages = read.nextInt();
		
	}
}//End of Letter Class