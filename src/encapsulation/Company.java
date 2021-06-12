package encapsulation;

public class Company {
	private String name;
	private int count;
	private String policy;
	
	public Company (String name, int count, String policy){
		this.name = name;
		this.count = count;
		this.policy = policy;
	}
	
//	public void setName (String name) {
//		this.name = name;
//	};
	
	public String getName () {
		return name;
	}

}
