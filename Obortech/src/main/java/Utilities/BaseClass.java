package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
public static WebDriver driver;

public DataUtility du=new DataUtility();

@BeforeClass

public void launchBrowser() throws Throwable
{
	System.out.println("---------LAunching Browser-----------");
	String Browser = du.datafromPropertiesfile("browser");
	
	
	if (Browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(Browser.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	
	else if(Browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
		
	}
	
	else
	{
		driver=new ChromeDriver();
		
	}
	
	String Url = du.datafromPropertiesfile("url");
	driver.get(Url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}

}
