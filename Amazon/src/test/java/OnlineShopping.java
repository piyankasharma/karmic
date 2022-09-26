import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OnlineShopping {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/MySpace/JavaProjects/Amazon/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions obj=new Actions(driver);
		obj.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).contextClick().build().perform();
        
	}

}
