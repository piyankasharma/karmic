import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fruits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/MySpace/JavaProject/Fruits/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.get("https://automationstepbystep.com/");

	}

}
