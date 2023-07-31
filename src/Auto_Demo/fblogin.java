package Auto_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        driver.findElement(By.id("email")).sendKeys("bhaaav@gmail.com");
        
        
        driver.findElement(By.id("pass")).sendKeys("888qqq");
        
        
        driver.findElement(By.name("login")).click();
	}

}
