package hwSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
		//Navigate Browser
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		
		//Enter ntk-admin in the username field
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("ntk-admin");
		
		Thread.sleep(1000);
		
		//Enter Ntk-orange!admin.123 in the password field
		WebElement usernameField1 = driver.findElement(By.name("password"));
		usernameField1.sendKeys("Ntk-orange!admin.123");
		
		Thread.sleep(1000);
		
		//Click Login Button
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		loginButton.click();
		Thread.sleep(1000);
		
		//Retrieve the Header Text and Verify the header is Dashboard
		WebElement headerText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		
		String headerStr = headerText.getText();
		Thread.sleep(2000);
		
		if(headerStr.equals("Dashboard")) {
			System.out.println("Verifying Dashboard is the heather");
		} else {
			System.out.println("Dashboard IS NOT the heather");
		}
		
		//Close Browser 
		driver.close();
		
		//PUSH
		
		//PUSH
		
		tearDown();
	}

}
