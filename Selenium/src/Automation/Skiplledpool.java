package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Skiplledpool 
{

	WebDriver driver;
	public void Launchpp()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://www.skilledpool.com/");
		
	}
	public void Operation()throws Exception
	{
		driver.findElement(By.id("login_popup")).click();
		driver.findElement(By.linkText("Job Seeker")).click();
		//new Select(driver.findElement(By.id("user_popup"))).selectByVisibleText("Jobseeker");
		driver.findElement(By.id("firstname")).sendKeys("Arjuna Rao");
		driver.findElement(By.id("lastname")).sendKeys("Kundeti");
		driver.findElement(By.id("email")).sendKeys("raoarjun2@gmail.com");
		driver.findElement(By.id("password")).sendKeys("arjunarao08");
		driver.findElement(By.id("confpassword")).sendKeys("arjunarao08");
		Thread.sleep(8000);
		driver.findElement(By.id("termscheck")).click();
		driver.findElement(By.id("termscheck")).click();
	}

	public static void main(String[] args) throws Exception
	{
		Skiplledpool data=new Skiplledpool();
		data.Launchpp();
		data.Operation();

	}

}
