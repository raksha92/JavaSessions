package InterfaceConcept;
public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical{
	@Override
	public void orthoServices() {
		System.out.println("orthoServices");
	}
	@Override
	public void neuroServices() {
		System.out.println("neuroServices");
	}
	@Override
	public void emergencyServices() {  //common method in all 3 interfaces
		System.out.println("emergencyServices");
	}
	@Override
	public void radioServices() {
		System.out.println("radioServices");
	}
	@Override
	public void physioServices() {
		System.out.println("physioServices");
	}
	@Override
	public void gynoServices() {
		System.out.println("gynoServices");
	}
	@Override
	public void oncologyServices() {
		System.out.println("oncologyServices");
	}
	@Override
	public void cardioServices() {
		System.out.println("cardioServices");
	}
	@Override
	public void covidTest() {
		System.out.println("Covid test");
	}
	@Override
	public void taxCollection() {
		System.out.println("This is tax collection from fortis hos");
	}

	//non-overridden methods, independent methods of Fortis hospital class.
	public void medicalInsurance() {
		System.out.println("medical insurance");
	}
	
}
