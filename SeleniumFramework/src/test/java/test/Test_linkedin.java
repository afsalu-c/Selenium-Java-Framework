package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_linkedin {

	public static void main(String[] args) {
		linkedinTest();
		
	}
	public static void linkedinTest() {
		
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver(); // I already added in environment variable
		
		//goto linkedin sign-in page
		driver.get("https://www.linkedin.com/feed/");
		
		//enter search textbox
		driver.findElement(By.cssSelector("#username")).sendKeys("user_namme");
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).sendKeys(Keys.RETURN);


//		driver.findElement(By.id("ember31")).click();		
		System.err.println("Test completed successfully");
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//close browser
		driver.close();
		}
}
