

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accademy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/MySpace/JavaProjects/Karmicinstitute/Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);



		
		//driver.findElement(By.xpath("//li//div[text()='India']")).click();
		
		
		List<WebElement> ab= driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		for(WebElement option:ab)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
			option.click();
			break;
			
			}
			System.out.println(option.isSelected());
		}
		
	}

}
