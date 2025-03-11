package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps 
{
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
	}
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page()
	{
	   System.out.println("I am on the login page");
	}
	
	@When("I enter valid credentials")
	public void i_enter_valid_credentials() 
	{
	   driver.findElement(By.id("username")).sendKeys("tomsmith");
	   driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	}
	
	@When("I click on the login button")
	public void i_click_on_the_login_button() 
	{
	   driver.findElement(By.className("radius")).click();
	}
	
	 @Then("Redirecting to secure area") 
	 public void redirecting_to_secure_area()
	 {
	    System.out.println("Redirecting to secure area");
	 }

	 @After
	 public void tearDown()
	 {
		 driver.quit();    
	 }

}
