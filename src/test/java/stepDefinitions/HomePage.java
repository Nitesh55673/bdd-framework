package stepDefinitions;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import library.BasePage;
import library.PropertiesReader;
import pageObjects.HomePageObject;




public class HomePage {
	
	
	
		
	
	public static WebDriver driver;
	 public PropertiesReader pro;
	 public HomePageObject homepageobject;
	
	
	@io.cucumber.java.en.Given("^The user launches the application$")
	public void the_user_launches_the_application() {
		pro = new PropertiesReader();
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(pro.getData("url"));
		//driver.get("https//www.amazon.com");
		//driver.navigate().to("https://www.amazon.com");
		//driver.navigate().to(pro.getData("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		}
	@io.cucumber.java.en.Then("^The user closes the browser$")
	public void the_user_closes_the_browser() {
		driver.quit();
		
	}
	@io.cucumber.java.en.When("^The user searches an item \"([^\"]*)\"$")
	public void the_user_searches_an_item(String item) throws InterruptedException {
		homepageobject = new HomePageObject(driver);
		//WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		homepageobject.search.sendKeys(item);
		homepageobject.search.sendKeys(Keys.ENTER);
	//	Thread.sleep(5000);
		
	}
	
	
		

	

}






