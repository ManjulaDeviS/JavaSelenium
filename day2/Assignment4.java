package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();

driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");


driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();

driver.findElementByXPath("//div[@class='x-panel-header']/following::a[text()='Leads']").click();

driver.findElementByXPath("//li/following::a[text()='Find Leads']").click();

Thread.sleep(2000);
driver.findElementByXPath("//em/following::span[text()='Email']").click();
Thread.sleep(2000);

driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("testleaf@gmail.com");
Thread.sleep(2000);

driver.findElementByXPath("//em/following::button[text()='Find Leads']").click();
Thread.sleep(2000);

String firstLeadName=driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']/descendant::a[@class='linktext']").getText();
System.out.println("First Lead Name: "+firstLeadName);
Thread.sleep(3000);

driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/descendant::a").click();

Thread.sleep(2000);
driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
String str=driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();

System.out.println("Verifying Web Page Title: "+str);
Thread.sleep(2000);

driver.findElementByXPath("//input[@value='Create Lead']").click();
String dupLeadId=driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
if(firstLeadName.equals(dupLeadId))
{ System.out.println("Duplicated lead name is same as the Captured name "+firstLeadName+" "+dupLeadId);
}
else System.out.println("Duplicated lead name differs from the captured name "+firstLeadName+" "+dupLeadId);

Thread.sleep(4000);
driver.quit();
}
	

	}


