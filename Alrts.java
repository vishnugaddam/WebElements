package webElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alrts {

	public static void main(String[] args) throws InterruptedException {
		try{
		String path = "drivers/chromedriver.exe";	
		//here path is your chrome driver location placed in your project
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String url="https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
		driver.get(url);
		Thread.sleep(5000);
		driver.findElement(By.name("prompt")).click();
		Thread.sleep(2000);
		/*WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.alertIsPresent());*/
		//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		//al.sendKeys("vishnu");		
		//Thread.sleep(5000);
		al.accept();
		Thread.sleep(3000);
		driver.close();
	}catch (Exception e) {
		System.out.println(e);
	}

}}
