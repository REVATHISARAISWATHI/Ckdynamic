package dynamic_new;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestseleTest {
	
	
  @Test
  public static void guru99tutorials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("window-size=1024,768");
        options.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://18.216.237.31:8000/deploy/");
   driver.manage().window().maximize();
		Thread.sleep(2000);
			
   
      WebElement dropdown = driver.findElement(By.name("Currency"));
      dropdown.findElement(By.xpath("//option[. = 'Dollar']")).click();
    driver.findElement(By.name("num")).sendKeys("10");
    driver.findElement(By.name("bookButton")).click();
   /* driver.findElement(By.cssSelector("input:nth-child(2)")).click();
    driver.findElement(By.name("Currency")).click();
    {
      WebElement dropdown = driver.findElement(By.name("Currency"));
      dropdown.findElement(By.xpath("//option[. = 'Euro']")).click();
    }
    driver.findElement(By.name("Currency")).click();
    driver.findElement(By.name("num")).sendKeys("10");
    driver.findElement(By.name("bookButton")).click();
    driver.findElement(By.name("Currency")).click();
    driver.findElement(By.cssSelector("input:nth-child(2)")).click();
    driver.findElement(By.name("Currency")).click();
    {
      WebElement dropdown = driver.findElement(By.name("Currency"));
      dropdown.findElement(By.xpath("//option[. = 'Riyal']")).click();
    }
    driver.findElement(By.name("Currency")).click();
    driver.findElement(By.name("num")).sendKeys("10");
    driver.findElement(By.name("bookButton")).click();
    driver.close();
  } */

		String h= driver.getTitle();
		String e= "Currency Convertor";
		
		if(h.equalsIgnoreCase(e)) {
			System.out.println("Success");
		}
		else{
			System.out.println("Failure");
		}
		driver.close();
	}
}
