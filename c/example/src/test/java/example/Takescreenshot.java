package example;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\anand\\Downloads\\ChromeSetup.exe");
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(2000);
		//TakeScreenshot scrnshot = (TakeScreenshot)driver;
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scrFile = ts.getScreenshotAs(OutputType.FILE);
		File taregt = new File("Homepage.png");
		FileUtils.copyFile(scrFile, taregt);
		driver.close();
}}
