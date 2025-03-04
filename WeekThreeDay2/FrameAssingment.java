package WeekThreeDay2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameAssingment {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\WorkSpace\\LearnAutomation\\Edge\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(1);

		// Click the "Try It" button inside the frame

		WebElement promptAlert = driver
				.findElement(By.xpath("//h2[text()='JavaScript Prompt']/following-sibling::button"));
		promptAlert.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hema");

		// Click OK in the alert that appears
		System.out.println("text inside column:" + alert.getText());
		alert.accept();

		// Confirm the action is performed correctly by verifying the text displayed
		String promptAlertMsg = driver.findElement(By.id("demo")).getText();
		System.out.println("confirmation msg:" + promptAlertMsg);

		driver.close();

	}

}


