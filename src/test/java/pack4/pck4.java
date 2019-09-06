package pack4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class pck4 {
	WebDriver driver;

@Given("user in the home page")
public void user_in_the_home_page() {
	System.setProperty("webdriver.chrome.driver","C:\\pink\\drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/");
	   driver.manage().window().maximize();
}

	
	@When("I enter {string} in the search field")
	public void i_enter_in_the_search_field(String string) {
		
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
	   

	@Then("I click add to cart")
	public void i_click_add_to_cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@Then("the login page is displayed")
	public void the_login_page_is_displayed() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset"));
	}
	    
	}


