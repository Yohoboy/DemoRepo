package com.DDT_PropertyFile;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromInstaPropertyFile
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		try 
		{
			FileInputStream fis = new FileInputStream("./Common_data_Folder/InstaLoginProperty.properties");
			
			Properties property = new Properties();
			
			property.load(fis);
			
			String url = property.getProperty("url");
			
			String userName = property.getProperty("userName");
			
			String password = property.getProperty("password");
			
			System.out.println(password);
			
			driver.get(url);
			
			driver.findElement(By.xpath("//*[@name='username']")).sendKeys(userName);
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			
			//driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1- _ap30')]")).click();
			
			//driver.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
