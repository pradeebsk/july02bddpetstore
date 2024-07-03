package global.petstore;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassPet {
	public static WebDriver driver;
	public static JavascriptExecutor js = (JavascriptExecutor) driver;
	public static Alert alert;
	public void getDriver(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("invalid browser");
			break;
		}
	}

	public void getUrl(String url) {
		driver.get(url);
	}

	public void windowsMax() {
		driver.manage().window().maximize();
	}

	public void refreshWindows() {
		driver.navigate().refresh();
	}

	public void sendText(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void scroll(WebElement element, String up_down) {
		js = (JavascriptExecutor) driver;
		switch (up_down) {
		case "scrollUp":
			js.executeScript("arguments[0].scrollIntoView(false)", element);
			break;
		case "scrollDown":
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			break;
		default:
			System.err.println("invalid type");
			break;
		}
	}
	public void textSendByJs(WebElement element, String keysToSend) {
		js.executeScript("arguments[0].setAttribute('value','" + keysToSend + "')", element);
	}

	public void screenCapture(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Target = new File("C:\\Users\\Admin\\Pictures\\screenshots\\" + name + "adact.png");
		FileUtils.copyFile(source, Target);

	}

	public void frameSwitch(WebElement element) {
		driver.switchTo().frame(element);

	}

	public void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public void getalert(String alerttype) {
		alert = driver.switchTo().alert(); 
		switch(alerttype) {
		case "accept":
			alert.accept();
		break;
		case "dismiss":
			alert.dismiss();
		break;
		case "sendtext":
			alert.sendKeys("");
		break;
		case "gettext":
			alert.getText();
		break;
		default:
			System.out.println("invalid alertType");
		break;
		}
	}

	public void switchingWindows(int index) {
		Set<String> allWindowsId = driver.getWindowHandles();
		List<String> list = new LinkedList<String>();
		list.addAll(allWindowsId);
		String childWindowsId = list.get(index);
		driver.switchTo().window(childWindowsId);

	}

	public String getWindowsId(int index) {
		Set<String> allWindowsId = driver.getWindowHandles();
		List<String> list = new LinkedList<String>();
		list.addAll(allWindowsId);
		String childWindowsId = list.get(index);
		return childWindowsId;

	}

	public void switchToWindows(String childWindowsId) {
		driver.switchTo().window(childWindowsId);
	}

}
