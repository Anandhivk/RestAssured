package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;


public class automation {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//search box
		
//		WebElement search = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
//		search.sendKeys("selenium");
//		driver.findElement(By.className("wikipedia-search-button")).click();
//		WebElement clickme = driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"));
//		clickme.click();
//		Thread.sleep(2000);
//		//alert OK 
//		driver.switchTo().alert().accept();
//		//driver.switchTo().alert().getText();
//		driver.findElement(By.id("datepicker")).click();
//		Thread.sleep(2000);
//		WebElement date =driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']"));
//		date.click();
//		driver.findElement(By.id("datepicker")).click();
//		Thread.sleep(2000);
//		WebElement date1 =driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='31']"));
//		date1.click();
//		Thread.sleep(2000);
//		//driver.findElement(By.id("datepicker")).click();
//		//driver.findElement(By.xpath("[@data-handler='next']/span")).click();
//		//driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='16']")).click();
//		Thread.sleep(2000);
//		//System.out.print(date.getText());
//		//dropdown options
//		Select se = new Select(driver.findElement(By.id("speed")));
//		List<WebElement> options = se.getOptions();
//		for(WebElement option:options) {
//			System.out.println(option.getText());
//		}
//		se.selectByVisibleText("Slow");
//		//Select file = new Select(driver.findElement(By.id("files")));
//		//file.selectByValue("DOC file\r\n"
//	//			+ "");
//		//Thread.sleep(2000);
//		Select prdt = new Select(driver.findElement(By.id("products")));
//		prdt.selectByVisibleText("Bing");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");
//		driver.findElement(By.className("widget-content")).getText();
//		WebElement e = driver.findElement(By.xpath("//div[@class='widget HTML']//div[@class='widget-content']//empinfo//employee[@id='1']/empid"));
//		e.getText();
//		//frames
		//driver.switchTo().frame(0);
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Anandh");
		//driver.switchTo().defaultContent();
		//drag and drop elements
		Actions act= new Actions(driver);
		WebElement a =driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		act.doubleClick(a).build().perform();
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		act.dragAndDrop(drag, drop).build().perform();
		act.dragAndDropBy(drag, 50, 50).build().perform();
		act.moveByOffset(50, 0).build().perform();
		//web table elements 
		List<WebElement> headers = driver.findElements(By.xpath("//div[@id='HTML1']//div//table//th"));
		for(WebElement header:headers) {
			System.out.println(header.getText());
		}
		System.out.println("==================");
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='HTML1']//div//table//td"));
		for(WebElement row:rows) {
			System.out.println(row.getText());
		}
		System.out.println("==================");
	List<WebElement> table = driver.findElements(By.xpath("//table[@name='BookTable']//td[count(//table[@name='BookTable']//th[text()='Subject']/preceding-sibling::th)+1]"));
	for(WebElement tables:table) {
		System.out.println(tables.getText());
	}
	System.out.println("==================");
}}
