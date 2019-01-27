package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement LoginTextBox;
	
	@FindBy(id="password")
	private WebElement passwordTextBox;
	
	@FindBy(xpath="//input[contains(@value,'Connection')]")
	private WebElement connectionButton;
	
	LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String lID)
	{
		LoginTextBox.sendKeys(lID);
	}
	
	public void setPassword(String pwd)
	{
		passwordTextBox.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		connectionButton.click();
	}

}
