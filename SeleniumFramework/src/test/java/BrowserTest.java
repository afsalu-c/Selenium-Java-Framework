import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
public class BrowserTest {
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\afsal\\git\\Selenium-Java-Framework\\SeleniumFramework\\Drivers\\Gecko Driver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette", projectPath+"\\Drivers\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://feelfreetolearn.videocrypt.in/");
	
	}
}