package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GoogleSearchPage;
public class GoogleSearchTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearch();
	}
	public static void googleSearch() {
		driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//WebElement textbox = driver.findElement(By.id("APjFqb"));
		GoogleSearchPage.textbox_search(driver).sendKeys("I phone 16 price");
		//textbox.sendKeys("Automation step by step");
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//close browser
		driver.close();
		System.out.println("Test completed successfully");
	}
}
