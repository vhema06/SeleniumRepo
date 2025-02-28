package WeekTwoDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterForm {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@class,'selected ')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("check");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("faceleaf");
		
		WebElement selectDropdown = driver.findElement(By.xpath("//select[@id='day']"));
		Select options = new Select(selectDropdown);
		options.selectByIndex(5);
		WebElement selectDropdown1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select options1 = new Select(selectDropdown1);
		options1.selectByIndex(5);
		WebElement selectDropdown2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select options2 = new Select(selectDropdown2);
		options2.selectByValue("1981");
		
		WebElement Radio = driver.findElement(By.xpath("//input[contains(@id,'sex')][1]"));
		Radio.click();
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[5]")).sendKeys("faceleaf01@gmail.com");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Test@123");
		driver.findElement(By.xpath("(//button[contains(@type,'submit')])[1]")).click();		
		
		

	}

}
