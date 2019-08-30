package webElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Window {

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
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[contains(text(),'Click to open new Window')]")).click();
		Thread.sleep(2000);	
		Set<String> child=driver.getWindowHandles(); 
		System.out.println(child);
		for (String s : child) {
			
			if(!s.equals(parent)){
				driver.switchTo().window(s);
				//System.out.println(driver.getTitle());
			}
			
			
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
			Thread.sleep(2000);
			driver.close();	
			Thread.sleep(2000);	
			driver.switchTo().window(parent);
			Thread.sleep(2000);
			driver.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	}


