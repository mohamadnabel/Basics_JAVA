package javaBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basics {
	WebDriver driver = new ChromeDriver();

	double myNum = 173.5;
	int myNum2 = 10;

	@BeforeTest
	public void dataTybe() {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}

	@Test
	public void myTest() throws InterruptedException {

		WebElement userInput = driver.findElement(By.id("user-name"));
		WebElement passInput = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));

		userInput.sendKeys("standard_user");
		passInput.sendKeys("secret_sauce");
		loginButton.click();

//		String Labels = driver.findElements(By.className("labelTag")).getText();		
		List<WebElement> AddToCard = driver.findElements(By.className("btn"));
		for (int i = 0; i < AddToCard.size(); i++) {

			AddToCard.get(i).click();
			Thread.sleep(1000);
			System.out.println(i);
		}
		WebElement trollyShop = driver.findElement(By.className("shopping_cart_link"));
		trollyShop.click();
		Thread.sleep(1000);
		WebElement checkOut = driver.findElement(By.id("checkout"));
		checkOut.click();
		Thread.sleep(1000);
//		

//		String newVariable = Double.toString(myNum);
//		String newVariabl2 = Double.toString(myNum2);
//
//		driver.findElement(By.id("APjFqb")).sendKeys(newVariable);
//
//		driver.findElement(By.id("APjFqb")).sendKeys(newVariabl2);

	}

}
