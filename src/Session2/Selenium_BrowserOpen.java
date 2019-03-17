package Session2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.Character;

import org.openqa.selenium.chrome.ChromeDriver;



public class Selenium_BrowserOpen 
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		try 
		{
			
			
			driver.get("https://www.google.com");
			WebElement btnSignin=driver.findElement(By.id("gb_70"));
			btnSignin.click();
			WebElement txtusername=driver.findElement(By.xpath("//input[@id='identifierId']"));
			txtusername.sendKeys("abc");
			
			Thread.sleep(3000);
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			
		}
		driver.close();
		driver.quit();
		
	}

}
