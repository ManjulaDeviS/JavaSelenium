package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3ButtonPages  {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.findElementByXPath("//button[text()='Go to Home Page']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("//h5[text()='Button']/following::img").click();
		
		int xPosition = driver.findElementById("position").getLocation().getX();
		int yPosition = driver.findElementById("position").getLocation().getY();

System.out.println("X :" + xPosition + " Y : "+ yPosition);
		

		String color= driver.findElementByXPath("//button[@id='color']").getCssValue("background-color");
System.out.println(color);

WebElement fieldMeasurement = driver.findElementByXPath("//button[text()='What is my size?']");
//Get width of element.
int  width = fieldMeasurement.getSize().getWidth();
System.out.println(width);
//Get height of element.
int height = fieldMeasurement.getSize().getHeight();        
System.out.println(height);
	}

}
