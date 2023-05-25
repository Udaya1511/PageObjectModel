package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HollandBarrett_LoginPage {
	
WebDriver driver;
	
	private By username = By.id("username");
	private By pass = By.id("password");
	private By login = By.xpath("//button[@type='submit']");
	
	public HollandBarrett_LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void typeEmail(String userName) {
		driver.findElement(username).sendKeys(userName);

	}
	
	public void typePass(String Password) {
		driver.findElement(pass).sendKeys(Password);

	}
	
	public void clickSubmit() {
		driver.findElement(login).click();

	}

}
