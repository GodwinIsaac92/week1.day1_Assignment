package week3.day1A;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/button.xhtml");
		
//		driver.findElement(By.xpath("//span[text() = 'Click']")).click();
		
		//Confirm if the button is disabled.
		WebElement disabledElement = driver.findElement(By.xpath("//span[text() = 'Disabled']"));
		
		if (disabledElement.isEnabled()) {
		    System.out.println("The button is already enabled.");
		    disabledElement.click();
		} else {
		    // If the button is disabled, you can enable it by clicking on it or using JavaScript to change its state.
		    // Option 1: Click on the element to enable it
		   // disabledElement.click();
		    
		    // Option 2: Use JavaScript to enable the element
		    // ((JavascriptExecutor) driver).executeScript("arguments[0].disabled = false;", disabledElement);
		    
		    System.out.println("The button is now enabled.");
		}

		

		

		 

		       
	
		

		

	}

}
