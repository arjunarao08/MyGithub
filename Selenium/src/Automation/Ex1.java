package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ex1 
{
	WebDriver driver;
	public void open()
	{
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING TOOLS\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	}
	public void Monster()
	{
		driver.get("http://www.monsterindia.com/");
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div[4]/div/a[1]/div[3]")).click();
		driver.findElement(By.id("username_login")).sendKeys("raoarjun2@gmail.com");
		//driver.findElement(By.id("password_input")).click();
		driver.findElement(By.xpath("//*[@id='password_input']")).sendKeys("arjunarao08");
		driver.findElement(By.id("button")).click();
		
	}
	public void Naukari()
	{
		driver.get("https://www.naukri.com");
		driver.findElement(By.xpath("//*[@id='login_Layer']/span")).click();
		driver.findElement(By.id("eLogin")).sendKeys("arjun14243@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("arjunarao08");
		driver.findElement(By.xpath("//*[@id='lgnFrm']/div[7]/button")).click();
	}
	public void Naukari1()
	{
		driver.get("https://www.naukri.com");
		driver.findElement(By.xpath("//*[@id='login_Layer']/span")).click();
		driver.findElement(By.id("eLogin")).sendKeys("arjun.kundeti@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("arjunarao08");
		driver.findElement(By.xpath("//*[@id='lgnFrm']/div[7]/button")).click();
	}
	public static void main(String[] args) 
	{
		Ex1 data=new Ex1();
		data.open();
		data.Monster();
		data.open();
		data.Naukari();
		data.open();
		data.Naukari1();
	}

}
