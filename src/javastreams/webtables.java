package javastreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;



public class webtables {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saikumar K\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all elements into list

		List<WebElement> veglist=driver.findElements(By.xpath("//tr/td[1]"));
		//capture all web elements text into one list that is original list
		List<String> originalList=veglist.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort on the original list
		List<String>newList=originalList.stream().sorted().collect(Collectors.toList());
		//compare original list vs sorted lsit
		Assert.assertEquals(originalList,newList);
		System.out.println(newList);
		System.out.println(originalList);
		List<String> price;
		//get the price of the veggie from table
		do
		{
		List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
		price=rows.stream().filter(s->s.getText().contains("Rice")).
				map(s->getVegPrice(s)).collect(Collectors.toList());
		price.forEach(s->System.out.println(s));
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(price.size()<1);

	}


	private static String getVegPrice(WebElement s) {
		// TODO Auto-generated method stub
		String value=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return value;
	}

}
