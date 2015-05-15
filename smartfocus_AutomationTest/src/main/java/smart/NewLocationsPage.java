package smart;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewLocationsPage extends BaseClass {
	public String expectedLocation;
	public String actualLocation;

	public void clickOnNewButton() throws IOException {
		getObject(ObjectRepository.getProperty("clickOnNewButton"), null)
				.click();

	}

	public void clickOnLocation() throws IOException {
		getObject(ObjectRepository.getProperty("clickOnLocation"), null)
				.click();

	}

	public void waitForFormAppear() throws IOException {
		getObject(ObjectRepository.getProperty("enterName"), null)
				.isDisplayed();

	}

	public String fillNewLocationForm(String name, int major, String description,
			String postcode, int radius, int catchment) throws IOException {
		String majoR = Integer.toString(major);
		String radiuS = Integer.toString(radius);
		String catchmenT = Integer.toString(catchment);
		getObject(ObjectRepository.getProperty("enterName"), null).sendKeys(
				name);
		getObject(ObjectRepository.getProperty("enterMajor"), null).sendKeys(
				majoR);
		getObject(ObjectRepository.getProperty("enterDescription"), null)
				.sendKeys(description);
		
		/*
		 * PostCode Drop down functionality 
		 *
		 */
		
		WebElement postCodeDropDown = getObject(
				ObjectRepository.getProperty("enterPostCode"), null);
		postCodeDropDown.sendKeys(postcode);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement dropDownValue = wait.until(ExpectedConditions.elementToBeClickable(getObject(ObjectRepository.getProperty("selectAddress"), null)));
		dropDownValue.click();
		/*postCodeDropDown.sendKeys(Keys.DOWN);
		System.out.println(Keys.ENTER);*/
		
		WebElement latitude=getObject(ObjectRepository.getProperty("getLatitudeValue"), null);
		
		if(latitude.getAttribute("value").isEmpty())
			System.out.println("Latitude is Empty");
		else
			System.out.println(latitude.getAttribute("value"));
		
		
		WebElement Longitude=getObject(ObjectRepository.getProperty("getLongitudeValue"), null);
		if(Longitude.getAttribute("value").isEmpty())
			System.out.println("Longitude is Empty");
		else
			System.out.println(Longitude.getAttribute("value"));
		
		
		getObject(ObjectRepository.getProperty("enterRadius"), null).sendKeys(
				radiuS);
		getObject(ObjectRepository.getProperty("enterCatchment"), null)
				.sendKeys(catchmenT);
	    expectedLocation=name;
		return expectedLocation;

	}

	public void clickOnCreate() throws IOException {
		getObject(ObjectRepository.getProperty("clickOnCreateButton"), null).click();

	}

	public String verifyNewLocationIsCreated() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement verifyLocation = wait.until(ExpectedConditions.elementToBeClickable(getObject(ObjectRepository.getProperty("verifyLocationTitle"),null)));
		actualLocation=verifyLocation.getText();
		System.out.println(verifyLocation.getText());
		return actualLocation;
		
		
	}

}
