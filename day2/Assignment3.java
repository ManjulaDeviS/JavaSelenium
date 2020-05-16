package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");


		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();

		driver.findElementByXPath("//div[@class='x-panel-header']/following::a[text()='Leads']").click();

		driver.findElementByXPath("//li/following::a[text()='Find Leads']").click();
	
		Thread.sleep(2000);
		driver.findElementByXPath("//em/following::span[text()='Phone']").click();
		Thread.sleep(2000);

		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		Thread.sleep(2000);

		driver.findElementByXPath("//em/following::button[text()='Find Leads']").click();
		Thread.sleep(2000);

		String firstLeadId=driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/descendant::a[@class='linktext']").getText();
		System.out.println("First Lead ID Number: "+firstLeadId);
		Thread.sleep(3000);

		driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/descendant::a").click();

		driver.findElementByXPath("//div/child::a[text()='Delete']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//li/following::a[text()='Find Leads']").click();

		Thread.sleep(2000);

		driver.findElementByXPath("//label[contains(text(),'Lead ID')]/following::input").sendKeys(firstLeadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
Thread.sleep(3000);
String nrtd=driver.findElementByXPath("//div[text()='No records to display']").getText();
System.out.println(nrtd);
Thread.sleep(3000);
driver.quit();

	}

}
