package hwSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise2 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp ();
		
		//Navigate Browser
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		
		//Click REGISTER link
		WebElement registerLink = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")); 
		registerLink.click();
		Thread.sleep(2000);
		
		
		//Verify the page title is Mercury Tours
		String pageTitle = driver.getTitle();
		Thread.sleep(2000);
		
		
		//Enter (First Name, LastName, Phone, Email, Address, City, State, ZipCode)
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Cindy");
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Beltran");
		Thread.sleep(2000);
		
		WebElement phoneField = driver.findElement(By.name("phone"));
		phoneField.sendKeys("5202787595");
		Thread.sleep(2000);
		
		WebElement emailField = driver.findElement(By.name("userName"));
		emailField.sendKeys("cindybel2@hotmail.com");
		Thread.sleep(2000);
		
		WebElement addressField = driver.findElement(By.name("address1"));
		addressField.sendKeys("Street 123 Drive");
		Thread.sleep(2000);
		
		
		WebElement cityField = driver.findElement(By.name("city"));
		cityField.sendKeys("Tucson");
		Thread.sleep(2000);
		
		WebElement stateField = driver.findElement(By.name("state"));
		stateField.sendKeys("Arizona");
		Thread.sleep(2000);
		
		WebElement zipCodeField = driver.findElement(By.name("postalCode"));
		zipCodeField.sendKeys("85745");
		Thread.sleep(2000);
		
		
		//Enter UserName
		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("cindybel2@hotmail.com");
		Thread.sleep(2000);
		
		
		//Enter Password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456");
		Thread.sleep(2000);
		
		
		//Re-Enter password in confirm password field
		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("123456");
		Thread.sleep(2000); 
		
		//Click Submit
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		Thread.sleep(2000);
		
		//TEST CASE CONFIRMATION
		WebElement confirmText = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
		
		String confirmStr = confirmText.getText();
		
		if(confirmStr.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		
		driver.close();
		
		tearDown();
	}
	
	

}
