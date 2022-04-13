package JyotsnaProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBrowser {

	public static void main(String[] args) {
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\harsh\\eclipse-workspace\\LaunchChromeBrowser\\ChromeBrowserJars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.quit();
	}

}
