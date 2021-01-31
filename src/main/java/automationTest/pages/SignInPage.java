package automationTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationTest.base.TestBase;

public class SignInPage extends TestBase {

	// @ Page Factory Design Method

	@FindBy(name = "username")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBTN;
	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement crmLogo;

	public SignInPage() {

		PageFactory.initElements(driver, this);

	}

	public String verifyTitlePage() {
		return driver.getTitle();
	}

	public void verifyLogo() {
		crmLogo.isDisplayed();
	}

	public CRMHomePage logInPage(String un, String pwd)  {

		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBTN.click();
		return new CRMHomePage();
	}

}
