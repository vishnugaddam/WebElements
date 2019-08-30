package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComputeText {

	public static void main(String[] args) {
		try{
			String path = "drivers/chromedriver.exe";	
			System.setProperty("webdriver.chrome.driver", path); 		
	
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			String url="https://demo.stqatools.com/Autocomplete.php";
			driver.get(url);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("A");
			WebElement el=driver.findElement(By.xpath("//input[@type='text']"));
			//el.sendKeys(Keys.ENTER);
			el.sendKeys(Keys.ARROW_DOWN);
			el.sendKeys(Keys.ENTER);
			
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
