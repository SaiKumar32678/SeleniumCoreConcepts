package javastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.netty.handler.codec.spdy.SpdyHttpHeaders.Names;
import io.netty.util.internal.SystemPropertyUtil;

public class streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saikumar K\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.manage().window().maximize();
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("sai");names.add("san");names.add("ruth");names.add("ram");
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("s"))
			{
			  System.out.println(actual);
			  count++;
			}
			
		}
		System.out.println(count);
		//filter();
		//streem();
		//sort();
		//anymatch();
		collect();
		
	}
	public static void filter() {
		
			ArrayList<String> names=new ArrayList<String>();
			names.add("sai");names.add("san");names.add("ruth");names.add("ram");
			Long c=names.stream().filter(s->s.startsWith("s")).count();
			//System.out.println(c);
			//uppercase using foreach and limit
			names.stream().filter(s->s.length()>3).limit(1).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
 
	   
	
	}
	public static void streem() {
		Long a=Stream.of("sai","san","sravan","lok","prab").filter(s->s.startsWith("s")).count();
		System.out.println(a);
		//uppercase using foreach
		Stream.of("sai","san","sravan","lok","prab").filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}
	public static void sort() {
		List<Integer> values=Arrays.asList(1,4,7,8,5,3,6,9);
		values.stream().sorted().forEach(s->System.out.println(s));
		List<String> name=Arrays.asList("SAIKUMAR	","PAVANKUMAR","VARA","ADITYA","SARATHKUMAR");
		name.stream().filter(s->s.startsWith("S")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
		name.stream().filter(s->s.contains("KUMAR")).map(s->s.toLowerCase()).forEach(s->System.out.println(s));
		
		
	}
	public static void anymatch()
	{
		List<String> name1=Arrays.asList("SAIKUMAR","SASI","PAVANKUMAR","VARA","ADITYA","SARATHKUMAR");	
		name1.stream().filter(s->s.startsWith("S")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
		ArrayList<String> names=new ArrayList<String>();
		names.add("sai");names.add("san");names.add("ruth");names.add("ram");
		Stream<String>newstream=Stream.concat(name1.stream(), names.stream());
//		newstream.sorted().forEach(s->System.out.println(s));
		boolean flag=newstream.anyMatch(s->s.equalsIgnoreCase("ruth"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		
		
	}
	public static void collect()
	{
		List<String>li=Stream.of("sai","san","sravan","lok","prab").filter(s->s.endsWith("n")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(li.get(1));
		
		List<Integer>value=Arrays.asList(3,2,2,5,5,6,4,8,6);
		value.stream().distinct().sorted().forEach(s->System.out.println(s));
		List<Integer>lis=value.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(lis.get(0));
		
	}

		
	}
	


