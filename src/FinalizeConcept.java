public class FinalizeConcept {
	public static void main(String[] args) {
		
		Window wn = new Window();
		wn = null;
		
		FinalizeConcept fn = new FinalizeConcept();
		fn = null;		
		
		System.gc(); //here we are calling garbage collector

	}
	
	@Override	
	public void finalize() {   //this method is coming from Object class and we are overriding here
		System.out.println("FinalizeConcept - this is our overridden method");
	}
}
