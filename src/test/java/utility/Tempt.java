package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tempt 
{
    public static void main(String [] args) throws Throwable
    {
    	//LaunchBrowser
    	System.setProperty("webdriver.chrome.driver", "G:\\Automation Support\\chromedriver.exe");	
		ChromeDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		
		//Open Application
		driver.get("https://www.flipkart.com/");	
		
		//Cancle Login page
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();	                                //click 3 times
		//move to element
		Actions act=new Actions(driver);
		
		WebElement a=driver.findElementByXPath("//*[text()='Login']");
		act.moveToElement(a).build().perform();
		
		//Click on My Profile
		driver.findElementByXPath("//*[text()='My Profile']").click();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Enter username
		driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9168313434");                         //sendKey 2 times
		//Enter Password
		driver.findElementByXPath("//*[@type='password']").sendKeys("abcd@321");
		//click on Login button
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();
		
	/*	Thread.sleep(5000);
		driver.findElementByXPath("//*[text()='Manage Addresses']").click();
		driver.findElementByClassName("_1QhEVk").click();
		driver.findElementByXPath("//*[@name='name']").sendKeys("abc");
		driver.findElementByXPath("//*[@name='phone']").sendKeys("2323232323");
		driver.findElementByXPath("//*[@name='pincode']").sendKeys("412207");
		driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("pune");
		driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("sbroad");
		driver.findElementByXPath("(//*[@type='button'])[2]").click();
	
		
		*/

    }
	
}
