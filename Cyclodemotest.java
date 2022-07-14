package fkpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cyclodemotest {
	WebDriver d;
	@BeforeMethod
	public void setUp()
	{
		// Launch the browser
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\FAIZAN\\\\Downloads\\\\geckodriver-v0.30.0-win32\\\\geckodriver.exe");
		d=new FirefoxDriver();
	}
	@Test
	public void test() throws InterruptedException
	{
	     //load the web page
		d.get("https://demo.cyclos.org/ui/login");
		
		//enter urname
		//d.findElement(By.xpath("//input[@type='text']")).clear();
		d.findElement(By.xpath("//input")).sendKeys("demo");
		//String uname=d.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		//enter password
		//d.findElement(By.xpath("//input[@type='password']")).clear();
		d.findElement(By.xpath("//password-input/div/input")).sendKeys("1234");
		//String password=d.findElement(By.xpath("//input[@type='password']")).getAttribute("value");
		//click submit button
		d.findElement(By.xpath("//span[contains(.,'Submit')]")).click();
		Thread.sleep(3000);
		}
	
	
	@AfterMethod
	public void tearDown()
	{
		// Close the browser
		d.quit();
	}


}
