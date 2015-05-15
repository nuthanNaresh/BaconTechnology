package runTestcases;

import java.io.IOException;

import org.junit.Assert;


import atu.testrecorder.exceptions.ATUTestRecorderException;

import smart.BaseClass;
import smart.NewLocationsPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefsNewLocation {
	BaseClass action = new BaseClass();
	NewLocationsPage newLocationPage=new NewLocationsPage();

	@Before
	public void initialize() throws IOException {
		action.initialize();
	}

	@Given("^User is on Smart Focus site$")
	public void user_is_on_Smart_Focus_site() throws Throwable {
		action.lanchBrowser();
	}

	@Given("^User clicks on 'New'$")
	public void user_clicks_on_New() throws Throwable {
		newLocationPage.clickOnNewButton();

	}

	@When("^User clicks on 'Location'$")
	public void user_clicks_on_Location() throws Throwable {
		newLocationPage.clickOnLocation();

	}

	@Then("^New location form should appear$")
	public void new_location_form_should_appear() throws Throwable {
		newLocationPage.waitForFormAppear();

	}

	@Then("^User fills \"(.*?)\" (\\d+) \"(.*?)\" \"(.*?)\" (\\d+) (\\d+)$")
	public void user_fills(String name, int major, String description, String postcode,
			int radius, int catchment) throws Throwable {
		newLocationPage.fillNewLocationForm(name,major,description,postcode,radius,catchment);

	}

	@When("^User clicks on Create$")
	public void user_clicks_on_Create() throws Throwable {
		newLocationPage.clickOnCreate();

	}

	@Then("^New location should be created$")
	public void new_location_should_be_created() throws Throwable {
		newLocationPage.verifyNewLocationIsCreated();

	}

	@Then("^Screen navigates to the new location$")
	public void screen_navigates_to_the_new_location() throws Throwable {
		Assert.assertEquals(newLocationPage.expectedLocation, newLocationPage.actualLocation);

	}
	
	@After
	public void closeBrowser() throws ATUTestRecorderException{
		action.closeBrowser();
	}

}
