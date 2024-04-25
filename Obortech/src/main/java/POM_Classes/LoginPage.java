package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='login-username']")
	private WebElement userNameTextfield;
	
	public WebElement getUsernameTextfiled()
	{
		return userNameTextfield;
	}
	
	
	@FindBy(xpath="//input[@id='login-password']")
	private WebElement profilepasswordTextfield;
	
	public WebElement getProfilePasswordTextfield()
	{
		return profilepasswordTextfield;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	private WebElement continueButton;
	
	public WebElement getContinueButton()
	{
		return continueButton;
	}
	
	
	@FindBy(xpath="//label[contains(text(),'Remember Me')]")
	private WebElement remembermeButton;
	
	public WebElement getRemembermeButton()
	{
		return  remembermeButton;
	}
	
	@FindBy(xpath="//a[contains(text(),'Forgot Password?')]")
	private WebElement forgotButton;
	
	private WebElement getForgotButton()
	{
		return forgotButton;
	}
	
	
	@FindBy(xpath="//input[@id='transaction-password']")
	private WebElement blockchainPassword;
	
	public WebElement getBlockchainPassword()
	{
		return blockchainPassword;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	private WebElement continueofBlockchain;
	
	public WebElement getContinueofBlockchain()
	{
		return continueofBlockchain;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Forgot Password?')]")
	private WebElement forgotofBlockchainpassword;
	
	public WebElement getForgotofBlockchainPassword()
	{
		return forgotofBlockchainpassword;
	}
	
	
	
	
	
	
}
