import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/MySpace/JavaProjects/Project1/Drivers/chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.get("https://automationstepbystep.com/");

	}

}
