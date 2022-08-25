package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestsellerPOM {
	
	WebDriver driver;//global variable
	 /*
	  * constructor is not a method but special type of method
	  * 1. Constructor name should be match with class name
	  * 2. it has no return type
	  */
	 //we use constructor to access code from one class to another class
	   public BestsellerPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   }
	 
	    

	  //@FindBy(xpath="/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[2]")
	 @FindBy(xpath="//a [@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
	  //@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[2]")
	   WebElement click_bestseller;
	   public WebElement bestseller(){
	   return click_bestseller;
	  
	    }
	 


}
