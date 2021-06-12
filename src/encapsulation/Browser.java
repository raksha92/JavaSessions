package encapsulation;

public class Browser {
	public void launchBrowser() {
		System.out.println("Browser launched");
		checkBrowserversion();
	}
	
	private void checkBrowserversion() {
		System.out.println("Browser version checked");
		checkOsCompatible();
	}
	
	private void checkOsCompatible() {
		System.out.println("OS compatible");
		checkPlugins();
	}
	
	private void checkPlugins() {
		System.out.println("plugins checked");
	}
}
