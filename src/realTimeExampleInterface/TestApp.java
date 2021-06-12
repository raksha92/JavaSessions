package realTimeExampleInterface;
public class TestApp {
	public static void main(String[] args) {
		WebDriver driver = null;
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
		
		driver.title();
		driver.get("Amazon.com");
		driver.sendKeys("name", "Raksha");
		driver.click("Button");
		driver.quit();
	}

}
