package Scroll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saikumar K\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		//find out num of rows
		List<WebElement>rows=driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println(rows.size());
		//find out num of columns
		List<WebElement> columns= driver.findElements(By.cssSelector(".table-display th"));
		System.out.println(columns.size());
		//find out get text of 3rd row
		List<WebElement> text=driver.findElement(By.cssSelector(".table-display")).findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(text.get(0).getText());
		System.out.println(text.get(1).getText());
		System.out.println(text.get(2).getText());
		
		List<WebElement> totaltext=driver.findElement(By.cssSelector(".table-display tr:nth-child(2)")).findElements(By.tagName("td"));
		System.out.println(totaltext.size());	
		for(int i=0;i<totaltext.size();i++)
		{
//			driver.findElement(By.tagName("td"))
			System.out.println(totaltext.get(i).getText());
		}
		
		
				
	}

}
