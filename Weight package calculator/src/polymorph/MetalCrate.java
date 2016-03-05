package polymorph;

public class MetalCrate extends Crate {

	//Default Constructor that calls the super class
	public MetalCrate(){
		super();
	}
	public double cost(){
		return 1.3* weight;	
	}
	
}// End of MetalCrate class

