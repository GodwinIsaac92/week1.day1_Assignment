package week3.day1A;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractionsWithCheckboxes {

	public static void main(String[] args) {
		
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//timeouts implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get methods
		driver.get("https://leafground.com/checkbox.xhtml");
		
		WebElement basicCheckbox = driver.findElement(By.xpath("//span[text() = 'Basic']"));
        basicCheckbox.click();
        
        // //span[text() = 'Ajax']
        WebElement notificationCheckBox = driver.findElement(By.xpath("//span[text() = 'Ajax']"));
        notificationCheckBox.click();
        
        // favorite language (//div[@class = 'ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]
        WebElement favLangCheckBox = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box')])[3]"));
        favLangCheckBox.click();
        
        //Tri-State //span[@class ='ui-chkbox-icon ui-c ']
        WebElement triStateCheckBox = driver.findElement(By.xpath("(//div[@class ='ui-chkbox ui-widget'])[6]"));
        triStateCheckBox.click();
        
        //Toggle Switch
        WebElement toggleSwitch = driver.findElement(By.xpath("//div[@class ='ui-toggleswitch-slider']"));
        toggleSwitch.click();
        
		
		//Checkbox is disabled //span[text() ='Disabled'] 
        WebElement disabledCheckbox = driver.findElement(By.xpath("//h5[text() = 'Verify if check box is disabled']/following::div//input[@name = 'j_idt87:j_idt102_input']"));
		disabledCheckbox.click();
		 
        
        //Select multiple options //input[@name = 'j_idt87:multiple']
        WebElement selectDropDown = driver.findElement(By.xpath("//div[contains(@class, 'ui-selectcheckboxmenu-trigger')]/span"));
        selectDropDown.click();
        
		/*
		 * //input[@name= 'j_idt87:multiple'][2] WebElement selectDDown =
		 * driver.findElement(By.
		 * xpath("(//span[contains(@class, 'ui-chkbox-icon')])[12]"));
		 * selectDDown.click()
		 */;
        
	}

}
