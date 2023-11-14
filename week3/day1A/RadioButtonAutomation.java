package week3.day1A;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAutomation {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.findElement(By.xpath("//label[text() = 'Chrome']")).click();
		driver.findElement(By.xpath("//label[text() = 'Chennai']")).click();
		driver.findElement(By.xpath("//h5[text() = 'Find the default select radio button']/following :: label[text() ='Chrome']")).click();
		driver.findElement(By.xpath("//h5[text() ='Select the age group (only if not selected)']/following :: label[@for = 'j_idt87:age:1']")).click();

	}

}
