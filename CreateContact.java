package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("George");
		driver.findElement(By.id("lastNameField")).sendKeys("Bush");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Barak");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Obama");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createContactForm_description")).sendKeys("New Contact Added");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Arun@gmail.com");

		WebElement state1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select s1 = new Select(state1);
		s1.selectByVisibleText("Indiana");

		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.partialLinkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Hello All");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("The Title of the Page :" + driver.getTitle());

	}

}
