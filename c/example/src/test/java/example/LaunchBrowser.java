package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\anand\\Downloads\\ChromeSetup.exe");
	WebDriverManager.chromedriver().setup();
	//WebDriverManager.edgedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	System.out.println("Title"+driver.getTitle());
	System.out.println("url"+driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	}
}
