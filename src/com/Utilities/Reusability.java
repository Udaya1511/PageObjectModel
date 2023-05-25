package com.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Reusability {

	public void capturedScreenShot(WebDriver driver, String screenshotName) {


		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\UD20461958\\Selenium\\Selenium_Screenshots\\Screenshots\\" + screenshotName + ".png");
			FileHandler.copy(src, des);
			System.out.println("Captured Screenshot - By Selenium");
		} catch (IOException e){
			System.out.println("Something Went Wrong while copying the file " + e.getMessage());
		}

	}

}
