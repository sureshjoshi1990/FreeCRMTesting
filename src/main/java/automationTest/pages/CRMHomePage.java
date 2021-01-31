package automationTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automationTest.base.TestBase;

public class CRMHomePage extends TestBase {
	
	public CRMHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[contains(text(),'Demo User')]")
	WebElement loggedinName;
	@FindBy(xpath="//a[contains(text(),'no company loaded')]")
	WebElement no_company_loaded;
	
	@FindBy(xpath="//a[contains(text(),'Add Boxes»')]")
	WebElement add_Boxes;
	
	@FindBy(xpath="//a[contains(text(),'«Shortlist')]")
	WebElement shortList;

	@FindBy(xpath="//a[contains(text(),'Quick Create»')]")
	WebElement quick_create;
	
	@FindBy(xpath="//a[contains(text(),'Pipeline')]")
	WebElement pipeline;
	@FindBy(xpath="//a[contains(text(),'Timeline')]")
	WebElement timeline;
	@FindBy(xpath="//a[contains(text(),'Alerts')]")
	WebElement alerts ;
	@FindBy(xpath="//a[contains(text(),'Messages')]")
	WebElement messages;
	@FindBy(xpath="//a[contains(text(),'Custom Views')]")
	WebElement customviews;
	@FindBy(xpath="//a[contains(text(),'Schedule Call')]")
	WebElement schedule_call;
	@FindBy(css="#navMenu > ul > li:nth-child(10) > a")
	WebElement call_list;
	@FindBy(css="#navMenu > ul > li:nth-child(11) > a")
	WebElement mail_accounts;
	@FindBy(css="#navMenu > ul > li:nth-child(12) > a")
	WebElement products;
	@FindBy(xpath="//a[contains(text(),'Promotions')]")
	WebElement promotions;
	@FindBy(xpath="//a[contains(text(),'Resources')]")
	WebElement resources;
	@FindBy(xpath="//a[contains(text(),'Knowledge Base')]")
	WebElement knowledge_base;
	@FindBy(xpath="//a[contains(text(),'Team View')]")
	WebElement team_view;
	@FindBy(xpath="//a[contains(text(),'Import')]")
	WebElement imports;
	@FindBy(xpath="//a[contains(text(),'Export')]")
	WebElement exports;
	@FindBy(xpath="//a[contains(text(),'Sales Targets')]")
	WebElement sales_targets;
	@FindBy(xpath="//a[contains(text(),'Preferences')]")
	WebElement preferences;
	@FindBy(xpath="//a[contains(text(),'Audit Trail')]")
	WebElement audit_trail;
	@FindBy(xpath="//a[contains(text(),'Blog')]")
	WebElement blog;
	@FindBy(xpath="//a[contains(text(),'Calendar')]")
	WebElement calendar;
	@FindBy(xpath="//a[contains(text(),'Companies')]")
	WebElement crm_companies;
	

	public String verifyCRMHomePageTitleName()
	{
		return driver.getTitle();
	}
	
	public String verifyLoggedinName()
	{
		driver.switchTo().frame("mainpanel");
		
		return loggedinName.getText();
	}
	
	public Left_Side_Nave_No_Company_Loaded verifyLeft_Side_NAV_NO_Company_Loaded()
	{
		driver.switchTo().frame("mainpanel");
		System.out.println("verifyLeft_Side_NAV_NO_Company_Loaded method....");
		no_company_loaded.click();
		return new Left_Side_Nave_No_Company_Loaded();
	}
	
	public Add_Boxes verifyLeft_Side_NAV_Add_Boxes()
	{
		driver.switchTo().frame("mainpanel");
		add_Boxes.click();
		return new Add_Boxes();
	}
	
	public ShortList verifyLeft_Side_NAV_Shortlist()
	{
		driver.switchTo().frame("mainpanel");
		shortList.click();
		return new ShortList();
	}
	
	public CRM_Quik_Create verifyLeft_Side_NAV_quick_create()
	{
		driver.switchTo().frame("mainpanel");
		quick_create.click();
		return new CRM_Quik_Create();
	}
	
	public CRM_Pipeline verifyLeft_Side_NAV_pipeline()
	{
		driver.switchTo().frame("mainpanel");
		pipeline.click();
		return new CRM_Pipeline();
	}
	
	public CRM_Timeline verifyLeft_Side_NAV_timeline()
	{
		driver.switchTo().frame("mainpanel");
		timeline.click();
		return new CRM_Timeline();
	}
	public CRM_Alerts verifyLeft_Side_NAV_alerts()
	{
		driver.switchTo().frame("mainpanel");
		alerts.click();
		return new CRM_Alerts();
	}
	public ShortList verifyLeft_Side_NAV_messages()
	{
		driver.switchTo().frame("mainpanel");
		messages.click();
		return new ShortList();
	}
	
	public Custom_Views verifyLeft_Side_NAV_customviews()
	{
		driver.switchTo().frame("mainpanel");
		customviews.click();
		return new Custom_Views();
	}
	
	public Schedule_Call verifyLeft_Side_NAV_schedule_call()
	{
		driver.switchTo().frame("mainpanel");
		schedule_call.click();
		return new Schedule_Call();
	}
	
	public Call_Lists verifyLeft_Side_NAV_call_list()
	{
		driver.switchTo().frame("mainpanel");
		call_list.click();
		return new Call_Lists();
	}
	
	public Mail_Accounts verifyLeft_Side_NAV_mail_accounts()
	{
		driver.switchTo().frame("mainpanel");
		System.out.println("Going to click...");
		mail_accounts.click();
		System.out.println("Clicked has been Done...");
		
		return new Mail_Accounts();
	}
	
	public CRM_Products verifyLeft_Side_NAV_products()
	{
		driver.switchTo().frame("mainpanel");
		products.click();
		return new CRM_Products();
	}
	
	public Promotions verifyLeft_Side_NAV_promotions()
	{
		driver.switchTo().frame("mainpanel");
		promotions.click();
		return new Promotions();
	}
	
	public CRM_Resources verifyLeft_Side_NAV_resources()
	{
		driver.switchTo().frame("mainpanel");
		resources.click();
		return new CRM_Resources();
	}
	
	public Knowledge_Base verifyLeft_Side_NAV_knowledge_base()
	{
		driver.switchTo().frame("mainpanel");
		knowledge_base.click();
		return new Knowledge_Base();
	}
	
	public Team_View verifyLeft_Side_NAV_team_view()
	{
		driver.switchTo().frame("mainpanel");
		team_view.click();
		return new Team_View();
	}
	
	public CRM_Imports verifyLeft_Side_NAV_imports()
	{
		driver.switchTo().frame("mainpanel");
		imports.click();
		return new CRM_Imports();
	}
	
	public CRM_Export verifyLeft_Side_NAV_exports()
	{
		driver.switchTo().frame("mainpanel");
		exports.click();
		return new CRM_Export();
	}
	
	public Salaes_Target verifyLeft_Side_NAV_sales_targets()
	{
		driver.switchTo().frame("mainpanel");
		sales_targets.click();
		return new Salaes_Target();
	}
	
	public CRM_Preferences verifyLeft_Side_NAV_preferences()
	{
		driver.switchTo().frame("mainpanel");
		preferences.click();
		return new CRM_Preferences();
	}
	
	public ShortList verifyLeft_Side_NAV_audit_trail()
	{
		driver.switchTo().frame("mainpanel");
		audit_trail.click();
		return new Audit_Trail();
	}
	
	
	public Blog verifyLeft_Side_NAV_Blog()
	{
		driver.switchTo().frame("mainpanel");
		blog.click();
		return new Blog();
	}
	
	public CRM_Calender verifyLeft_Side_NAV_calendar()
	{
		driver.switchTo().frame("mainpanel");
		calendar.click();
		return new CRM_Calender();
	}
	
	public CRM_Companies crm_companies()
	{
		driver.switchTo().frame("mainpanel");
		crm_companies.click();
		return new CRM_Companies();
	}
	
}
