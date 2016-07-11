package innRoad.suite;

import java.io.FileOutputStream;

import org.browsermob.core.har.Har;
import org.browsermob.proxy.ProxyServer;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Mobcapture {
	
	public static void main(String[] args) throws Exception {

String strFilePath = "U:\\InnRoad_DataDriven_FrameWork\\harPerformance.har";

// start the proxy
ProxyServer server = new ProxyServer(4444);
server.start();
//captures the moouse movements and navigations
server.setCaptureHeaders(true);
server.setCaptureContent(true);

// get the Selenium proxy object
Proxy proxy = server.seleniumProxy();

// configure it as a desired capability
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(CapabilityType.PROXY, proxy);



// start the browser up
//WebDriver driver = new FirefoxDriver(capabilities);

System.setProperty("webdriver.chrome.driver","U:\\eclipse\\InnRoad_DataDrivenFramework\\Lists Formats\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver(capabilities);	

// create a new HAR with the label "apple.com"
server.newHar("assertselenium.com");

// open yahoo.com
driver.get("http://assertselenium.com");

driver.get("http://assertselenium.com/2012/10/30/transformation-from-manual-tester-to-a-selenium-webdriver-automation-specialist/");

// get the HAR data
Har har = server.getHar();
FileOutputStream fos = new FileOutputStream(strFilePath);
har.writeTo(fos);
server.stop();
driver.quit();

}



}
