package realTimeExampleInterface;
public class ChromeDriver implements WebDriver{

	@Override
	public String title() {
		System.out.println("Title method");
		return "Some title";
	}
	@Override
	public void get(String url) {
		System.out.println("pass the string url: "+ url);
	}
	@Override
	public void sendKeys(String element, String value) {
		System.out.println("send keys to "+element + "and the "+value) ;
	}
	@Override
	public void click(String element) {
		System.out.println("click method");
	}
	@Override
	public void quit() {
		System.out.println("quit method");
	}
	@Override
	public void findElement() {
		System.out.println("find element method");
	}
}
