package InterfaceConcept;

public class TestInterface {

	public static void main(String[] args) {

//		FortisHospital fh = new FortisHospital();
//		fh.orthoServices();
//		fh.physioServices();
//		fh.oncologyServices();
//		fh.medicalInsurance();//independent method of fh
		
		USMedical us = new FortisHospital();
		us.orthoServices();
		us.neuroServices();
		us.emergencyServices();
		us.radioServices();
		
		us.taxCollection();
	}

}
