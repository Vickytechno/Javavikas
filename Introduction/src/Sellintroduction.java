import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sellintroduction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver(options);
		//driver.get("https://www.wikipedia.org/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		int number = 20;
		System.out.println("count is:" +number);
		
		String S = ("TIGER IS NATIONAL ANIMAL");
		System.out.println(S);
		
		int [] Age = {21,22,23,24,25};
		System.out.println(Age[3]);
		
		String [] name = new String[5];
		name[0] = "NITIN";
		name[1] = "PAWAN";
		name[2] = "VIKRANT";
		name[3] = "VIRAT";
		name[4] = "AVNEESH";
		
		for(int j=0; j<=name.length; j++)
		{
			System.out.println(name[j]);
		}
		
		
	}

}
