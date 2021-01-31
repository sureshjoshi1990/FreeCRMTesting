package automationTest.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automationTest.base.TestBase;
import automationTest.pages.CRMHomePage;
import automationTest.pages.SignInPage;


public class LoginPageTest extends TestBase {
	
	SignInPage signIn;
	CRMHomePage gmailHomePage;
	
	public LoginPageTest() {	
		super();
		
		
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		signIn=new SignInPage();
	}
	
	
	@Test (priority = 1)
	public void verifyTitleNameTest()
	{
		String titleName = signIn.verifyTitlePage();
		Assert.assertEquals(titleName, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test (priority = 2)
	
	public void virifyLogoTest()
	{
		signIn.verifyLogo();
	}
	@Test (priority = 3)
	public void loginTest()
	{
		
		signIn.logInPage(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
