package Auto_Demo;


import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dateandTime {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\automation\\chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//CURRENT DATE AND TIME
	
	Calendar calendar = Calendar.getInstance();
	Date currentDateTime = calendar.getTime();
	System.out.println(currentDateTime);
	driver.close();
	
	//FUTURE DATE AND TIME
	
	/*Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DAY_OF_YEAR,10);
	Date futureDateTime = calendar.getTime();
	System.out.println(futureDateTime);
	driver.close();*/
	
	//PAST DATE AND TIME
	
	/*Calendar calendar = Calendar.getInstance();
	calendar.add(calendar.DAY_OF_YEAR,-10);
	Date pastDateTime = calendar.getTime();
	System.out.println(pastDateTime);
	driver.close();*/

	}

}
