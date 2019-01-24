package shopping.website.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoppingSteps {
	
	WebElement element;
	WebDriverWait wait;
	ExtentTest test;
	WebDriver driver;
	LandingPage landingPage;
	AuthenticationPage authenticationPage;
		
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", Constant.FIREFOXDRIVERPATH + Constant.FIREFOXDRIVER);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		test = TestRunner.report.startTest("Test");
	}

	@After
	public void tearDown() {
		driver.quit();
		TestRunner.report.endTest(test);
	}

	
	@Given("^that I am on the sign up page$")
	public void that_I_am_on_the_sign_up_page() {
		driver.get(Constant.URL);
		landingPage = PageFactory.initElements(driver, LandingPage.class);
		test.log(LogStatus.INFO, "Landing page loaded");
		landingPage.goToAuthenticationPage();
		authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
	}

	@When("^put my email \"([^\"]*)\"$")
	public void put_my_email(String email) throws InterruptedException {
	    authenticationPage.inputEmail(email);
	    authenticationPage.submitEmail(wait);
	    Thread.sleep(5000);
	}

	@When("^then I input \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void then_I_input(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9) {
	    authenticationPage.inputFirstName(arg1);
	    
	}

	@Then("^I will create my profile$")
	public void i_will_create_my_profile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
