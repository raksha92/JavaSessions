package javaSessions;


public class BuilderPattern {
	
	public BuilderPattern doLogin(String username, String pwd) {
		System.out.println("Login with "+username + pwd);
		return this; // this will return the object of BuilderPattern class.
	}
	
	public BuilderPattern searchProduct(String prodName) {
		System.out.println("Search the product "+ prodName);
		return this; // this will return the object of BuilderPattern class.
	}
	
	public BuilderPattern buyProduct(String prodName) {
		System.out.println("Buy the product "+ prodName);
		return this; // this will return the object of BuilderPattern class.
	}
	
	public BuilderPattern doPayment(String prodName) {
		System.out.println("Pay for the product "+ prodName);
		return this; // this will return the object of BuilderPattern class.
	}
	
	public void logout() {
		System.out.println("logout from the app... ");
	}
	
	public static void main(String[] args) {		
		BuilderPattern obj1 = new BuilderPattern();
		obj1.doLogin("Raksha", "raksha123")
			.searchProduct("Watch")
				.buyProduct("Watch")
					.doPayment("Watch")
						.logout();
	}
}