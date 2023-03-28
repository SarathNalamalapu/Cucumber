package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import io.cucumber.java.en.*;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage ad;
	
	@Given("User Launch chrome browser")
	public void user_launch_chrome_browser() {
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
	    System.setProperty("webdriver.chrome.driver","C:/Users/sarath/Downloads/chromedriver_win32/chromedriver.exe");
	    driver=new ChromeDriver(op);
	    lp=new LoginPage(driver);
	    ad=new AddCustomerPage(driver);
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	    
	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String user, String pass) {
		
		lp.setUsername(user);
		lp.setPassword(pass);
	    
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
	    lp.login();
	    Thread.sleep(1000);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(title, driver.getTitle());
		}
	    
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
	    lp.logout();
	    Thread.sleep(1000);
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}
	//Adding new customers step definations.
	
	@Then("User van view the dashboard")
	public void user_van_view_the_dashboard() {
		String s=ad.gettitle();
		Assert.assertEquals("Dashboard / nopCommerce administration",s);
	  
	}
	@When("User click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException {
		Thread.sleep(3000);
		ad.clickOnCustomers();
	  
	}
	@When("Click on customers menu item")
	public void click_on_customers_menu_item() throws InterruptedException {
		Thread.sleep(1000);
	  ad.clickOnCustomersItems();
	}
	@When("Click on add new button")
	public void click_on_add_new_button() throws InterruptedException {
		ad.clickOnAddButton();
		Thread.sleep(3000);
	}
	@Then("user can view  add new customers page")
	public void user_can_view_add_new_customers_page() {
	    Assert.assertEquals("Add a new customer / nopCommerce administration", ad.gettitle());
	}
	@When("user enter the customer info")
	public void user_enter_the_customer_info() throws InterruptedException {
	   ad.enterEmail("pavanraj@gmail.com");
	   ad.enterEmail("test@123");
	   ad.enterFirstName("pavan");
	   ad.enterLastName("raj");
	   ad.setGender("Male");
	   ad.setDOB("7/03/1996");
	   ad.setComapanyName("busy");
	   ad.setCustomerroles("Registered");
	   Thread.sleep(3000);
	   ad.setAdminText("this is testing");
	   
	}
	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
		ad.clickOnSave();
		Thread.sleep(3000);
	}
	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
	   Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(string));
	}


}
