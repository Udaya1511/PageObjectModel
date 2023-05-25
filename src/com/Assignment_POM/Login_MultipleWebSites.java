package com.Assignment_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Utilities.BaseClass;
import com.pom.EasyCalculationPages;
import com.pom.HollandBarrett_LoginPage;
import com.pom.OrangeHRM_LoginPage;
import com.pom.Store_Pages;

public class Login_MultipleWebSites {

	WebDriver driver;
	BaseClass bc;
	
	
	@Test
	public void HollandBarrettLoginverify() {
		
		BaseClass bc = new BaseClass(driver);
		driver=bc.browserLaunch("Chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://auth.hollandandbarrett.com/u/login?");
		driver.manage().window().maximize();
		
		
		HollandBarrett_LoginPage HbLogin = new HollandBarrett_LoginPage(driver);
		HbLogin.typeEmail("udayakumar166@gmail.com");
		HbLogin.typePass("Udaya@123");
		HbLogin.clickSubmit();
		bc.titleVerify("Holland & Barrett - UK's Leading Health & Wellbeing Store");
		driver.quit();
	}
	
	@Test
	public void OrangeHrmLoginverify() {

		BaseClass bc = new BaseClass(driver);
		driver=bc.browserLaunch("Chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		OrangeHRM_LoginPage OrLogin = new OrangeHRM_LoginPage(driver);
		OrLogin.typeEmail("Admin");
		OrLogin.typePass("admin123");
		OrLogin.clickSubmit();
		bc.titleVerify("OrangeHRM");
		driver.quit();
	}
	
	@Test
	public void StoreLoginverify() {

		BaseClass bc = new BaseClass(driver);
		driver=bc.browserLaunch("Chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://store.webkul.com/");
		driver.manage().window().maximize();
		
		Store_Pages SLogin = new Store_Pages(driver);
		SLogin.loloing();
		SLogin.Loginin();
		SLogin.typeEmail("udayakumar166@gmail.com");
		SLogin.typePass("Udaya@123");
		SLogin.clickSubmit();
		bc.titleVerify("Premium Magento 2 Prestashop Odoo Akeneo Shopware Extensions - WebKul");
		driver.quit();
	}

}
