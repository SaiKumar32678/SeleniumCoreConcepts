package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saikumar K\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Thread.sleep(5000);
		WebElement StaticDropdown=driver.findElement(By.cssSelector("Select#ctl00_mainContent_DropDownListCurrency"));
	    Select dropdown= new Select(StaticDropdown);
	    dropdown.selectByIndex(1);
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByVisibleText("AED");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByValue("USD");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    
	    

	}

}
