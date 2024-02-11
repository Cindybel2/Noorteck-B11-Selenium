package hwSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise3 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
		//Navigate Browser
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(2000);
		
		
		//Click Register Link
		WebElement registerLink = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")); 
		registerLink.click();
		Thread.sleep(2000);
		
		
		//Verify the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		
		//Fill out (Gender, First Name, LastName, Date of Birth, Email)
		
		WebElement checkBoxGender = driver.findElement(By.id("gender-female"));
		checkBoxGender.click();
		
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Cindy");
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		lastName.sendKeys("Beltran");
		Thread.sleep(2000);
		
		
		WebElement dateBirthDay = driver.findElement(By.name("DateOfBirthDay"));
		WebElement dateMonth = driver.findElement(By.name("DateOfBirthMonth"));
		WebElement dateYear = driver.findElement(By.name("DateOfBirthYear"));
		
		Select selectObj = new Select (dateBirthDay);
		Select selectObj2 = new Select (dateMonth);
		Select selectObj3 = new Select (dateYear);
		
		selectObj.selectByVisibleText("12");
		Thread.sleep(2000);
		
		selectObj2.selectByVisibleText("May");
		Thread.sleep(2000);
		
		selectObj3.selectByVisibleText("1988");
		Thread.sleep(2000);
		
		WebElement emailField = driver.findElement(By.id("Email"));
		emailField.sendKeys("cindybel@hotmail.com");
		Thread.sleep(2000);
		
		
		//Enter company Name
		WebElement companyField = driver.findElement(By.id("Company"));
		companyField.sendKeys("Orange123");
		Thread.sleep(2000);
		
		
		//Uncheck Newsletter checkbox
		WebElement checkBox = driver.findElement(By.id("Newsletter"));
		checkBox.click();
		
		
		//Enter password
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("123456");
		Thread.sleep(2000);
		
		
		//Enter Username
		WebElement confirmpassword = driver.findElement(By.id("ConfirmPassword"));
		confirmpassword.sendKeys("123456");
		Thread.sleep(2000);
		
		//Click register button
				WebElement submitButton = driver.findElement(By.id("register-button"));
				submitButton.click();
				Thread.sleep(2000);
		
				
				//TEST CASE CONFIRMATION
		WebElement confirmText = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
				
		String confirmStr = confirmText.getText();
				
		if(confirmStr.contains("Your registration completed")) {
					System.out.println("TESTCASE PASSED");
		} else {
					System.out.println("TESTCASE FAILED");
		}
				
		driver.close();
				
			
		tearDown();
		
	}

}
