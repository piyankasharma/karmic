import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:/MySpace/JavaProject/Admission/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.get("https://automationstepbystep.com/");
		
	}

}
