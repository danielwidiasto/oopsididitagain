package oopgslc;

public class bird implements animal {
	public void fly() {
		System.out.println("Flying..");
	}
	public void buildnest() {
		System.out.println("Building a nest...");
	}
	
	public void layeggs() {
		System.out.println("Laying eggs...");
	}
	
	public void eat() {
		System.out.println("Eating like a bird...");
	}
	
	public void sleep() {
		System.out.println("Sleeping quietly...");
	}
	
	public void chirping() {
		System.out.println("*chirp**chirp**chirp* Sounds like a bird...");
	}
	@Override
	public void reptileSound() {
		// TODO Auto-generated method stub
		
	}
	
}
