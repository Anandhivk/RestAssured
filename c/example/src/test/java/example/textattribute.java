package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textattribute {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\anand\\Downloads\\ChromeSetup.exe");
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement inputbox = driver.findElement(By.id("Email"));
		System.out.println("Result"+inputbox.getAttribute("value"));
		System.out.println("Result"+inputbox.getText());
		}
	}

