package windowsinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MouseInteractions, Capitals,Selecting text,right click
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saikumar K\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_19f32o2up6_e&adgrpid=64607481971&hvpone=&hvptwo=&hvadid=486382369863&hvpos=&hvnetw=g&hvrand=995193623226443436&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062119&hvtargid=kwd-297775402051&hydadcr=5650_2175716&gclid=CjwKCAiA2fmdBhBpEiwA4CcHzUb7V9yzAY7R1tSnRnGT3gMev1W_LZK9H1pcCbtVo768soR2fnOUwRoCBn0QAvD_BwE");
	    Actions b= new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		b.moveToElement(move).contextClick().build().perform();
		WebElement move2=driver.findElement(By.id("twotabsearchtextbox"));
		b.moveToElement(move2).click().keyDown(Keys.SHIFT).sendKeys("oneplusnord2t").doubleClick().build().perform();
		

	}

}
