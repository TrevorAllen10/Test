package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class ProductPage extends ProjectSpecificMethods {
	
	public ProductDetailPage ProductList() {
	String text = driver.findElementByClassName("a-price-whole").getText();
	System.out.println("The price of the product is   "+ text);
	driver.findElementByXPath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]").click();
	return new ProductDetailPage();
}
	}
