package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Part1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
driver.findElementByXPath("//input[@id='yes']").click();
System.out.println("Yes, enjoying the classes");
Boolean unCheck= driver.findElementByXPath("//label[@for='Unchecked']/child::input[@value='0']").isSelected();
Boolean check=driver.findElementByXPath("//label[@for='Checked']/child::input[@value='1']").isSelected();
if(unCheck==true)
{
	System.out.println("Unchecked is the default selected button");
}else if(check==true)System.out.println("Checked is the default selected button");
else System.out.println("There is no default button selected here");
boolean confirm= driver.findElementByXPath("//label[contains(text(),'Select your age group')]/following::input[2]").isSelected();
if(confirm==true)
{
	System.out.println("yes, selected the age group 21 - 40 years");
}
else
{
	driver.findElementByXPath("//label[contains(text(),'Select your age group')]/following::input[1]").clear();
driver.findElementByXPath("//label[contains(text(),'Select your age group')]/following::input[2]").click();
driver.findElementByXPath("//label[contains(text(),'Select your age group')]/following::input[3]").clear();
}
Thread.sleep(4000);
driver.quit();
	}

}
