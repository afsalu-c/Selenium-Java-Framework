import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
public class BrowserTest {
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\afsal\\git\\Selenium-Java-Framework\\SeleniumFramework\\Drivers\\Gecko Driver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette", projectPath+"\\Drivers\\Gecko Driver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chrome driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/afsalu-c");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	
	}
}