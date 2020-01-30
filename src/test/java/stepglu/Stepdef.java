package stepglu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	
	WebDriver driver;
	
	
	@When("Larry searches for product in the search field")
	public void larry_searches_for_product_in_the_search_field(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
		List<String> pro_list=dataTable.asList();
		System.out.println(pro_list.size());
		
		for(String plist: pro_list) {
			driver.findElement(By .name("products")).sendKeys(plist);
			String str=driver.findElement(By .xpath("html/body/div[1]/b")).getText();
			System.out.println(str);
			driver.findElement(By .name("products")).clear();
		}
	}

	@Then("searches for the  availability")
	public void searches_for_the_availability() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	
	
	
	
	
	

	@Given("sales executive logged into the machine")
	public void sales_executive_logged_into_the_machine() {
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	driver=DriversUtil.getDriver("chrome");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Given("Alex is existing customer")
	public void alex_is_existing_customer() {
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	}

	@Given("He has good purchase record with store")
	public void he_has_good_purchase_record_with_store() {
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	}

	@When("Alex provides his mobile no")
	public void alex_provides_his_mobile_no() {
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	}

	@Then("Alex should get registration success")
	public void alex_should_get_registration_success() {
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	}

	@When("sales executive provides {string} and {string} as credentials")
	public void sales_executive_provides_and_as_credentials(String string, String string2) {
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
		driver.findElement(By .linkText("Sign")).click();
	
	driver.findElement(By .name("userName")).sendKeys(string);
	driver.findElement(By .name("password")).sendKeys(string);
	driver.findElement(By .name("Cancel")).click();
	driver.quit();
	}

	@Then("Login is successful")
	public void login_is_successful() {
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	}

	@Given("executive added the items to cart")
	public void executive_added_the_items_to_cart() {
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	}

	@When("items price is calculated")
	public void items_price_is_calculated() {
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	}

	@Then("bill is generated with final amount")
	public void bill_is_generated_with_final_amount() {
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	}

}
