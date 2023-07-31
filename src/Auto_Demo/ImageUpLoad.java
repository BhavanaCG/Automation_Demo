package Auto_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImageUpLoad {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\automation\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
		
		
		WebElement FullName = driver.findElement(By.id("username"));
	    FullName.sendKeys("Bhaagya");
	    
	    WebElement Email = driver.findElement(By.id("email"));
	    Email .sendKeys("bhaag@gmail.com");
	    
	    WebElement Telephone = driver.findElement(By.id("tel"));
	    Telephone.sendKeys("7744998833");
	    
	    WebElement UPloadProfile = driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/input"));
	    UPloadProfile .sendKeys("D:\\Advaith.M\\Drawings\\DSC03334.jpg");
	    try
	    {Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	   
	    Select Gender = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div[7]/select")));
	    Gender.selectByIndex(1);
	    
	    WebElement YearsOfExperience = driver.findElement(By.xpath("//*[@id=\"container\"]/div[8]/input[3]"));
	    YearsOfExperience.click();
	    
	    WebElement Skills = driver.findElement(By.id("ip"));
	    Skills.click();
	    WebElement AutomationTool = driver.findElement(By.xpath("//*[@id=\"tools\"]/option[1]"));
	    AutomationTool.click();
	    WebElement AutomationTool2 = driver.findElement(By.xpath("//*[@id=\"tools\"]/option[3]"));
	    AutomationTool2 .click();
	    WebElement Submitt = driver.findElement(By.id("submit"));
	    Submitt.click()	;	
	}
	    

}
