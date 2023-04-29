package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomProductOne extends BaseClass {
	public PomProductOne() {
		PageFactory.initElements(Driver, this);
	}
	@FindBy(xpath ="//div[@class='ais-infinite-hits--item']/child::div[@class='col-md-4 col-sm-6']/child::div[@class='result-wrapper']/child::a[@class='result algolia-clearfix']/child::div[@class='result-content']/child::div[@class='result-thumbnail']/child::img[@src='https://www.brandalley.co.uk/media/catalog/product/cache/1/small_image/400x400/e4d92e6aceaad517e7b5c12e0dc06587/1/8/18302214-1.jpg']")
	private WebElement P1;
	public WebElement getP1() {
		return P1;
		
	}
	@FindBy(css="div#option_129")
	private WebElement Size;
	public WebElement getSizeofShirt() {
		return Size;
	}
	
	@FindBy(id="product-addtocart-button")
	private WebElement AddToCArt;
	public WebElement getAddToCArt() {
		return AddToCArt;
		
	}
	
	
}
	


