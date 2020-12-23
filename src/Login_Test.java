import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Login_Test {
	
public void Login (String[] args) throws InterruptedException {
		
	
		//needed at the start. initlises the driver and where to find the executables
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqib\\Desktop\\Java\\driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/basic_auth']")).click();
		
//		String url = driver.getCurrentUrl();
		
		//wait 2 seconds
		Thread.sleep(2000);
		
		//correct username, incorrect password
		driver.get("http://admin:admin_false@the-internet.herokuapp.com/basic_auth");
		
		//wait 2 seconds
		Thread.sleep(2000);
		
		//incorrect username, correct password
		driver.get("http://admin_false:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		
		//correct username, correct password
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		
		
		driver.quit();
		

	}


public void Scroll(String[] args) throws InterruptedException {
	
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://the-internet.herokuapp.com/");
	
	driver.findElement(By.xpath("//a[@href='/infinite_scroll']")).click();
	
	//required for scrolling
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Thread.sleep(200);
	
//	first scroll
	jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	Thread.sleep(1000);
	
//	second scroll
	jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	Thread.sleep(1000);
	
	//scroll to the top
	jse.executeScript("window.scrollTo(0,0)");
	Thread.sleep(1000);
	
	
//	String actualString = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
//	assertTrue(actualString.contains("specific text"));
	

	driver.quit();
	
	
	

}
	

public void KeyPress(String[] args) throws InterruptedException {
	
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://the-internet.herokuapp.com/");
	
	driver.findElement(By.xpath("//a[@href='/infinite_scroll']")).click();
	Thread.sleep(2000);
	
driver.get("http://the-internet.herokuapp.com/");
	
	driver.findElement(By.xpath("//a[@href='/horizontal_slider']")).click();
	Thread.sleep(2000);
	
driver.get("http://the-internet.herokuapp.com/");
	
	driver.findElement(By.xpath("//a[@href='/entry_ad']")).click();
	Thread.sleep(2000);
	
driver.get("http://the-internet.herokuapp.com/");
	
	driver.findElement(By.xpath("//a[@href='/frames']")).click();
	Thread.sleep(2000);
	
	driver.quit();
	

}
	
	


	public static void main(String[] args) throws InterruptedException {
		
		Login_Test obj= new Login_Test();
		
		obj.Login(args);
		
		obj.Scroll(args);
		
		obj.KeyPress(args);
		
	}


}
