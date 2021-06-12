package InterfaceConcept;
public interface USMedical extends WHO{
	String min_fee = "10$";
	public void orthoServices();
	
	public void neuroServices();
	
	public void emergencyServices();
	
	public void radioServices();
	
	public static void billing() {
		System.out.println("billing static method");
	}
	
	default void taxCollection() {
		System.out.println("defult method");
	}
}
