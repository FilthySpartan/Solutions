package com.qa.seldemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class WebDriverTest {

	@Test
	public void searchForKittensTest() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.get("https://www.bing.com");
		
		//WebElement searchBar = driver.findElement(By.className("sb_form_q"));
		WebElement searchBar = driver.findElement(By.name("q"));     
		searchBar.sendKeys("kittens");
		searchBar.submit();
		
		assertEquals("kittens - Search", driver.getTitle());
		driver.quit();
	}



	@Test
	public void searchForHammersTest() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com");
		
	    WebElement rejectCookies = driver.findElement(By.cssSelector("#W0wltc"));
	    rejectCookies.click();
		
		//WebElement searchBar = driver.findElement(By.className("sb_form_q"));
		WebElement searchBar = driver.findElement(By.name("q"));     
		searchBar.sendKeys("hammers");
		searchBar.submit();
		
		assertEquals("hammers - Google Search", driver.getTitle());
		driver.quit();
	}

	@Test	
	public void navigateAutomateTheBoringStuff() {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.get("https://automatetheboringstuff.com");
		
		WebElement nextChapter = driver.findElement(By.linkText("Introduction"));
		
		nextChapter.click();
		
		
		assertEquals( "AUTOMATE THE BORING STUFF WITH PYTHON", driver.findElement(By.className("h")).getText());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		
		driver.navigate().back();
		
		nextChapter = driver.findElement(By.partialLinkText("Chapter 1"));
		
		nextChapter.click();
		
		assertEquals( "1\nPYTHON BASICS", driver.findElement(By.id("calibre_link-89")).getText());
		
		driver.navigate().back();
		
		nextChapter = driver.findElement(By.partialLinkText("Chapter 2"));
		
		nextChapter.click();
		
		assertEquals( "2\nFLOW CONTROL", driver.findElement(By.id("calibre_link-106")).getText());
				
		driver.quit();
		
	}

	@Test 
	public void swagLabsTest() {
System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.get("https://saucedemo.com");
		
		WebElement usernameInput = driver.findElement(By.id("user-name"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		
		usernameInput.sendKeys("standard_user");
		passwordInput.sendKeys("secret_sauce");
		
		
		loginButton.click();
		
	}

}
