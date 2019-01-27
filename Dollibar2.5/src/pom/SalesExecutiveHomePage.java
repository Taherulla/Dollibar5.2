package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesExecutiveHomePage {

	@FindBy(xpath="//div[text()='Home area']")
	private WebElement homePageTitleText;
	
	public SalesExecutiveHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String getSalesExecutiveHomePageTitle()
	{
		String homePageTitile=homePageTitleText.getText();
		return homePageTitile;
	}
}
