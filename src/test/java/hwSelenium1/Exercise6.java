package hwSelenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise6 extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		//Navigate Browser
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		//Verify the page title IS ALERTS
				String pageTitle = driver.getTitle();
				System.out.println("Page Title: " + pageTitle);
		
		Thread.sleep(2000);
		
		//Click Alert with Textbox
		WebElement alertwTextBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		
		alertwTextBtn.click();
		Thread.sleep(2000);
		
		//Click the button to demonstrate the prompt box
		WebElement alertPrompt =driver.findElement(By.xpath("//*[@id=\"Textbox\"]"));
		
		alertPrompt.click();
		Thread.sleep(2000);
		
		
		//Enter your name in the Alert Text field.  
		Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.sendKeys("Cindy Beltran");

        alert.accept();
        Thread.sleep(2000);
        
	    //Click the button to demonstrate the prompt box
        //button contains following phrase: How are you today
        
        WebElement MsgDisplayed = driver.findElement(By.id("demo1"));
        String MessageStr= MsgDisplayed.getText();
        
        if (MessageStr.contains("How are you today")) {
        	
        	System.out.println("It does contain How are you today");
        	
        } else {
        	
        	System.out.println("It DOES NOT contain How are you today");
        }
	
        
        //Refresh the page.
        driver.navigate().refresh();
        Thread.sleep(2000);
        
        
        //Click Alert with OK & Cancel
        WebElement okAndCancel = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
        okAndCancel.click();
        
        
        //Click the button to display a confirm box button
        WebElement confirmBox = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
        confirmBox.click();
        
        //Verify the text in alert contains "Press a Button"
        Alert alert1 = driver.switchTo().alert();
        String alertText = alert1.getText();
        
        boolean isTextPresent = alertText.contains("Press a Button !");
        
        if (isTextPresent) {
            alert.dismiss(); 
        } else {
            alert.accept(); 
             
        }
        
        
        //Verify the message displayed under Click the button to display a confirm box
        WebElement messageElement = driver.findElement(By.id("demo"));
        
        String msgText = messageElement.getText();
        
        if (msgText.contains("You Pressed")) {
            System.out.println("Message contains 'You Pressed'");
        } else {
            System.out.println("Message DOES NOT contain 'You Pressed'");
        }
        
        driver.quit();
        
		tearDown();
		
	}

}