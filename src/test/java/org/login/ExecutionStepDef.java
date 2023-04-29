package org.login;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExecutionStepDef extends BaseClass{
	@Given("when user click a product link an Signin Alert will be Popup {string} and {string}")
	public void when_user_click_a_product_link_an_signin_alert_will_be_popup_and(String string, String string2) throws InterruptedException {
	    getDriver("chrome");
	    launchurl("https://www.brandalley.co.uk/");
	    Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PomLogin p = new PomLogin();
		WebElement product = p.getProduct();
		product.click();
		p.getMember().click();
	    WebElement email = p.getEmail();
	    email.sendKeys(string);
	    WebElement password = p.getPassword();
	    password.sendKeys(string2);
	    
	}

	@When("User Clicking signin Button")
	public void user_clicking_signin_button() {
	PomLogin p = new PomLogin();
	p.getLogin().click();
	
	}
	@When("user clicking login")
	public void user_clicking_login() {
System.out.println("Login Success");
	}@When("Entering Text in Search Box {string}")
	public void entering_text_in_search_box(String string) throws InterruptedException {
		PomLogin p = new PomLogin();
		Thread.sleep(3000);
		WebElement getproductOne = p.getproductOne();
		WebElement findElement2 = Driver.findElement(By.cssSelector("div#develo-open-search-button"));
		findElement2.click();
		getproductOne.sendKeys(string,Keys.ENTER);
//		JavascriptExecutor js = (JavascriptExecutor) Driver;
//		js.executeScript("arguments[0].setAttribute('style','"+string+"')", getproductOne,Keys.ENTER);
	}
	@When("Clicking the First Product")
	public void clicking_the_first_product() throws InterruptedException {
		//Thread.sleep(3000);
		PomProductOne p = new PomProductOne();
		
		WebElement p1 = p.getP1();
		p1.click();
		
	}
	@Then("Clicking AddToCart Button")
	public void clicking_add_to_cart_button(io.cucumber.datatable.DataTable dataTable) {
		PomProductOne p = new PomProductOne();
		p.getSizeofShirt().click();
		p.getAddToCArt().click();
	}
}