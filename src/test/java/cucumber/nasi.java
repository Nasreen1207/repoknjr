package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class nasi {
	WebDriver driver;
	
	@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\pink\\drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
	    }

	@Given("click on the testme app")
	public void click_on_the_testme_app() {
		 driver.get("http://10.232.237.143:443/TestMeApp/");
	   }

	@When("testme app opens")
	public void testme_app_opens() {
		driver.manage().window().maximize();
	   }

	@When("click on the signup button")
	public void click_on_the_signup_button() {
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@Then("enter username as {string} in the userfield")
	public void enter_username_as_in_the_userfield(String string) {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Ruxin12");
		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(Keys.ENTER);
	   
	}

	@Then("enter firstname as {string} in the selected field")
	public void enter_firstname_as_in_the_selected_field(String string) {
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("nasreen");
	    
	}

	@Then("enter last name as {string} in the selected field")
	public void enter_last_name_as_in_the_selected_field(String string) {
		 driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("lily");
 
	}

	@Then("enter password as {string} in the selected field")
	public void enter_password_as_in_the_selected_field(String string) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("nasreen12");

	    
	}

	@Then("enter confirm password as {string} in the selected field")
	public void enter_confirm_password_as_in_the_selected_field(String string) {
		 driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys("nasreen12");
	    
	}

	@Then("mark gender as {string} in the field")
	public void mark_gender_as_in_the_field(String string) {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	    
	}

	@Then("enter email as {string} in field")
	public void enter_email_as_in_field(String string) {
		
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("abc@gmail.com");

	}

	@Then("enter mobile number as {string} in field")
	public void enter_mobile_number_as_in_field(String string) {
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("9876543210");
	}

	@Then("enter DOB as {string} in selected field")
	public void enter_DOB_as_in_selected_field(String string) {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
		 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[3]")).click();
		 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[49]")).click();
		 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[1]/a")).click();
		
	   
	}

	@Then("enter Address as {string} in field")
	public void enter_Address_as_in_field(String string) {
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("kallakurichi");
	    
	}

	@Then("select security question as {string} in field")
	public void select_security_question_as_in_field(String string) {
		 Select b=new Select(driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")));
		 b.selectByIndex(0);
	}

	@Then("enter answer as {string} in field")
	public void enter_answer_as_in_field(String string) {
		 driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys("kallakurichi");
	   
	}

	@Then("click on the register button")
	public void click_on_the_register_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	   
	}


}
