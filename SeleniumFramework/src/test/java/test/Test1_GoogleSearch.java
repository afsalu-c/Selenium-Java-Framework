package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1_GoogleSearch {
	public static void main (String args []) {
		googleSearch();
	}

public static void googleSearch() {
	WebDriver driver = new ChromeDriver();
	//WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	
	WebElement textbox = driver.findElement(By.id("APjFqb"));
	textbox.sendKeys("Automation step by step");
	
	driver.close();
	System.out.println("Test completed successfully");
}
}