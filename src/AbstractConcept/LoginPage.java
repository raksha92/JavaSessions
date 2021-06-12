package AbstractConcept;

public class LoginPage extends Page{
	
	public LoginPage() {
		System.out.println("this is LP constructor");
	}

	@Override
	public void header() {
		System.out.println("header method implemented");
	}

	@Override
	public void title() {
		System.out.println("title method implemented");
	}
	
	public void login() {
		System.out.println("This is independent login method");
	}
	
	@Override
	public void pageLoading() {
		System.out.println("page loading method - 10 secs");
	}
}
