package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Store_Pages {
	
WebDriver driver;
	
	private	By Login = By.xpath("(//a[text()='Login'])[1]");
	private By username = By.name("login[username]");
	private By pass = By.name("login[password]");
	private By login = By.xpath("(//button[@type='submit'])[1]");
	private By Lolo = By.xpath("//button[text()='GOT IT!']");
	
	public Store_Pages(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public void loloing() {
		driver.findElement(Lolo).click();

	}
	
	public void Loginin() {
		driver.findElement(Login).click();

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
