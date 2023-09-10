package linksCount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saikumar K\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("#datepicker")).click();
	
		
		while(!driver.findElement(By.cssSelector(".ui-datepicker-title")).getText().contains("December"))
		{
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		int count=driver.findElements(By.cssSelector(".ui-state-default")).size();
		for(int i=0; i<count;i++)
		{
			String text=driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
			if(text.equalsIgnoreCase("31"))
			{
				driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
				System.out.println("Matched");
				break;
			}
		}

	}

}
