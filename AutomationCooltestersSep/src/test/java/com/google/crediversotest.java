package com.google;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class crediversotest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://crediverso.com/");
		driver.manage().window().maximize();
		Reporter.log("Open Dev Crediverso web page");

		// Click Login in
		driver.findElement(By.xpath("//*[@id=\"menu-item-12328\"]/a")).click();
		//driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/ul/li[1]/a")).click();
		
		// Send data to login
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='login__container']//input[@id='email']")).sendKeys("apapik@hotmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"fieldpassword\"]")).sendKeys("Tiempo21###");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='login__submit_btn']")).click();

	}

}
