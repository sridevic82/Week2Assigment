package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindOpportunities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Opportunities")).click();
		driver.findElement(By.xpath("//a[text()='Find Opportunities']")).click();
		List<WebElement> column = driver.findElements(By.xpath("//div[@class=\"x-grid3-cell-inner x-grid3-col-salesOpportunityId\"]/a"));
		System.out.println("The opportunities id are");
		for (WebElement webElement : column) {
			
			System.out.println(webElement.getText());
			
		}

			String title = driver.getTitle();
			if(title.equals("Find Opportunities | opentaps CRM")) {
				System.out.println("Title is verified as: "+" " + title );
			}

			
			
			
		}
		

	}


