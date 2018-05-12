import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class Workout {

	public static void main(String[] args) {

		
		System.out.println("Installing a selenium evironment...");
		
		
		/* Opening a IE explorer
		 * zoom level 100%(write a program to do this)
		 * protected mode turned off and level to least positions(write a program to do this)
		 * security setting - allow active content
		 * 32 or 64 driver
		 */

		//System.setProperty("webdriver.ie.driver", "D:\\Selenium_Pack_Apr18\\IEDriverServer.exe");
		//System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, "D:\\Selenium_Pack_Apr18\\IEDriverServer.exe");
		//InternetExplorerDriver ie = new InternetExplorerDriver();
		//ie.get("http://facebook.com");
		//ie.quit();// closes exe.. browser.. selenium session
		//ie.close();
				
		/* Opening a Firefox browser
		 *  	
		 */
			
		System.setProperty("webdriver.gecko.driver", "D:\\Common\\drivers\\geckodriver.exe");
		FirefoxDriver mozilla = new FirefoxDriver();
		mozilla.get("http://facebook.com");
		mozilla.quit();
	}

}
