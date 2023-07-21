package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pazure {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Anandh");
		Thread.sleep(2000);
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("Anandh");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Anandh");
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Anandh");
		Thread.sleep(2000);
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Anandh");
		WebElement button = driver.findElement(By.name("submit"));
		button.click();
		Thread.sleep(2000);
		WebElement female = driver.findElement(By.xpath("//label[@class='form-check-label']//input[@id='female']"));
		female.click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//label[@class='form-check-label']//input[@id='friday']"));
		day.click();
		driver.findElement(By.xpath("//label[@for='1year']")).click();
		driver.findElement(By.xpath("//label[@for='selenium']")).click();
		//driver.findElement(By.xpath("//label[@for='inputGroupFile02']")).sendKeys("file:///C:/Users/anand/Downloads/Swati_Resume new.pdf");
		//Robot Framework to upload a file 
		WebElement file = driver.findElement(By.id("inputGroupFile02"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",file);//click action to button. instead of click we use javascript executor click is used to perform 
		
		
		//copy the path 
		Robot rb = new Robot();
		rb.delay(1000);
		
		StringSelection ss=new StringSelection("file:///C:/Users/anand/Downloads/Swati_Resume new.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		rb.delay(1000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement upload = driver.findElement(By.xpath("//div[@class='input-group-append']"));
		upload.click();
	}
}
