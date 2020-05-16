package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Spi Global");
		driver.findElementById("createLeadForm_firstName").sendKeys("Manjula");
		driver.findElementById("createLeadForm_lastName").sendKeys("Devi");
		driver.findElementByClassName("smallSubmit").click();






	}



}



