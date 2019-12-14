package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	
	public ProductPage SearchPage() {
		driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30");
		driver.findElementByClassName("nav-input").click();
		return new ProductPage();
	}

}
