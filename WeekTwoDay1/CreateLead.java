package WeekTwoDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
	
		
		//ChromeOptions chrome = new ChromeOptions();
		//chrome.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver","C:\\WorkSpace\\LearnAutomation\\Edge\\msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("democsr");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hema");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("venkat");
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
	driver.findElement(By.className("smallSubmit")).click();
	String title = driver.getTitle();
	System.out.println(title);
	String expTitle = "View Lead | opentaps CRM";
	if (title.equals(expTitle)) {
		System.out.println("Title Matched");
	} else
		System.out.println("Title Not Matched");

	driver.close();
	
	}

}
