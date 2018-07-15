mport org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;

import lib.listeners.WebDriverListener;

public class WebDriverServiceImpl extends WebDriverListener implements WebDriverService{

	public WebElement locateElement(String locator, String locValue) {
		
		switch (locator) {
		case "id": return driver.findElement(By.id(locValue));
		
		case "name": return driver.findElement(By.name(locValue));
		
		case "class": return driver.findElement(By.className(locValue));
		
		case "link" : return driver.findElement(By.linkText(locValue));
		
		case "xpath": return driver.findElement(By.xpath(locValue));
		
		default:
			break;
		}
		return null;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			reportSteps("The Data "+data+" is Entered Successfully", "pass");
		} catch (Exception e) {
			reportSteps("The Data "+data+" is not Entered Successfully", "fail");
		}		
	}

	public void click(WebElement ele) {
		ele.click();		
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
	}

	public boolean verifyExactTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyPartialTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			if (expectedText.equals(ele.getText()))
				System.out.println("The text using exact match is "+ele.getText());
			else
				System.out.println("The input provided is not exact");
			
		} catch (NoSuchFrameException e) {
			System.err.println("The element "+ele+" is not available to verify the title with exact match value "+expectedText);
		}
	}
		
	

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		boolean exact=ele.getAttribute(attribute).equals(value);
		if (exact==true) {
			System.out.println("Value entered is true");
			
		}
			
		
		
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeActiveBrowser() {
		driver.close();
		
	}

	public void closeAllBrowser() {
		// TODO Auto-generated method stub
		
	}
	
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
	}

}
