package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("firstname")).sendKeys("Gopal");
		driver.findElement(By.name("lastname")).sendKeys("Swamy");
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");

		driver.findElement(By.id("password_step_input")).sendKeys("Surya@123");

		WebElement date1 = driver.findElement(By.name("birthday_day"));
		Select ss = new Select(date1);
		ss.selectByValue("11");

		WebElement month = driver.findElement(By.name("birthday_month"));
		Select mm = new Select(month);
		mm.selectByIndex(6);

		WebElement year = driver.findElement(By.id("year"));
		Select yy = new Select(year);
		yy.selectByVisibleText("1991");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();

	}

}
