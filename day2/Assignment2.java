package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

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
		driver.findElementByXPath("//div/following::input[@name='firstName'][3]").sendKeys("sathiya");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//td/following::a[text()='sathiya'][1]").click();
		String titlePage =driver.findElementById("sectionHeaderTitle_leads").getText();
		System.out.println(titlePage);
		driver.findElementByXPath("//div/a[text()='Edit'][1]").click();
		driver.findElementByXPath("//td/input[@name='companyName']").clear();
		Thread.sleep(2000);
		driver.findElementByXPath("//td/input[@name='companyName']").sendKeys("xyz ltd");
		Thread.sleep(2000);
		driver.findElementByXPath("//td/input[@class='smallSubmit'][1]").click();
		Thread.sleep(4000);
		String actualName=driver.findElementById("viewLead_companyName_sp").getText();
		String expectName="xyz ltd";
		if(actualName.equals(expectName))
		{
			System.out.println("Company name: Payapal"+actualName);
		}
		else 

			System.out.println("Company name changed to: "+expectName);
		Thread.sleep(3000);

		driver.quit();

	}

}
