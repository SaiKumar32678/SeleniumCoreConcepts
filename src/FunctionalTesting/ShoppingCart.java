package FunctionalTesting;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCart {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saikumar K\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
		//Implicit
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//Thread.sleep(2000);
		String[] Items= {"Brocolli","Beetroot","Beans","Pears"};
		additems(driver,Items);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//Explicit
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promocode")));
		
		driver.findElement(By.cssSelector(".promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());		
		
		
		

	}
	public static void additems(WebDriver driver,String[] Items)
	{
		List<WebElement> CartItems= driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for(int i=0;i<CartItems.size();i++) 
		{
			String[] name=CartItems.get(i).getText().split("-");
			String formattedlist=name[0].trim();
			List IteamsPresent=Arrays.asList(Items);
			int j=0;
			 
			if(IteamsPresent.contains(formattedlist))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if(j==Items.length) 
				{
					break;
					
				}
				
				
			}
			
			
			
		}
	}

}
