package org.testleaf.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testleaf.base.ProjectSpecificMethods;

public class ProductDetailPage extends ProjectSpecificMethods {
	
	public ShoppingCart CartPage()
	{
		 Set<String> win = driver.getWindowHandles(); 
		 List<String> abc = new ArrayList<String>();
		 abc.addAll(win);
		driver.switchTo().window(abc.get(1));
		String date = driver.findElementByXPath("(//span[@class='a-text-bold'])[4]").getText();
		System.out.println("Delivery date:  " + date);
		driver.findElementById("add-to-cart-button").click();
		return new ShoppingCart();
	}

}
