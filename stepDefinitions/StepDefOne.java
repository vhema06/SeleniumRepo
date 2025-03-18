package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefOne {
	

	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		 System.out.println("able to see login page");
	    
	}
	@When("the user enters the username as demosalesmanager")
	public void the_user_enters_the_username_as_demosalesmanager() {
		 System.out.println("able to enter username");	
		
	}
	@When("the user enters the passwaord as crmfsa")
	public void the_user_enters_the_passwaord_as_crmfsa() {
		 System.out.println("able to enter password");
	  
	}
	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
		 System.out.println("able to clickon login button");
	}
	@Then("the user should be redirected to welcome page")
	public void the_user_should_be_redirected_to_welcome_page() {
		 System.out.println("redirectedto welcome page");
	    
	}
	@Then("the user should be able to view the welcome page")
	public void the_user_should_be_able_to_view_the_welcome_page() {
		 System.out.println("able to view the welcome page");
	   
	}
	

	   
}
