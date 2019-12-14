package org.testleaf.testcase;

import org.testleaf.base.ProjectSpecificMethods;
import org.testleaf.pages.HomePage;
import org.testng.annotations.Test;

public class TC01 extends ProjectSpecificMethods{
	@Test
	public void VerifyProduct()
	{
	new HomePage()
	.SearchPage()
	.ProductList()
	.CartPage()
	.VerifyCart()
	.LoginNoCredentials();
	
	
	}

}
