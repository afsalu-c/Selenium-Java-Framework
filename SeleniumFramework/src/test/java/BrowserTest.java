import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
public class BrowserTest {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://feelfreetolearn.videocrypt.in/");
	
	}
}