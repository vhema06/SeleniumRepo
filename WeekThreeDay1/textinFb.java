package WeekThreeDay1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textinFb {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");
		//String text = driver.findElement(By.xpath("a")).getText();
		//System.out.println(text);
		List<WebElement> txtInWebPage = driver.findElements(By.tagName("a"));
		for (int i = 0; i < txtInWebPage.size(); i++) {
			WebElement webElement = txtInWebPage.get(i);
			String text1 = webElement.getText();
			System.out.println(text1);
			
			
			
			
			
			
		}
		

	}

}
