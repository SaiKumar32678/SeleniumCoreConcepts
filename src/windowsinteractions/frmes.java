package windowsinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frmes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saikumar K\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(1);
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame.lazyloaded")));
		Actions a= new Actions(driver);
		WebElement img1=driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
		WebElement img2=driver.findElement(By.xpath("//ul[@id='gallery']/li[3]"));
		WebElement target=driver.findElement(By.cssSelector("#trash"));
		a.dragAndDrop(img1,target).build().perform();
		a.dragAndDrop(img2,target).build().perform();
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//li[@id='menu-item-1513']/a")).getText());
		
		
		
	}

}
