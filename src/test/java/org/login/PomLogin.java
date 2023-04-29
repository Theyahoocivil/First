package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogin extends BaseClass{
public PomLogin() {
	PageFactory.initElements(Driver, this);
}
@FindBy(xpath="//a[text()='Already a member? Login here!']")
private WebElement Member;
public WebElement getMember() {
	return Member;
}
@FindBy(css="div#showJoinBox")
private WebElement Product;
public WebElement getProduct() {
	return Product;
}
@FindBy(id="login-email")
private WebElement email;
public WebElement getEmail() {
	return email;
	}
@FindBy(id="pass")
private WebElement password;
public WebElement getPassword() {
	return password;
}
@FindBy(id="login-btn-text")
private WebElement Login;
public WebElement getLogin() {
	return Login;
	
}
@FindBy(xpath="//input[@placeholder='Search products, brands']")
private WebElement productOne;
public WebElement getproductOne() {
	return productOne;
}
}

