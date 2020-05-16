package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		String linkAbove=driver.findElementByXPath("//a[text()='Go to Home Page']").getText();
		System.out.println(linkAbove);
		Thread.sleep(3000);

		driver.findElementByXPath("//a[text()='Go to Home Page']").click();
		Thread.sleep(3000);
		driver.get("http://www.leafground.com/pages/Link.html");
		String ss= driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href");
		driver.get(ss);
		Thread.sleep(3000);
		driver.get("http://www.leafground.com/pages/Link.html");
		Thread.sleep(3000);

driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
String str= driver.findElementByXPath("//h1[contains(text(),'Not Found')]").getText();
System.out.println("Error occured as:"+str);
Thread.sleep(3000);
driver.get("http://www.leafground.com/pages/Link.html");
Thread.sleep(3000);

String linkBelow= driver.findElementByXPath("//label[text()='(Interact with same link name)']/preceding-sibling::a[text()='Go to Home Page']").getText();

if(linkAbove.equals(linkBelow))
{
	driver.findElementByXPath("//a[text()='Go to Home Page']").click();
System.out.println("Both the links are same");
}
else {
	System.out.println("Both the links are different");
}
Thread.sleep(3000);

driver.get("http://www.leafground.com/pages/Link.html");
Thread.sleep(3000);

driver.quit();
}
		
		
	}


