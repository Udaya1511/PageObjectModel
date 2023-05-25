package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EasyCalculationPages {
	
	WebDriver driver;
	
	private By email = By.id("log_email");
	private By pass = By.id("log_password");
	private By login = By.xpath("//input[@name = 'log_submit']");
	
	public EasyCalculationPages(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void typeEmail() {
		driver.findElement(email).sendKeys("9941678198");

	}
	
	public void typePass() {
		driver.findElement(pass).sendKeys("Udaya@123");

	}
	
	public void clickSubmit() {
		driver.findElement(login).click();

	}
}
