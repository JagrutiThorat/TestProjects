package com.learning.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	
	FirefoxDriver driver = new FirefoxDriver();
	
		
	@Given("^user hits the url \"([^\"]*)\"$")
	public void user_hits_the_url(String url) throws Throwable {
		
		driver.get(url);
		driver.findElement(By.partialLinkText("Gmail")).click();
		driver.findElement(By.linkText("Sign In")).click();
 
		}

	@When("^user enters the username \"([^\"]*)\" And password \"([^\"]*)\"$")
	public void user_enters_the_username_And_password(String username, String password) throws Throwable {
		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.id("identifierNext")).click();
		WebElement ide5= driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.elementToBeClickable(ide5));
	    ide5.sendKeys(password);
	    WebElement id4 = driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span"));
	    id4.click();
	}

	@Then("^user see \"([^\"]*)\" button$")
	public void user_see_button(String compose) throws Throwable {
		
		 WebElement id8 = driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]"));
		 
		 Assert.assertEquals(compose,id8.getText());
	    
	}





}
