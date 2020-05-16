package week2.day1;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment2Pages {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElementById("email").sendKeys("abc@gmail.com");
		driver.findElementByXPath("//input[@value][1]");
		String ss= driver.findElementByXPath("//input[@value='Append ']").getAttribute("value");
		System.out.println(ss);
		String st="text";
		st=ss.concat(st);
		System.out.println(st);
		driver.findElementByXPath("//input[@value='Append ']").sendKeys(st+Keys.TAB);
		String dt=driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("value");
		System.out.println("Default text is: "+dt);
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		boolean result=driver.findElementByXPath("//label[text()='Confirm that edit field is disabled']/following::input").isEnabled();
		if(result==true)
		{
			System.out.println("field is enabled");
		}
		else					
			System.out.println("field is disabled");
Thread.sleep(4000);
driver.close();
	}


}


