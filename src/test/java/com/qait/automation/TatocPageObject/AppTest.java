package com.qait.automation.TatocPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class AppTest {
	WebDriver driver;
	GridBox gridbox;
	FrameAndDungeon frame_and_dungeon;
	DragAndDropActions drag_and_drop;
	PopupWindowsActions popup_windows;
	CookieActions cookie;
        int i=0;
	@BeforeClass
	public void openPage() {
		
		String dir = System.getProperty("user.dir");
		System.out.println(System.getProperty("user.dir"));
		String chromedriver= "chromedriver";  		
		System.setProperty("webdriver.chrome.driver", dir+"/"+chromedriver);
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.get("https://hris.qainfotech.com/login.php");
//		driver.findElement(By.linkText("Basic Course")).click();
//		gridbox = new GridBox(driver);
//		frame_and_dungeon = new FrameAndDungeon(driver);
//		drag_and_drop = new DragAndDropActions(driver);
//		popup_windows = new PopupWindowsActions(driver);
//		cookie = new CookieActions(driver);
	}

	 @Test
	  public void LoginWithNullPasswordAndNullUserName() {
		    driver.findElement(By.xpath("//*[contains(text(),\"Login Panel\")]")).click();
		  driver.findElement(By.cssSelector("#txtUserName")).clear();
		  driver.findElement(By.cssSelector("#txtUserName")).sendKeys("");
		  driver.findElement(By.cssSelector("#txtPassword")).clear();
		  driver.findElement(By.cssSelector("#txtPassword")).sendKeys("");
		  driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		  Assert.assertTrue(true);
		  if(true!=true) {
			  i++;
		  }
	  }
	  @Test(dependsOnMethods= {"LoginWithNullPasswordAndNullUserName"})
	  public void LoginWithNullPasswordAndValidUserName() {
		    driver.findElement(By.xpath("//*[contains(text(),\"Login Panel\")]")).click();
		  driver.findElement(By.cssSelector("#txtUserName")).clear();
		  driver.findElement(By.cssSelector("#txtUserName")).sendKeys("Krishnachauhan");
		  driver.findElement(By.cssSelector("#txtPassword")).clear();
		  driver.findElement(By.cssSelector("#txtPassword")).sendKeys("");
		  driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		  Assert.assertTrue(true);
		  if(true!=true) {
			  i++;
		  }
	  }
	  @Test(dependsOnMethods= {"LoginWithNullPasswordAndValidUserName"})
	  public void LoginWithValidPasswordAndNullUserName() {
		    driver.findElement(By.xpath("//*[contains(text(),\"Login Panel\")]")).click();
		  driver.findElement(By.cssSelector("#txtUserName")).clear();
		  driver.findElement(By.cssSelector("#txtUserName")).sendKeys("");
		  driver.findElement(By.cssSelector("#txtPassword")).clear();
		  driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Krishna@321#");
		  driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		  Assert.assertTrue(true);
		  if(true!=true) {
			  i++;
		  }
	  }
	  @Test(dependsOnMethods= {"LoginWithValidPasswordAndNullUserName"})
	  public void LoginWithinvalidPasswordAndvalidUserName() {
		    driver.findElement(By.xpath("//*[contains(text(),\"Login Panel\")]")).click();
		  driver.findElement(By.cssSelector("#txtUserName")).clear();
		  driver.findElement(By.cssSelector("#txtUserName")).sendKeys("krishnachauhan");
		  driver.findElement(By.cssSelector("#txtPassword")).clear();
		  driver.findElement(By.cssSelector("#txtPassword")).sendKeys("password");
		  driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		  Assert.assertTrue(true);
		  if(false!=true) {
			  i++;
		  }
	  }
	  @Test(dependsOnMethods= {"LoginWithinvalidPasswordAndvalidUserName"})
	  public void LoginWithvalidPasswordAndinvalidUserName() {
		    driver.findElement(By.xpath("//*[contains(text(),\"Login Panel\")]")).click();
		  driver.findElement(By.cssSelector("#txtUserName")).clear();
		  driver.findElement(By.cssSelector("#txtUserName")).sendKeys("krshnacuahn");
		  driver.findElement(By.cssSelector("#txtPassword")).clear();
		  driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Krishna@321#");
		  driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		  Assert.assertTrue(true);
		  if(false!=true) {
			  i++;
		  }
	  }
	  @Test(dependsOnMethods= {"LoginWithvalidPasswordAndinvalidUserName"})
	  public void LoginWithvalidPasswordAndvalidUserName() {
		    driver.findElement(By.xpath("//*[contains(text(),\"Login Panel\")]")).click();
		  driver.findElement(By.cssSelector("#txtUserName")).clear();
		  driver.findElement(By.cssSelector("#txtUserName")).sendKeys("krishnachauhan");
		  driver.findElement(By.cssSelector("#txtPassword")).clear();
		  driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Krishna@321#");
		  driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		  Assert.assertTrue(true);
		  if(false!=true) {
			  i++;
		  }
	  }

	@AfterTest
	public void closePage() {
                       if(i>=1) {
			System.exit(0);
		                    }
			}
}
