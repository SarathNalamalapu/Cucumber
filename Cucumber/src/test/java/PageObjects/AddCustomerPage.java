package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	public WebDriver ldriver;
	public AddCustomerPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(ldriver,this);
	}
	@FindBy(xpath="//ul[@class='nav nav-pills nav-sidebar flex-column nav-legacy']/li[@class='nav-item has-treeview'][3]")
	WebElement customers;
	
	@FindBy(xpath="//p[text()=' Customers']")
	WebElement customersoptions;
	
	@FindBy(css="a[class='btn btn-primary']")
	WebElement addbutton;
	
	@FindBy(css="input[id='Email']")
	WebElement txtemail;
	
	@FindBy(css="input[id='Password']")
	WebElement txtpass;
	
	@FindBy(css="input[id='FirstName']")
	WebElement firstname;
	
	@FindBy(css="input[id='LastName']")
	WebElement lastname;
	
	@FindBy(css="input[id='Gender_Male']")
	WebElement malegender;
	
	@FindBy(css="input[id='Gender_Female']")
	WebElement femalegender;
	
	@FindBy(css="input[id='DateOfBirth']")
	WebElement dob;
	
	@FindBy(css="input[id='Company']")
	WebElement companyname;
	
	@FindBy(xpath="//div[@class='k-multiselect-wrap k-floatwrap']")
	WebElement customerrole;
	
	@FindBy(xpath="//li[text()='Administrators']")
	WebElement admin;
	
	@FindBy(xpath="//li[text()='Registered']")
	WebElement register;
	
	@FindBy(xpath="//select[@id='VendorId']")
	WebElement vendor;
	
	@FindBy(xpath="//textarea[@id='AdminComment']")
	WebElement admintext;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement save;
	
	//Action methods
	
	public String gettitle()
	{
		return ldriver.getTitle();
	}
	
	public void clickOnCustomers() {
		customers.click();
	}
	
	public void clickOnCustomersItems() {
		customersoptions.click();
	}
	
	public void clickOnAddButton() {
		addbutton.click();
	}
	
	public void enterEmail(String email) {
		txtemail.sendKeys(email);
	}
	
	public void enterPassword(String pass) {
		txtpass.sendKeys(pass);
	}
	
	public void enterFirstName(String first) {
		firstname.sendKeys(first);
	}
	
	public void enterLastName(String last) {
		lastname.sendKeys(last);
	}
	
	public void setGender(String gen)
	{
		if(gen.equals("Male"))
		{
			malegender.click();
		}
		if(gen.equals("Female"))
		{
			femalegender.click();
		}
	}
	
	public void setDOB(String date) {
		dob.sendKeys(date);
	}
	
	public void setComapanyName(String compname) {
		companyname.sendKeys(compname);
	}
	
	public void setCustomerroles(String role) throws InterruptedException
	{
		customerrole.click();
		Thread.sleep(1000);
		if(role.equals("Administrators"))
		{
			admin.click();
		}
		if(role.equals("Registered"))
		{
			register.click();
		}
		
	}
	
	public void setAdminText(String value) {
		admintext.sendKeys(value);;
		
	}
	
	public void clickOnSave() {
		save.click();
	}
	
	
	
	
	
	
	
	
	
	
}
