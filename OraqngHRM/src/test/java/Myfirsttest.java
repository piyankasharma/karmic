import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myfirsttest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\MySpace\JavaProjects\OraqngHRM\Drivers\chromedriver.exe");
	
	  
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	 
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
		

	}

}
