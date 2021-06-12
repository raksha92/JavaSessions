package AbstractConcept;

public abstract class Page {
	
	public Page() {
		System.out.println("This is Page class constructor");
	}
	
	public abstract void header();
	
	public abstract void title();
	
	public void pageLoading() {
		System.out.println("page loading method - 30 secs");
	}

	public static void url() {
		System.out.println("static method");
	}
	
	public void links() {
		System.out.println("links");
	}
}
