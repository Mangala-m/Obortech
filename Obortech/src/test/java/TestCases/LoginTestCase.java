package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POM_Classes.LoginPage;
import Utilities.BaseClass;
import Utilities.DataUtility;

public class LoginTestCase extends BaseClass {
	@Test(dataProvider="Recipient",dataProviderClass=DataUtility.class)
	public void TC_oo1(String username,String profilepassword,String blockchainpassword) throws Throwable
	{
		System.out.println("----Welcome to obortech login----");
		LoginPage lp=new LoginPage(driver);
		lp.getUsernameTextfiled().sendKeys(username);
	
	   lp.getProfilePasswordTextfield().sendKeys(profilepassword);
		
		lp.getContinueButton().click();
		Thread.sleep(3000);
		
		lp.getBlockchainPassword().sendKeys(blockchainpassword);
		Thread.sleep(2000);
		lp.getContinueofBlockchain().click();
		Thread.sleep(2000);
		
		lp.getMyProfile().click();
		Thread.sleep(2000);
		
		lp.getLogoutButton().click();
		Thread.sleep(3000);
		
		lp.getLogoutLogout().click();
		Thread.sleep(3000);
		
	}

}
