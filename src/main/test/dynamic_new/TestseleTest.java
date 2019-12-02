import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
public class AppTest {
	
	
  @Test
  public static void guru99tutorials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		        "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
        /*options.addArguments("--no-sandbox"); //Bypass OS security model   
        options.addArguments("--start-maximized");
        options.addArguments("--disable-dev-shm-usage");*/
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("window-size=1024,768");
        options.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver(options);
		/*options.addArguments("--headless");
		options.addArguments("--no-sandbox");
		options.addArguments("--no-sandbox"); //Bypass OS security model
        options.addArguments("--disable-web-security");
        options.addArguments("--ignore-urlfetcher-cert-requests");
        //options.addArguments("--disable-renderer-backgrounding");
        options.addArguments("--disable-infobars"); //Disabling infobars
        //options.addArguments("--start-maximized"); //Open Browser in maximized mode
        options.addArguments("--disable-dev-shm-usage"); //Overcome limited resource problem
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--log-level=3"); // set log level
        options.addArguments("--silent");
        options.addArguments("--disable-gpu");
        //options.addArguments("window-size=1920,1080");
        
        WebDriver driver = new ChromeDriver(options);
        */
		driver.get("http://18.216.237.31:8000/BMI/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("weight")).sendKeys("61");
		driver.findElement(By.name("height")).sendKeys("1.75");
		driver.findElement(By.name("submit")).click();

		String h= driver.getTitle();
		String e= "BMI Calculator";
		
		if(h.equalsIgnoreCase(e)) {
			System.out.println("Success");
		}
		else{
			System.out.println("Failure");
		}
		driver.close();
		/*WebDriver driver = new ChromeDriver();
        String eTitle = "Meet Guru99";
        String aTitle = "";
        driver.get("http://www.guru99.com/");
        driver.manage().window().maximize();
        aTitle = driver.getTitle(); 
        if (aTitle.contentEquals(eTitle)){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }        
        driver.close();
		*/
	}
}

