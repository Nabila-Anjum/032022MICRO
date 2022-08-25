package com.nexttechitc_Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.Pageobjectmodel.FBSignUpPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBSignUp {
	WebDriver driver;
	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(23, TimeUnit.SECONDS);
	    
		driver.get("https://www.facebook.com/reg/\r\n");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println("Browser and URL not opening");
		}

	}

	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		try {
			
		FBSignUpPOM obj=new FBSignUpPOM(driver);
		
		obj.firstname().sendKeys(arg1);
		obj.lastname().sendKeys(arg2);
		obj.email().sendKeys(arg3);
		obj.password().sendKeys(arg4);
		
		Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println("Element not found exception");
		}
		
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		FBSignUpPOM obj1=new FBSignUpPOM(driver);
		Select dropdown=new Select (obj1.click_month);
		dropdown.selectByIndex(2);
	    
		Select dropdown1=new Select (obj1.click_day);
		dropdown1.selectByValue("2");
		Select dropdown2=new Select (obj1.click_year);
		dropdown2.selectByVisibleText("2000");
		
		obj1.female().click();
		obj1.SignUp().click();
	}

}
