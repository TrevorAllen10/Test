package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	public LoginPage LoginNoCredentials()
	{
		String obj = driver.getTitle();
		System.out.println("Title of the page:  " +obj);
		driver.findElementById("continue").click();

		String alert = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		System.out.println("Error message:  " +alert);
		return this;
	}

}
