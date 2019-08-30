package webElements;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {

	public static void main(String[] args) {
		try{
			String path = "drivers/chromedriver.exe";	
			System.setProperty("webdriver.chrome.driver", path); 		
	
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			String url="https://demo.stqatools.com/Windows.php";
			driver.get(url);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'Click to open new Tab')]")).click();
			//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
			/*WebElement ele=driver.findElement(By.id("emailId"));
			Thread.sleep(2000);
			ele.sendKeys(Keys.CONTROL);*/
			//Thread.sleep(10000);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		   driver.switchTo().window(tabs2.get(1));
		    Thread.sleep(5000);
		    driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		    Thread.sleep(5000);
		    driver.close();
		    Thread.sleep(2000);
		    driver.switchTo().window(tabs2.get(0));
		    Thread.sleep(2000);
		    driver.close();

	}catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}

}
}