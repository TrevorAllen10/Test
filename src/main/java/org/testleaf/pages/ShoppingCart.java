package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class ShoppingCart extends ProjectSpecificMethods {
public LoginPage VerifyCart()
{
	String data = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText();
	
	System.out.println(data);
	driver.findElementByLinkText("Proceed to Buy (1 item)").click();
	return new LoginPage();
}

}
