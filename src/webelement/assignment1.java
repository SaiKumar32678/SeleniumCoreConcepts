package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saikumar K\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Siri");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Siri@email.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1122");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.cssSelector("div select option:nth-child(2)")).click();
		driver.findElement(By.cssSelector("input#inlineRadio2")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("26-03-2023");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		
		
	}

}
