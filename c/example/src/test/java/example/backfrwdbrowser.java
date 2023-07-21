package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class backfrwdbrowser {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\anand\\Downloads\\ChromeSetup.exe");
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//((By.className("demo-frame")));
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
		action.moveByOffset(100, 70).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Thread.sleep(2000);
		action.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Slider")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		action.dragAndDropBy(driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")), 40, 0).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Tooltip")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		action.moveToElement(driver.findElement(By.id("age"))).build().perform();
		WebElement t1 = driver.findElement(By.className("ui-tooltip-content"));
		t1.getText();
		System.out.println(t1.getText());
		}}
