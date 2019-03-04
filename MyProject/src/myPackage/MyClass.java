package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {

	public static void main(String[] args) {
		//gecko es el driver de Firefox, https://github.com/mozilla/geckodriver/releases
		System.setProperty("webdriver.gecko.driver", "C:/Users/Academy QE/Downloads/geckodriver-v0.24.0-win64/geckodriver.exe");
		
		
		//Create a new instance of Firefox Browser
		WebDriver driver = new FirefoxDriver();
		
		
		//Maximize the Browser window
		driver.manage().window().maximize();

		//Open URL in Firefox browser
		driver.get("https://www.google.com/");
		
		//Get the current page URL and store the value in the console
		String str = driver.getCurrentUrl();
		//print the value of variable in the console
		System.out.println("The current URL is " + str);
		
		//Chrome
		/*System.setProperty("webdriver.chrome.drive", "C:/Users/Academy QE/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.get("https://www.google.com/");
		
		String strChrome = driverChrome.getCurrentUrl();
		System.out.println("The current URL is " + strChrome);
		*/
	}

}
