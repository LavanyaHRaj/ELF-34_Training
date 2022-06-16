package POm_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public void registerPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@value='M']")
	private WebElement maleGender;
	public void maleGenderButton() {
		maleGender.click();
	}
	
	@FindBy(xpath = "//input[@value='F']")
	private WebElement femaleGender;
	
	public void femaleGenderButton() {
		femaleGender.click();
	}
	
	@FindBy(xpath = "//input[@name='FirstName']")
	private WebElement firstName;
	public void firstNameSendKeys(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	@FindBy(xpath = "//input[@name='LastName']")
	private WebElement lastName;
	public void lastNameSendKeys(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	@FindBy(xpath = "//input[@name='Email']")
	private WebElement Email;
	public void emailSendKeys(String email) {
		Email.sendKeys(email);
	}
	
	@FindBy(xpath = "//input[@name='Password']")
	private WebElement Password;
	public void passwordSendKeys(String password) {
		Password.sendKeys(password);
	}
	
	@FindBy(xpath = "//input[@name='ConfirmPassword']")
	private WebElement confirmPassword;
	public void confirmPasswordSendKeys(String confirmpwd) {
		confirmPassword.sendKeys(confirmpwd);
	}
	
	@FindBy(xpath = "//input[@name='register-button']")
	private WebElement registerButton;
	public void registerButtonClick() {
		registerButton.click();
	
	}
	public WebElement getMaleGender() {
		return maleGender;
	}
	public WebElement getFemaleGender() {
		return femaleGender;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public void setMaleGender(WebElement maleGender) {
		this.maleGender = maleGender;
	}
	public void setFemaleGender(WebElement femaleGender) {
		this.femaleGender = femaleGender;
	}
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	public void setEmail(WebElement email) {
		Email = email;
	}
	public void setPassword(WebElement password) {
		Password = password;
	}
	public void setConfirmPassword(WebElement confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}
}
