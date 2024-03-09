package javaBasics;

import org.openqa.selenium.JavascriptExecutor;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicsOfJava {
	WebDriver driver = new ChromeDriver();
	String URL = "https://www.jarir.com/login";
	int myPhoneNumber = -123;

	@BeforeTest
	public void testfun() {
//		String myName = "mohammad";
		driver.manage().window().maximize();

//		System.out.println(myName.endsWith("d"));

	}

//	(invocationCount = 2)
	@Test
	public void testFirst() throws InterruptedException {
//		driver.manage().window().fullscreen();
		

		String firstName = "mohammad";
		String lastName = "hussein";

		String domin = "@gmail.com";
		Random rand = new Random();
		int randomID = rand.nextInt(10);
		int randomIdA = rand.nextInt(10);

//		System.out.println(firstName.concat(lastName) + randomID + randomIdA + domin);

		driver.get("https://smartbuy-me.com/smartbuystore/ar/login");
//		Thread.sleep(2000);

		WebElement emailInput = driver.findElement(By.id("register.email"));

		WebElement firstInput = driver.findElement(By.id("register.firstName"));

		WebElement lastInput = driver.findElement(By.id("register.lastName"));

		WebElement genderChoise = driver
				.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[1]/div[1]/div/div/div/button"));

		WebElement gender = driver.findElement(
				By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[1]/div[1]/div/div/div/div/ul/li[3]/a"));
//		Select dropdown = new Select(genderChoise);

		WebElement nickName = driver
				.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[2]/div[1]/div/div/div/button"));

		WebElement nickNam = driver.findElement(
				By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[2]/div[1]/div/div/div/div/ul/li[2]/a"));

		WebElement Biarthday = driver.findElement(By.id("dateOfBirth"));

		WebElement countryCode = driver
				.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[3]/div/div/div/button"));

		WebElement codeForCountry = driver.findElement(
				By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[3]/div/div/div/div/ul/li[114]/a"));

		WebElement phoneNumber = driver.findElement(By.id("mobileNumber"));

		WebElement nationality = driver
				.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[7]/div/div/div/button"));

		WebElement jordanian = driver
				.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[7]/div/div/div/div/ul/li[24]/a"));

		WebElement passwordFirst = driver.findElement(By.id("password"));

		WebElement passwordCheck = driver.findElement(By.id("register.checkPwd"));

		WebElement checkBox = driver.findElement(By.id("termsandconditions"));

		WebElement signupButton = driver
				.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[2]/div[2]/div[2]/button"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
//		dropdown.selectByValue("السيده");

		genderChoise.click();
		Thread.sleep(1000);
		gender.click();
		Thread.sleep(1000);
		firstInput.sendKeys(firstName);
		lastInput.sendKeys(lastName);
		Thread.sleep(1000);

		nickName.click();
		Thread.sleep(1000);

		nickNam.click();
		Biarthday.sendKeys("10/10/2001");
		countryCode.click();
		Thread.sleep(1000);

		codeForCountry.click();
		Thread.sleep(1000);

		phoneNumber.sendKeys("791425288");
		emailInput.sendKeys(firstName.concat(lastName) + randomID + randomIdA + domin);

		nationality.click();
		jordanian.click();
		Thread.sleep(1000);

		passwordFirst.sendKeys("Moh@123456_10");
		Thread.sleep(1000);

		passwordCheck.sendKeys("Moh@123456_10");
		Thread.sleep(1000);
		checkBox.click();
		Thread.sleep(1000);
		signupButton.click();

	}

}
