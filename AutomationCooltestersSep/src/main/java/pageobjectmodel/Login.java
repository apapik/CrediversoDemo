package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {


	public WebDriver Newdriver = null;
	
	public WebElement Element = null;
	
	public WebDriverWait wait = null;
	
	
	public Login(WebDriver driver) {

		Newdriver = driver;
		
		wait = new WebDriverWait(Newdriver, Duration.ofSeconds(20));

	}

	public WebElement EmailTextbox() {
		
		System.out.println("Email begin");
		
		//WebDriverWait wait = new WebDriverWait(Newdriver, Duration.ofSeconds(20));
		
			
		System.out.println("Emailtextbox after");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='login__container']//input[@id='email']")));
		
		System.out.println("Emailtextbox finish");

		return Newdriver.findElement(By.xpath("//div[@class='login__container']//input[@id='email']"));
	}

	public WebElement PasswordTextbox() {
		
				
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"fieldpassword\"]")));

		return Newdriver.findElement(By.xpath("//*[@id=\"fieldpassword\"]"));
	}

	public WebElement SubmitButton() {
		
				
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='login__submit_btn']")));

		WebElement Submit = Newdriver.findElement(By.xpath("//button[@class='login__submit_btn']"));

		return Submit;
	}
	
	

}
