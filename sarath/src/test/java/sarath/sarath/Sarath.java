package sarath.sarath;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Sarath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		System.getProperty("webdriver.chrome.driver", "C:/Users/sarath/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver(op);
		driver.get("http://admin-demo.nopcommerce.com/login");

	}

}
