package com.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.crediverso.com/");
		driver.manage().window().maximize();
		
		//Espera implicita
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Espera explicita
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.titleContains("Google"));
				
		
		System.out.println();
		
		
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
