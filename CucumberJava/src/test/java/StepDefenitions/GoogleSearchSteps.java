package StepDefenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
//	WebDriver driver = null;
//	
//	@SuppressWarnings("deprecation")
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//	   
//	   driver=new ChromeDriver();
//	   
//	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	   
//	   driver.manage().window().maximize();
//	}
//
//	@And("user in on google search page")
//	public void user_in_on_google_search_page() {
//		 System.out.println("Inside Step - use is on google page");
//		 
//		 driver.navigate().to("https://google.com");
//		
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException {
//		 System.out.println("Inside Step - user enters text");
//		 driver.findElement(By.name("q")).sendKeys("Amazon");
//		 Thread.sleep(2000);
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//		 System.out.println("Inside Step - hits enter");
//		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		 Thread.sleep(2000);
//	}
//	
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		 System.out.println("Inside Step - navigated to search results");
//		 
//		 driver.getPageSource().contains("Sign In");
//		 driver.close();
//		 driver.quit();
//	}
}
