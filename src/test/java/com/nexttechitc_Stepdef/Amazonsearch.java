package com.nexttechitc_Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearch {
WebDriver driver;
	@Given("^user visit Amazon homepage$")
	public void user_visit_Amazon_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Implicit wait (soft wait)
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
	   // Maximize window
		driver.manage().window().maximize();
		//hard wait 
		//Thread.sleep(3000);
		
		//Scrolldown Code
		//JavascriptExecutor jsx = (JavascriptExecutor)driver;
		//jsx.executeScript("window.scrollBy(0,4500)", ""); //scroll down,
 
	}
    
	@When("^user type \"([^\"]*)\" product name and click search icon$")
	public void user_type_product_name_and_click_search_icon(String arg1) throws Throwable {
	   try { 
		AmazonsearchPOM obj =new AmazonsearchPOM(driver);
		obj.Amazonsearch().sendKeys(arg1);
		obj.searchicon().click();
		
		//Explicit wait
		WebDriverWait Wait = new WebDriverWait (driver,20);
	   }
	   catch (Exception e) {
		   System.out.println("amazon search option");
	   }
	}

	@Then("^user should be able to see the expected product$")
	public void user_should_be_able_to_see_the_expected_product() throws Throwable {
		//What is the different between close and quit
	   // driver.close();
	    driver.quit();
	}
}
