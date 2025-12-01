package stepdefinitions;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchResultsPage;
import utils.ElementUtils;

public class Orders {
	
	WebDriver driver;
	private LoginPage loginPage;
	private AccountPage accountPage;
	private ElementUtils elementUtils;
	private HomePage homePage;
	private SearchResultsPage searchResultsPage;
	
	@Given("^I login to the application with enter valid email (.+) and valid password (.+)$")
	public void i_login_to_the_application_with_enter_valid_email_username_and_valid_password_password(String emailText,String passwordText) {
	   
		driver = DriverFactory.getDriver();
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccount();
		loginPage = homePage.selectLoginOption();
		loginPage.enterEmailAddress(emailText);
		loginPage.enterPassword(passwordText);
		accountPage=loginPage.clickOnLoginButton();
		
	}
	@When("User enters valid product {string} into Search box field and add product to Bag and checkout")
	public void user_enters_valid_product_into_search_box_field_and_add_product_to_bag_and_checkout(String validProductText ) {
		homePage = new HomePage(driver);
		homePage.enterProductIntoSearchBox(validProductText);
		System.out.println(validProductText);
		searchResultsPage=homePage.clickOnSearchButton();
		
		
		
	}
	@And("I place an order")
	public void i_place_an_order() {
		
	   System.out.println("need to impliment");
	  
	}
	@Then("I should see that the order is placed sucessfully")
	public void i_should_see_that_the_order_is_placed_sucessfully() {
		 System.out.println("need to impliment");
	}

}
