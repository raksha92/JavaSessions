package realTimeExampleInterface;
public interface WebDriver extends SearchContext{

	public String title();
	public void get(String url);
	public void sendKeys(String element, String value);
	public void click(String element);
	public void quit();
}
