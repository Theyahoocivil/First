package org.productOne;

import org.login.BaseClass;
import org.login.PomProductOne;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExecutionProductOne extends BaseClass{

	@Given("User Entering Text in Search Box")
	public void user_entering_text_in_search_box() {
		System.out.println("Search Box");
	}
	@When("User Entering product name {string} and Click Enter")
	public void user_entering_product_name_and_click_enter(String string) {
		PomProductOne po = new PomProductOne();
//		WebElement getproductOne = po.get
//		getproductOne.sendKeys(string);
	}

	@When("User Selecting the First product MilkSilkPatch by Clicking")
	public void user_selecting_the_first_product_milk_silk_patch_by_clicking() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Clicking Add TO Cart Basket AddToBasket.")
	public void user_clicking_add_to_cart_basket_add_to_basket() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	

	
}
