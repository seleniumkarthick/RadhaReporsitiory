package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.product.pages.MenuPage;

public class BaseTest {

	public WebDriver driver;
	public MenuPage menuPageObj;
	
	@BeforeClass
	public void setup(){

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthick Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("http://localhost:81/product");
		    menuPageObj =new MenuPage(driver);
	}
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}

	
}
