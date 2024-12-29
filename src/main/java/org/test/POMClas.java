package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClas extends BaseClas {

	public POMClas(){

		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath="(//a[text()='Login'])[1]")
	private WebElement login;


	@FindBy(xpath="//a[text()='Continue']")
	private WebElement rcontinue;



	public WebElement getLogin() {
		return login;
	}

	public WebElement getRcontinue() {
		return rcontinue;
	}


	@FindBy(xpath="//a[@title='My Account']")
	private WebElement account;


	@FindBy(xpath="//a[text()='Register']")
	private WebElement register;

	@FindBy(name="firstname")
	private WebElement firstName;

	@FindBy(name="lastname")
	private WebElement lastname;

	@FindBy(name="email")
	private WebElement email;

	@FindBy(name="telephone")
	private WebElement telephone;


	@FindBy(name="password")
	private WebElement password;


	@FindBy(name="confirm")
	private WebElement confirm;

	@FindBy(name="agree")
	private WebElement TandC;

	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continues;


	@FindBy(xpath="(//a[text()='Logout'])[2]")
	private WebElement logout;

	@FindBy(xpath="//a[text()='Continue']")
	private WebElement aContinue;


	@FindBy(xpath="(//div[@id='content']//h2)[1]")
	private WebElement myAccount;

	@FindBy(xpath="(//input[@value='1'])[2]")
	private WebElement newsLetter;



	@FindBy(xpath="(//div[@class='text-danger'])[1]")
	private WebElement validFirst;

	@FindBy(xpath="(//div[@class='text-danger'])[2]")
	private WebElement validLast;

	@FindBy(xpath="(//div[@class='text-danger'])[3]")
	private WebElement validEmail;


	@FindBy(xpath="(//div[@class='text-danger'])[4]")
	private WebElement validPhone;

	@FindBy(xpath="(//div[@class='text-danger'])[5]")
	private WebElement validPass;
	
	@FindBy(xpath="//div[@class='text-danger']")
	private WebElement incorrectPass;	
	
	
	@FindBy(xpath="(//div[@class='text-danger'])[1]")
	private WebElement incorrectEmail;
	

	public WebElement getIncorrectEmail() {
		return incorrectEmail;
	}

	public WebElement getIncorrectPass() {
		return incorrectPass;
	}


	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement validTandC;

	

	public WebElement getValidFirst() {
		return validFirst;
	}

	public WebElement getValidLast() {
		return validLast;
	}

	public WebElement getValidEmail() {
		return validEmail;
	}

	public WebElement getValidPhone() {
		return validPhone;
	}

	public WebElement getValidPass() {
		return validPass;
	}

	public WebElement getValidTandC() {
		return validTandC;
	}

	public WebElement getNewsLetter() {
		return newsLetter;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getaContinue() {
		return aContinue;
	}

	public WebElement getText() {
		return text;
	}






	@FindBy(xpath="//div[@id='content']")
	private WebElement text;


	public WebElement getAccount() {
		return account;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getTelephone() {
		return telephone;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getTandC() {
		return TandC;
	}

	public WebElement getContinues() {
		return continues;
	}















}
