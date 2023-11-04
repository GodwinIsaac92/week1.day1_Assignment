package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {

		// browser
		ChromeDriver driver = new ChromeDriver();
		//load URL
		driver.get("https://en-gb.facebook.com/");
		//maximize
		driver.manage().window().maximize();
		//implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		// enter the 1stname
		driver.findElement(By.name("firstname")).sendKeys("Godwin");
		// enter last name
		driver.findElement(By.name("lastname")).sendKeys("Isaac");
		// enter mobile number or email address reg_email_confirmation__
		driver.findElement(By.name("reg_email__")).sendKeys("example@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("example@gmail.com");
		// enter password
		driver.findElement(By.name("reg_passwd__")).sendKeys("godwinIsaac1992");
		//enter the day
		WebElement dayDD = driver.findElement(By.id("day"));
		
		Select day = new Select(dayDD);
		
		day.selectByIndex(0);
		
		//enter the month
		WebElement monthDD = driver.findElement(By.id("month"));
				
		Select month = new Select(monthDD);
				
		month.selectByVisibleText("Oct");
		
		//enter the month
		WebElement yearDD = driver.findElement(By.id("year"));
						
		Select year = new Select(yearDD);
						
		year.selectByValue("1992");
		
		// enter gender
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		
		// enter the submit button
		driver.findElement(By.name("websubmit")).click();
		
		

	}

}
