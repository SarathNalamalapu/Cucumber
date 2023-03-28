package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	public LoginPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(ldriver,this);
	}
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	public void setUsername(String user)
	{
		email.clear();
		email.sendKeys(user);
	}
	
	public void setPassword(String pass)
	{
		password.clear();
		password.sendKeys(pass);
	}
	
	public void login()
	{
		login.click();
		
	}
	public void logout()
	{
		logout.click();
	}
}
