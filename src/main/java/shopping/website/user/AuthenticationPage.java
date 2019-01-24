package shopping.website.user;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPage {
	
	@FindBy(id = "email_create")
	private WebElement emailInput;
	
	@FindBy(id = "SubmitCreate")
	private WebElement submitEmail;
	
	@FindBy(id = "uniform-id_gender1")
	private WebElement maleButton;
	
	@FindBy(id = "uniform-id_gender2")
	private WebElement femaleButton;
	
	@FindBy(id = "customer_firstname")
	private WebElement firstNameInput;
	
	@FindBy(id = "customer_lastname")
	private WebElement lastNameInput;
	
	@FindBy(id = "passwd")
	private WebElement passwordInput;
	
	@FindBy(id = "days")
	private WebElement dayInput;
	
	@FindBy(id = "months")
	private WebElement monthInput;
	
	@FindBy(id = "years")
	private WebElement yearInput;
	
	@FindBy(id = "address1")
	private WebElement addressInput;
	
	@FindBy(id = "city")
	private WebElement cityInput;
	
	@FindBy(id = "id_state")
	private WebElement stateInput;
	
	@FindBy(id = "postcode")
	private WebElement zipInput;
	
	@FindBy(id = "phone_mobile")
	private WebElement phoneInput;
	
	@FindBy(id = "submitAccount")
	private WebElement submitButton;
	
	public void inputEmail(String email) {
		emailInput.sendKeys(email);
	}
	
	public void submitEmail(WebDriverWait wait) {
		submitEmail = wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitCreate")));
		submitEmail.click();
	}
	
	public void selectTitle(String title) {
		if (title.equals("Mr.")) {
			maleButton.click();
		} else {
			femaleButton.click();
		}
	}
	
	public void inputFirstName(String firstName) {
		firstNameInput.sendKeys(firstName);
	}
	
	public void inputLastName(String lastName) {
		lastNameInput.sendKeys(lastName);
	}
	
	public void inputPassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	public void inputBirthday(String birthday) {
		String[] birthdayArray = birthday.split("\\s+");
		dayInput.sendKeys(birthdayArray[0]);
		monthInput.sendKeys(birthdayArray[1]);
		yearInput.sendKeys(birthdayArray[2]);
	}

	public void inputAddress(String address) {
		addressInput.sendKeys(address);
	}
	
	public void inputCity(String city) {
		cityInput.sendKeys(city);
	}
	
	public void inputState(String state) {
		stateInput.sendKeys(state, Keys.ENTER);
	}
	
	public void inputZip(String zip) {
		zipInput.sendKeys(zip);
	}
	
	public void inputPhone(String phoneNumber) {
		phoneInput.sendKeys(phoneNumber);
	}
	
	public void registerAccount() {
		submitButton.click();
	}
	
	
	
	

}
