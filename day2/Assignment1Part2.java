package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Part2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		boolean q1=driver.findElementByXPath("//label[text()='Select the languages that you know?']").isDisplayed();
		System.out.println("Q1 is displayed "+q1);
		
		driver.findElementByXPath("//input[@type='checkbox'][1]").click();
		System.out.println("Selected Java");
		
		boolean q2=driver.findElementByXPath("//label[text()='Confirm Selenium is checked']").isDisplayed();
		System.out.println("Q2 is displayed "+q2);
		
		boolean confirm=driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input[@type='checkbox']").isSelected();
		System.out.println("Selenium checkbox is enabled "+confirm);
		
		boolean q3=driver.findElementByXPath("//label[text()='DeSelect only checked']").isDisplayed();
		System.out.println("Q3 is displayed "+q3);
		boolean q3O1=driver.findElementByXPath("//label[text()='DeSelect only checked']/following::input[1]").isSelected();
		boolean q3O2=driver.findElementByXPath("//label[text()='DeSelect only checked']/following::input[2]").isSelected();
		if(q3O1==true)
		{
			driver.findElementByXPath("//label[text()='DeSelect only checked']/following::input[1]").click();
			System.out.println("Option1 of Q3 is unchecked");
		}
		else {
			System.out.println("Option1 of Q3 already remains unchecked");
		}
		if(q3O2==true)
		{
			driver.findElementByXPath("//label[text()='DeSelect only checked']/following::input[2]").click();
			System.out.println("Option2 of Q3 is unchecked");
		}	else {
			System.out.println("Option2 of Q3 already remains unchecked");
		}
		boolean q4=driver.findElementByXPath("//label[text()='Select all below checkboxes ']").isDisplayed();
		System.out.println("Q4 is displayed "+q4);
driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input[1]").click();
driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input[2]").click();
driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input[3]").click();
driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input[4]").click();
driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input[5]").click();
System.out.println("All five options of Q4 are selected");

Thread.sleep(5000);
driver.quit();
	}

}


