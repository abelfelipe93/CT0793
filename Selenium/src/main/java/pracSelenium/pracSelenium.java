package pracSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "./drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		

	}

}
