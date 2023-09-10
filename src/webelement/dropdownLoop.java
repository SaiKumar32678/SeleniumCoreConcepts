package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dropdownLoop {

	public static void main(String[] args) throws InterruptedException {
		// Adding passengers in passenger dropdown 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saikumar K\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++) 
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		for(int i=1;i<4;i++) 
		{
			driver.findElement(By.id("hrefIncChd")).click();
		}
		
		for(int i=1;i<4;i++) 
		{
			driver.findElement(By.id("hrefIncInf")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult, 3 Child, 3 Infant");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		

	}

}
