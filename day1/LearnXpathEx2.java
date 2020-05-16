package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathEx2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");


		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();

		driver.findElementByXPath("//div[@class='x-panel-header']/following::a[text()='Leads']").click();

		driver.findElementByXPath("//li/following::a[text()='Find Leads']").click();
		
		//Finding FirstLeadID
		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/child::a").click();
			}

}
