package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement dd1Element = driver.findElement(By.id("dropdown1"));
		Select dd1=new Select(dd1Element);
		dd1.selectByIndex(1);
		WebElement dd2Element = driver.findElement(By.xpath("//select[@name=\"dropdown2\"]"));
		Select dd2=new Select(dd2Element);
		dd2.selectByVisibleText("Selenium");
		WebElement dd3Element = driver.findElement(By.id("dropdown3"));
		Select dd3=new Select(dd3Element);
		dd3.selectByValue("1");
	
		List<WebElement> getno = driver.findElements(By.xpath("//select[@class=\"dropdown\"]/option"));
		
		System.out.println("No of options are" + " " +getno.size());
		driver.findElement(By.xpath("(//option[@value=\"0\"])[5]/parent::select")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//option[text()='Select your programs']/following-sibling::option)[1]")).click();

	}

}
