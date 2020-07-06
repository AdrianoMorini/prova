package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BTest {

	public String testConversion() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adria\\Universita\\ISPW\\PROGETTO\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
    
		driver.get("https://coinyep.com/it/ex/BTC-EUR");
		driver.findElement(By.xpath("//*[@id=\"coinyep-input1\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"coinyep-input1\"]")).sendKeys("0.20");
		WebElement d = driver.findElement(By.xpath("//*[@id=\"coinyep-input2\"]"));
		
		driver.close();
		String s = d.getText();

		return s;
	}
	
	
}
