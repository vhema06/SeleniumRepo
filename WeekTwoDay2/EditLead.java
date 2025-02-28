package WeekTwoDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\WorkSpace\\LearnAutomation\\Edge\\msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rishabh");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kapoor");
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Employee");	
	driver.findElement(By.className("smallSubmit")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Edit")).click();
    
    Thread.sleep(1000);
    
    WebElement descriptionField = driver.findElement(By.name("description"));
    descriptionField.clear();

    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("form is updated");
    
    driver.findElement(By.className("smallSubmit")).click();
    
    Thread.sleep(1000);
    
	String pageTitle = driver.getTitle();
    System.out.println("Page Title: " + pageTitle);
    
    driver.close();
	
	

	}

}
