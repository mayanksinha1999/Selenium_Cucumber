package StepDefenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;

public class LoginDemoSteps_PF {
	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("-------I am inside the LoginDemoSteps_PF class----------");
		System.out.println("Inside Step - browser is open");
		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		   
		   driver=new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
	   
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		
		login =new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
//	   driver.findElement(By.id("name")).sendKeys(username);
//	   driver.findElement(By.id("password")).sendKeys(password);
	   Thread.sleep(2000);
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		
		login.clickOnLogin();
	   driver.findElement(By.id("login")).click();
	   
	}


	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		
		home.checkLogOutIsDisplayed();
//	   driver.findElement(By.id("logout")).isDisplayed();
//	   Thread.sleep(2000);
	   
	   driver.close();
	   driver.quit();
	}
}
