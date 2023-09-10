package linksCount;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saikumar K\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		System.out.println(footer.findElements(By.xpath("//div/table/tbody/tr/td/ul")).size());
		int sizes=footer.findElements(By.xpath("//div/table/tbody/tr/td/ul")).size();
		
		for(int i=0;i<sizes;i++) {
			String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			footer.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			
			
		}
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
