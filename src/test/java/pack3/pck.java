package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class pck {
WebDriver driver;
	
	@Given("click on the login page")
	public void click_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\pink\\drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("I enter {string} in the user field")
	public void i_enter_in_the_user_field(String string) {
		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Lalitha");
	}

	@Then("I enter {string} in the password field")
	public void i_enter_in_the_password_field(String string) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		
	}
	    

	@Then("the home page is displayed")
	public void the_home_page_is_displayed() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		}


	@Then("I enter {string} in the field")
	public void i_enter_in_the_field(String string) {
		driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys(string);
	   
	}

	@Then("I click on the find details")
	public void i_click_on_the_find_details() {
		
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("the item is displayed")
	public void the_item_is_displayed() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]"));
	   
	}


}
