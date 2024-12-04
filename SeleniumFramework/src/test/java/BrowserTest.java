import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
public class BrowserTest {
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\afsal\\git\\Selenium-Java-Framework\\SeleniumFramework\\Drivers\\Gecko Driver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette", projectPath+"\\Drivers\\Gecko Driver\\geckodriver.exe");//added in environment variable
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chrome driver/chromedriver.exe");//added in environment variable
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement textbox = driver.findElement(By.id("APjFqb"));
		textbox.sendKeys("Automation step by step");
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.close();
	
	}
}