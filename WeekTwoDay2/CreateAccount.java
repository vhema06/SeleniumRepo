package WeekTwoDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver","C:\\WorkSpace\\LearnAutomation\\Edge\\msedgedriver.exe");

	EdgeDriver driver = new EdgeDriver();	
	driver.manage().window().maximize();

	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("democsr");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Nandax@06");
	WebElement selectDropdown = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
	Select options = new Select(selectDropdown);
	options.selectByIndex(3);
	WebElement selectDropdown1 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
	Select options1 = new Select(selectDropdown1);
	options1.selectByVisibleText("S-Corporation");
	WebElement selectDropdown2 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
	Select options2 = new Select(selectDropdown2);
	options2.selectByValue("LEAD_EMPLOYEE");
	WebElement selectDropdown3 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
	Select options3 = new Select(selectDropdown3);
	options3.selectByIndex(6);
	WebElement selectDropdown4 = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
	Select options4 = new Select(selectDropdown4);
	options4.selectByValue("TX");
	driver.findElement(By.className("smallSubmit")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
	
	
	
	
	
	
	
	}
	
	
	

}
