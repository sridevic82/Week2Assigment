package week2.day2;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//div[@for=\"crmsfa\"]/a")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
		driver.findElement(By.xpath("(//img[@alt=\"Lookup\"])[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a)[1]")).click();
		driver.findElement(By.xpath("(//img[@alt=\"Lookup\"])[2]")).click();
		
		driver.findElement(By.xpath("(//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a)[2]")).click();
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		
		

	}

}
