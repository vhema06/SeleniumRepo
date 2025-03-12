package WeekFourDay1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\WorkSpace\\LearnAutomation\\Edge\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// click on sort on Date
		driver.findElement(By.id("chkSelectDateOnly")).click();

		// Retrieve the train names from the web table.

		List<WebElement> nameList = driver.findElements(By.xpath("//div[@id='divTrainsList']//tbody/tr/td[2]"));
		List<WebElement> columns = driver.findElements(By.xpath("//div[@id='divTrainsList']//table//tr/td[2]"));
		int sizeCol = columns.size();
		System.out.println("Total Number of coulmns listed: " + sizeCol);

		Set<String> trainNamesSet = new HashSet<>();
		for (int i = 2; i < sizeCol; i++) {
			// Get elements for the second column
			List<WebElement> names = driver
					.findElements(By.xpath("//div[@id='divTrainsList']//table//tr[" + i + "]/td[2]"));

			// Checking if the row exists before accessing it
			if (!names.isEmpty()) {
				String trainName = names.get(0).getText();
				if (!trainName.isEmpty())
					trainNamesSet.add(trainName);
			} else { // Skipping rows that doesnt exist
				System.out.println("Skipping row " + i + " as it does not exist.");
			}
		}

		System.out.println("Names of the Trains:");
		System.out.println(trainNamesSet);

	}
}