package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POM_Classes.LoginPage;
import Utilities.BaseClass;

public class LoginTestCase extends BaseClass {
	@Test
	public void TC_oo1()
	{
		System.out.println("----Welcome to obortech login----");
		LoginPage lp=new LoginPage(driver);
		WebElement username = lp.getUsernameTextfiled();
		username.sendKeys("Managerchain");
		WebElement profilePassword = lp.getProfilePasswordTextfield();
		profilePassword.sendKeys("Test@123");
		
		lp.getContinueButton().click();
		
		WebElement blockchainPassword = lp.getBlockchainPassword();
		blockchainPassword.sendKeys("Z45FeDYYBu");
		
		lp.getContinueofBlockchain().click();
	}

}
