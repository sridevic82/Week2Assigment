package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sri");
		driver.findElement(By.id("lastNameField")).sendKeys("Devi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sri");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Devi");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Sri contact is created");
		WebElement option = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select choose=new Select(option);
		choose.selectByVisibleText("Arkansas");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Sridevic82@gmail.com");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("created on 22/3");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println("The title of resulting page is"+ title);
		
	
		
		
		
		


		
		

	}

}
