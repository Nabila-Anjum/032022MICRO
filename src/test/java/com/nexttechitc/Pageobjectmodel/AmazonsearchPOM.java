package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {

WebDriver driver;
	
	   public AmazonsearchPOM(WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   }
		 
	   
	   @FindBy(name="field-keywords")
	   WebElement Type_amazonsearch;
	   public WebElement Amazonsearch (){
	   return Type_amazonsearch;
	   }
	   
	   //id="nav-search-submit-button"
	   @FindBy(id="nav-search-submit-button")
	   WebElement Click_searchicon;
	   public WebElement searchicon (){
	   return Click_searchicon;
	   }
	   
}
