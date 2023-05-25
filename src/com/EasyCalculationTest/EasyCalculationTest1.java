package com.EasyCalculationTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Utilities.BaseClass;
import com.pom.EasyCalculationPages;

public class EasyCalculationTest1 {
	WebDriver driver;
	BaseClass bc;
	EasyCalculationPages ec;
	
	@Test
	public void VerifyEasyLogin() throws InterruptedException {
		
		BaseClass bc = new BaseClass(driver);
		driver=bc.browserLaunch("Chrome");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.manage().window().maximize();
		
		ec = new EasyCalculationPages(driver);
		ec.typeEmail();
		ec.typePass();
		ec.clickSubmit();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
