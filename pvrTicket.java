package SeleniumMarathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pvrTicket {
	
	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[7]/div/h6")).click();
		driver.findElement(By.xpath("//span[contains(@class,'cinemas')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']/parent::li")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='p-dropdown-items-wrapper']//li)[1]")).click();

		driver.findElement(By.xpath("//span[text()='Tamil']/parent::li[1]")).click();
		driver.findElement(By.xpath("//span[text()='Book']/parent::button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		WebElement element = driver.findElement(By.xpath("//span[@class='seat-current-pvr']"));
		element.click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//div[@class='movies-summary']")).getText();
		System.out.println("Billing Summary:" + text);
		System.out.println("********");
		String text2 = driver.findElement(By.xpath("//div[@class='food-pay-amount']")).getText();
		System.out.println(text2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='cinema-house mobile-login-M'])[2]/preceding::i[1]")).click();

		System.out.println("Current Page Title is: " + driver.getTitle());
	
		

	}

}
