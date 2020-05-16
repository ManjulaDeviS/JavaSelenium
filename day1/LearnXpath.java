package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

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

		driver.findElementByXPath("//li/following::a[text()='Create Lead']").click();

		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Spi Global");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Manjula");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Devi");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();


	}

}
