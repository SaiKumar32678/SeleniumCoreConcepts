

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saikumar K\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver r = new ChromeDriver();
		r.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		r.get("https://courses.rahulshettyacademy.com/?flash=checkout.already_purchased_error");
		r.findElement(By.className("login-btn")).click();
		r.findElement(By.linkText("Log in")).click();
		//r.findElement(By.name("sign_up_method")).click();
		//r.findElement(By.id("user_name")).sendKeys("Saikumar");
		r.findElement(By.name("email")).sendKeys("sai@gmail.com");
		r.findElement(By.name("password")).sendKeys("Saaa12233");
		r.findElement(By.name("commit")).click();
		//System.out.println(r.findElement(By.cssSelector("span.text-with-icon")).getText());
		r.findElement(By.cssSelector("a[class='bodySmall form-footer']")).click();	
		r.findElement(By.name("email")).sendKeys("sai@gmail.com");
		r.findElement(By.name("commit")).click();
		
		

	}

}
