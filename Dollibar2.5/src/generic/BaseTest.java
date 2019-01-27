package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements IAutoConst 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openApplication()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.close();
		
	}
	
	@AfterSuite
	public void setTestReport()
	{
		
	}

}
