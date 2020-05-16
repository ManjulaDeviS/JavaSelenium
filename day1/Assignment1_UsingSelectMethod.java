package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1_UsingSelectMethod {

	public static void main(String[] args) throws InterruptedException
	{
		//setup the path of Chrome webdriver
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
//launch Application
driver.get("http://leaftaps.com/opentaps/control/login");
//Maximize web page
driver.manage().window().maximize();
driver.findElementById("username").sendKeys("demosalesmanager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Leads").click();
driver.findElementByLinkText("Create Lead").click();
driver.findElementById("createLeadForm_companyName").sendKeys("XYZ Pvt Ltd");
driver.findElementById("createLeadForm_firstName").sendKeys("Manju");
driver.findElementById("createLeadForm_lastName").sendKeys("S");;
WebElement dropdown= driver.findElementById("createLeadForm_dataSourceId");
Select option=new Select(dropdown);
option.selectByVisibleText("Employee");
WebElement dropdown1=driver.findElementById("createLeadForm_marketingCampaignId");
Select option1=new Select(dropdown1);
option1.selectByValue("9001");

WebElement ownership=driver.findElementById("createLeadForm_ownershipEnumId");
Select dd=new Select(ownership);
dd.selectByIndex(5);

WebElement dropdown2=driver.findElementById("createLeadForm_generalCountryGeoId");
Select option2= new Select(dropdown2);
option2.selectByVisibleText("India");


driver.findElementByClassName("smallSubmit").click();
Thread.sleep(4000);


//Get titleName of WebPage
driver.get("http://leaftaps.com/crmsfa/control/createLeadForm");
String titleName=driver.getTitle();
System.out.println(titleName);


driver.quit();

	}

}
