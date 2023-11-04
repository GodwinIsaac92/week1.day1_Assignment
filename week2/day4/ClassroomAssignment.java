package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomAssignment {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
				
		//load url
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//locator  the username 
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//locator  the  passContainer
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//login button click
		driver.findElement(By.name("login")).click();
		
		//Find your account and log in
		driver.findElement(By.linkText("Find your account and log in")).click();
		
		//title
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals(title)) {
			System.out.println("successfully");
		}
		
		//wait 
		Thread.sleep(2000);
		

	}

}
