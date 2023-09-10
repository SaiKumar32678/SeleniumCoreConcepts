package Scroll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class javascroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saikumar K\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500");
		List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead tr td:nth-child(4)"));
		int sum=0;	
		for(int i=0;i<values.size();i++)
		{
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
		table(driver);
		
		

	}//sum of numbers in third column
	public  static void table(WebDriver driver)
	{
		int sum=0;
		List<WebElement>tb=driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		for(int i=0;i<tb.size();i++)
		{
			sum =sum+Integer.parseInt(tb.get(i).getText());
		}
		System.out.println(sum);
		int total=235;
		Assert.assertEquals(sum,total);
		
	
		
	}

}
