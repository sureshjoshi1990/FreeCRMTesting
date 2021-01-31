package automationTest.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationTest.base.TestBase;
import automationTest.pages.CRMHomePage;
import automationTest.pages.Left_Side_Nave_No_Company_Loaded;
import automationTest.pages.SignInPage;
import automationTest.util.TestUtil;


public class HomePageTest extends TestBase{
TestUtil testUtil;
SignInPage signInPage;
CRMHomePage crmHomePage;
	public HomePageTest()
	{
	super();	
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		signInPage=new SignInPage();
		crmHomePage= new CRMHomePage();
		testUtil=new TestUtil();
		signInPage.logInPage(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	@Test
	public void verifyCRMHomePageTitleNameTest() {
		String titleName = crmHomePage.verifyCRMHomePageTitleName();
		Assert.assertEquals(titleName, "CRMPRO");
	}
	
	@Test
	public void verifyLoggedInName() {
		String loginName = crmHomePage.verifyLoggedinName();
		Assert.assertEquals(loginName, "  User: Demo User");
	}
	
	@Test
	public void verifyLeft_Side_NAV_NO_Company_Loaded_Test() {
		crmHomePage.verifyLeft_Side_NAV_NO_Company_Loaded();	
	}
	
	@Test
	public void verifyLeft_Side_NAV_add_Boxes() {
		crmHomePage.verifyLeft_Side_NAV_Add_Boxes();	
	}
	
	@Test
	public void verifyLeft_Side_NAV_Short_List() {
		crmHomePage.verifyLeft_Side_NAV_Shortlist();
	}
	@Test
	public void verifyLeft_Side_NAV_quick_create() {
		crmHomePage.verifyLeft_Side_NAV_quick_create();
	}
	
	@Test
	public void verifyLeft_Side_NAV_pipeline() {
		crmHomePage.verifyLeft_Side_NAV_pipeline();
	}
	
	@Test
	public void verifyLeft_Side_NAV_timeline() {
		crmHomePage.verifyLeft_Side_NAV_timeline();
	}
	
	@Test
	public void verifyLeft_Side_NAV_quick_alerts() {
		crmHomePage.verifyLeft_Side_NAV_alerts();
	}
	
	@Test
	public void verifyLeft_Side_NAV_messages() {
		crmHomePage.verifyLeft_Side_NAV_messages();
	}
	
	@Test
	public void verifyLeft_Side_NAV_customviews() {
		crmHomePage.verifyLeft_Side_NAV_customviews();
	}
	
	@Test
	public void verifyLeft_Side_NAV_schedule_call() {
		crmHomePage.verifyLeft_Side_NAV_schedule_call();
	}
	
	@Test
	public void verifyLeft_Side_NAV_call_list() {
		crmHomePage.verifyLeft_Side_NAV_call_list();
	}
	
	@Test
	public void verifyLeft_Side_NAV_mail_accounts() {
		crmHomePage.verifyLeft_Side_NAV_mail_accounts();
	}
	
	@Test
	public void verifyLeft_Side_NAV_products() {
		crmHomePage.verifyLeft_Side_NAV_products();
	}
	
	@Test
	public void verifyLeft_Side_NAV_promotions() {
		crmHomePage.verifyLeft_Side_NAV_promotions();
	}
	
	@Test
	public void verifyLeft_Side_NAV_resources() {
		crmHomePage.verifyLeft_Side_NAV_resources();
	}
	
	@Test
	public void verifyLeft_Side_NAV_knowledge_base() {
		crmHomePage.verifyLeft_Side_NAV_knowledge_base();
	}
	
	@Test
	public void verifyLeft_Side_NAV_team_view() {
		crmHomePage.verifyLeft_Side_NAV_team_view();
	}
	
	@Test
	public void verifyLeft_Side_NAV_imports() {
		crmHomePage.verifyLeft_Side_NAV_imports();
	}
	
	@Test
	public void verifyLeft_Side_NAV_exports() {
		crmHomePage.verifyLeft_Side_NAV_exports();
	}
	
	@Test
	public void verifyLeft_Side_NAV_sales_targets() {
		crmHomePage.verifyLeft_Side_NAV_sales_targets();
	}
	
	@Test
	public void verifyLeft_Side_NAV_preferences() {
		crmHomePage.verifyLeft_Side_NAV_preferences();
	}
	
	@Test
	public void verifyLeft_Side_NAV_audit_trail() {
		crmHomePage.verifyLeft_Side_NAV_audit_trail();
	}
	
	@Test
	public void verifyLeft_Side_NAV_Blog() {
		crmHomePage.verifyLeft_Side_NAV_Blog();
	}
	
	@Test
	public void verifyLeft_Side_NAV_calendar() {
		crmHomePage.verifyLeft_Side_NAV_calendar();
	}
	
	@Test
	public void verify_crm_companies_Test()
	{
		crmHomePage.crm_companies();
	}
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
