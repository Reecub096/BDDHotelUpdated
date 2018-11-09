package userLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHLogin {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Softwares/hotelBooking/login.html");
		System.out.println(driver.getCurrentUrl());
		String strheading = driver.findElement(By.xpath(".//*[@id='mainCnt']/div[1]/div[1]/h1")).getText();
		if(strheading.contentEquals("Hotel Booking Application"))
			System.out.println("Heading Matched");
		else
			System.out.println("Heading Not Matched");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.name("userName")).sendKeys("capgemini");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
//		driver.findElement(By.name("userPwd")).sendKeys("capg");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.className("btn")).click();
//		driver.close();
		Thread.sleep(10000);
		driver.quit();
	}

}
