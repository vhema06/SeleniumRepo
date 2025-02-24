package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSampleCode {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
