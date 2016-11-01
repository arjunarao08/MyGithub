package JobPortals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Repository 
{
	WebDriver driver;
	public void open()
	{
		//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING TOOLS\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	public void Monster()
	{
		driver.findElement(By.id("gs_htif0")).sendKeys("monster");
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[3]/center/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[4]/div[8]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div/h3/a")).click();
	}
	public static void main(String[] args)
	{
		Repository data=new Repository();
		data.open();
	}

}
