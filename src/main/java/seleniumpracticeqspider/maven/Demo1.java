package seleniumpracticeqspider.maven;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[]args){
		//System.setProperty("webdriver.chrome.driver","/Users/abhishekotta/Documents/selenium/chromedriver");
		System.setProperty("webdriver.chrome.driver","/Users/abhishekotta/Documents/workspaceSelenium/Selenium/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
		
	}

}
