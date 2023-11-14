package week3.day1A;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/. .");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locate the element for userName
		driver.findElement(By.className("inputLogin")).sendKeys("DemoCSR");
				

		//locate the element for userName
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//crm/sfa
		driver.findElement(By.xpath("//div[@id = 'label']/a")).click();
		
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//click phone tap
		driver.findElement(By.linkText("Phone")).click();
		
	}

}
