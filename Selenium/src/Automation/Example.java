package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.python.core.exceptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Example 
{
	WebDriver driver;
	public void Open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	public void Operation() throws Exception
	{
		Screen s=new Screen();
		Pattern Image1=new Pattern("D:\\programs\\sikuli images\\1search.PNG");
		s.find(Image1);
		s.click();
		s.type("selenium");
		Pattern Image2=new Pattern("D:\\programs\\sikuli images\\2.searchdata.PNG");
		s.find(Image2);
		s.click();
	}

	public static void main(String[] args) throws Exception
	{
		Example data=new Example();
		data.Open();
		data.Operation();

	}

}
