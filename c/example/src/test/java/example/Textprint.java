package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textprint {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\anand\\Downloads\\ChromeSetup.exe");
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/akamalakannan/login.do");
		driver.findElement(By.id("username")).sendKeys("anandhik.vk@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("p98VSq7D");
		driver.findElement(By.id("keepLoggedInCheckBoxContainer")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		List<WebElement> list1 = driver.findElements(By.xpath("//table[@class='navTable ']//tr//td/a//div[@class='label']"));
		Thread.sleep(3000);
		for(WebElement module:list1) {
			System.out.println(module.getText());
		}
}}
