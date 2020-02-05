package stepglu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	
	WebDriver driver;
	SoftAssert Assert=new SoftAssert(); 
	

	@Given("user is at login page")
	public void user_is_at_login_page() {
		driver=DriversUtil.getDriver("chrome");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}
	
	@When("user provides {string} and {string} as credentials")
	public void user_provides_and_as_credentials(String String,String String2) {
		driver.findElement(By .linkText("SignIn")).click();
		driver.findElement(By .name("userName")).sendKeys(String);
		driver.findElement(By .name("password")).sendKeys(String2);
		driver.findElement(By .name("Login")).click();
		//driver.findElement(By .name("cancel")).click();
	}
	
	
	@Then("login is successful")
	public void login_is_successful() {
		
	}
	 
	@Given("admin logged in to the TestMeApp")
	public void admin_logged_in_to_the_TestMeApp(){
			
	}
	
	@Then("admin click on {string} option")
		public void admin_click_on_option(String string) {
		
		driver.findElement(By .linkText("Add Category")).click();
		
	}
	
	 @Then("enter {string} and {string}")
	 public void enter_and(String string,String string2) {
		 
		 driver.findElement(By .name("catgName")).sendKeys(string);
		 driver.findElement(By .name("catgDesc")).sendKeys(string2);
		
		 
		 
	 }
	
	@Then("click on add")
	
	public void click_on_add() {
		driver.findElement(By .linkText("Add")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
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

//	@When("sales executive provides {string} and {string} as credentials")
//	public void sales_executive_provides_and_as_credentials(String string, String string2) {
//	   // Write code here that turns the phrase above into concrete actions
//	   //throw new cucumber.api.PendingException();
//		driver.findElement(By .linkText("Sign")).click();
//	
//	driver.findElement(By .name("userName")).sendKeys(string);
//	driver.findElement(By .name("password")).sendKeys(string);
//	driver.findElement(By .name("Cancel")).click();
//	driver.quit();
//	}

//	@Then("Login is successful")
//	public void login_is_successful() {
//	   // Write code here that turns the phrase above into concrete actions
//	   //throw new cucumber.api.PendingException();
//	}

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

	@Given("User proceeds to payment without adding any item in the cart")
	public void team_proceeds_to_payment_without_adding_any_item_in_the_cart()
	{
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
		driver.findElement(By .linkText("SignIn")).click();
		driver.findElement(By .name("userName")).sendKeys("Lalitha");
		driver.findElement(By .name("password")).sendKeys("password123");
		driver.findElement(By .name("Login")).click();
		driver.findElement(By .xpath("//*[@id=\"myInput\"]")).sendKeys("HeadPhone");
		driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();	
	   
	  
	}
	@Then("TestMeApp doesnot display the cart icon")
	public void testmeapp_doesnot_display_the_cart_icon()
	{
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	Assert.assertNotSame("Search", driver.getTitle());
	System.out.println("Cart symbol not found");
	}
	@When("User proceeds to payment with adding any item to the cart")
	public void team_proceeds_to_payment_with_adding_any_item_to_the_cart()
	{
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	//driver.findElement(By .xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}
	@Then("TestMeApp displays cart icon")
	public void testmeapp_displays_cart_icon()
	{
	   // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		System.out.println(driver.getTitle());
		 Assert.assertEquals("Search", driver.getTitle());
	    driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By .xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	driver.findElement(By .xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
