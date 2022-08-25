package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionPOM {
	WebDriver driver;
	 
	   public DellActionPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   }
	   
	   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/button/span") 
	   WebElement click_Allsolution;
	   public WebElement Allsolution(){
	   return click_Allsolution;
	 
	    }
	   
	   @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[3]/a")
			   WebElement click_viewallsolution;
			   public WebElement viewallsolution(){
			   return click_viewallsolution;
			   }
			  
}
