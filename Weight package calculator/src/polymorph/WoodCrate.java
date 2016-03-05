package polymorph;

public class WoodCrate extends Crate implements Package{
	
	//Default Constructor that calls the super class
	public WoodCrate(){
		super();
	}
	public double cost(){
		return 1.4* weight;
	}

}// End of WoodCrate class
