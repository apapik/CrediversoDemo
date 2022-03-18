package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	
	public WebDriver Mydriver = null;
	
	public WebDriverWait wait = null;
	
	public Home (WebDriver driver) {
		
		Mydriver = driver;
		
		wait = new WebDriverWait(Mydriver, Duration.ofSeconds(20));
	}
	
	public WebElement LoginButton () {
		
		System.out.println("LoginButton begin");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='level_1 login__btn']")));
		
		return Mydriver.findElement(By.xpath("//*[@id=\"menu-item-12328\"]/a"));
		
		
	}
	
	public WebElement PopupButton() {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='close__btn']")));
		
		return Mydriver.findElement(By.xpath("//button[@class='close__btn']"));
	}
	
	

}
