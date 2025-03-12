package WeekFourDay1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class YahooFinance {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://finance.yahoo.com/");

		Actions action = new Actions(driver);
		WebElement moreLink = driver.findElement(By.xpath("(//button[@aria-label='More'])[1]"));
		action.moveToElement(moreLink).perform();

		WebElement crypto = driver.findElement(By.xpath("//a[contains(@aria-label,'Finance: Crypto')]"));
		action.moveToElement(crypto).click(crypto).perform();

		driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']"));

		List<WebElement> row = driver
				.findElements(By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']//tr"));
		int rowSize = row.size() - 1;// excluding table header
		System.out.println("Row Size:" + rowSize);

		List<WebElement> columnheader = driver
				.findElements(By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']//tr/th"));
		int columnSize = columnheader.size();
		System.out.println("Column Size:" + columnSize);

		for (int i = 2; i <= rowSize; i++) // (tr[1] is header so actual row starts from 2)
		{

			WebElement cryptoName = driver.findElement(
					By.xpath("//table[@class='markets-table freeze-col yf-hhhli1 fixedLayout']//tr[" + i + "]/td[2]"));

			System.out.println(cryptoName.getText());
		}

		driver.quit();
	}
}
