package Auto_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Auto_Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\automation\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		FirstName.sendKeys("Aathira");
		
		WebElement LastName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		LastName.sendKeys("Sithaara");
		
		WebElement Address = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		Address.sendKeys("Flatno5,Aathira_Appartments");
		
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		Email.sendKeys("a23@gmail.com");
		
		WebElement Phone = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		Phone .sendKeys("9988776633");
		
		WebElement Gender = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]"));
		Gender .click();
	    
		WebElement Hobbies = driver.findElement(By.id("checkbox2"));
		Hobbies.click();
	
		
         // Languages
		  /*Select droplanguge =new Select(driver.findElement(By.id("msdd")));
		  droplanguge.selectByIndex(4);*/
	
		
	    //SKILLS FIELD
		driver.findElement(By.xpath("//*[@id=\"Skills\"]")).click();
	    Select dropskill =new Select(driver.findElement(By.id("Skills")));
		dropskill.selectByIndex(3);
		
	    //country
		  /*Select dropcountry =new Select(driver.findElement(By.id("")));
		dropcountry.selectByIndex(1);*/
		
	   //selectcountry
	     /* Select dropcountry =new Select(driver.findElement(By.xpath("/html/body/span/span/span[1]/input")));
		dropcountry.selectByValue("Japan");*/
	
	    //DATE OF BIRTH      
		Select dropdate =new Select(driver.findElement(By.id("daybox")));
	    dropdate.selectByIndex(3);
		Select dropmonth =new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		dropmonth.selectByIndex(3);
		Select dropyear =new Select(driver.findElement(By.id("yearbox")));
		dropyear.selectByIndex(3);
		      
		WebElement Password = driver.findElement(By.id("firstpassword"));
		Password .sendKeys("aathira");
		      
		WebElement ConfirmPassword = driver.findElement(By.id("secondpassword"));
		ConfirmPassword .sendKeys("aathira");
		    
		WebElement Submittbutton = driver.findElement(By.id("submitbtn"));
		Submittbutton .click();
		
		
		
		
		
		
		
		
		
		

	}

}
