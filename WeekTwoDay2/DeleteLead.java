package WeekTwoDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

			public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.edge.driver","C:\\WorkSpace\\LearnAutomation\\Edge\\msedgedriver.exe");

			EdgeDriver driver = new EdgeDriver();
			driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
		driver.findElement(By.xpath("//input[@name ='phoneNumber']")).sendKeys("9381723489");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(2000);
		
		WebElement leadElement = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a"));
		String leadID = leadElement.getText();
		System.out.println(leadID);
		
        leadElement.click();
        Thread.sleep(1000);
        driver.findElement(By.className("subMenuButtonDangerous")).click();
        
        WebElement verify = driver.findElement(By.xpath("//div[text()='No records to display']"));
        if(verify.isDisplayed()) {
        	System.out.println("profile delted succesfully");
        }
        else 
        {
        	System.out.println("not deleted");
        	}
        driver.quit();
    }


}
