package WeekThreeDay2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\WorkSpace\\LearnAutomation\\Edge\\msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement promptAlert = driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button"));
		promptAlert.click();
		
		Alert alert =driver.switchTo().alert();
		alert.sendKeys("Hema");
		System.out.println("text inside column:"+ alert.getText());
		alert.accept();
		String promptAlertMsg = driver.findElement(By.id("confirm_result")).getText();
		System.out.println("confirmation msg:"+ promptAlertMsg);
		driver.quit();
		
		
		
		
	}

}
