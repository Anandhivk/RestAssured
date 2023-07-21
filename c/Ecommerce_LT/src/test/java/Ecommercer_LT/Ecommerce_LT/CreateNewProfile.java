package Ecommercer_LT.Ecommerce_LT;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateNewProfile extends BaseTest{
	By myAccountMenuButton = By.xpath("//div[@id='widget-navbar-217834']//span[contains(text(),' My account')]");
	By Continue = By.xpath("//a[contains(text(),'Continue')]");
	By Firstname = By.id("input-firstname");
	By Lastname = By.id("input-lastname");
	By email = By.id("input-email");
	By telephone = By.id("input-telephone");
	By password = By.id("input-password");
	By confirmpassword = By.id("input-confirm");
	By agreecheckbox = By.xpath("//label[@for='input-agree']");
	By Continueb = By.xpath("//input[@value='Continue']");
	By logout = By.xpath("//div[@id='widget-navbar-217834]//span[contains(text(),'Logout')]");
	@Test
	public void test1_CreateNewProfile()
	{
		//driver.findElement(By.xpath("//div[@id='widget-navbar-217834']//span[contains(text(),' My account')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		click(myAccountMenuButton);
		click(Continue);
		type(Firstname,"Rex");
		type(Lastname,"Johnes");
		type(email,generateRandomEmail());
		type(telephone,"1234567890");
		type(password,"3400success");
		type(confirmpassword,"3400success");
		click(agreecheckbox);
		click(Continueb);
		Actions act = new Actions(driver);
		act.moveToElement(find(myAccountMenuButton)).build().perform();
		click(logout);
		
	}
	private WebElement find(By locator) {
		return driver.findElement(locator);
	}
	private void click(By locator) {
		find(locator).click();
	}
	private void type(By locator,String text) {
		find(locator).sendKeys(text);
	}
	private String generateRandomEmail() {
		return RandomStringUtils.random(4,true,true)+"@gmail.com";
	}
}

