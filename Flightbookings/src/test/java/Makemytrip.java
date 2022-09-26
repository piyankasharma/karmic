import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Makemytrip {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:/MySpace/JavaProjects/Flightbookings/Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
   //driver.findElement(By.xpath("//input[@value='radio1']")).click();
    //driver.findElement(By.xpath("(//div//input[@value='radio2'])")).click();
	//driver.findElement(By.xpath("(//div//input[@value='radio3'])")).click();
	//driver.findElement(By.xpath("//fieldset//input[@id='checkBoxOption1']")).click();
	
	driver.findElement(By.xpath("//fieldset//input[@id='checkBoxOption2']")).click();
	driver.findElement(By.xpath("//fieldset//input[@id='checkBoxOption3']")).click();
	//static dropdown  handling
	Select obj=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
	obj.selectByVisibleText("Option1");
	
			
	
    
  
	
	}

}
