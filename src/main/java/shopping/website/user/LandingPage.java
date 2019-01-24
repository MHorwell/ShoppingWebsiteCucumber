package shopping.website.user;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
	private WebElement signInButton;
	
	public void goToAuthenticationPage() {
		signInButton.click();
	}

}
