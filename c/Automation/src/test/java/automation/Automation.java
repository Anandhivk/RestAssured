package automation;

import java.io.IOException;
import java.util.List;
import java.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import Utilis.XLUtils;


public class Automation {
	public static void main(String[] args) throws InterruptedException, IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String path =".\\sheets\\output.xlsx";
		XLUtils xlutil =new XLUtils(path);
		//writer headers in excel sheet 
		xlutil.setCellData("Sheet1", 0, 0, "ID");
		xlutil.setCellData("Sheet1", 0, 1, "Name");
		xlutil.setCellData("Sheet1", 0, 2, "Price");
		int k=0;
		//capture rows in the table
		List<WebElement> Pagination = driver.findElements(By.xpath("//ul[@class='pagination']/li"));
		int pages = Pagination.size();
		System.out.println(pages);
		
		for(int i=1;i<=pages;i++) {
			WebElement paginator = driver.findElement(By.xpath("//ul[@class='pagination']/li["+i+"]"));
			Thread.sleep(1000);
			paginator.click();
			
			List<WebElement> row = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));
			int rows = row.size();
			//System.out.println(rows);
			
			//int k=1;
			for(int j=1;j<=rows;j++) {
				//read data 
				String id = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+j+"]/td[1]")).getText();
				String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+j+"]/td[2]")).getText();
				String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+j+"]/td[3]")).getText();
				System.out.println(id+name+price);
				k=k+1;
				//write data in excel
				xlutil.setCellData("Sheet1",k,0,id);
				xlutil.setCellData("Sheet1",k,1,name);
				xlutil.setCellData("Sheet1",k,2,price);
				//k++;
//			List<WebElement> header = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr[1]//td[1]"));
//			for(WebElement headers:header) {
//				System.out.println(headers.getText());

			}
			//System.out.println("done");
			}
		}
}
