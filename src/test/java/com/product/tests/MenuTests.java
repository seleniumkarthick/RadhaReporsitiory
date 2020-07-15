package com.product.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.BaseTest;

public class MenuTests extends BaseTest {
	
	@Test
	public void validateAboutUs(){
		menuPageObj.clickAboutUs();
		Assert.assertEquals(menuPageObj.getUrl(), "http://localhost:81/product/aboutus.php");
	}
	
	@Test
	public void validateAboutUsNew(){
		menuPageObj.clickAboutUs();
		Assert.assertEquals(menuPageObj.getUrl(), "http://localhost:81/product/aboutus.php");
	}

	@Test
	public void validateAboutUsUpdate(){
		menuPageObj.clickAboutUs();
		Assert.assertEquals(menuPageObj.getUrl(), "http://localhost:81/product/aboutus.php");
	}

}
