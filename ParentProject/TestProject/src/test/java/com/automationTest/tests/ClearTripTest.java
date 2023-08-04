package com.automationTest.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationTest.operations.SearchFlight;
import com.framework.dataProvider.DataSet;
import com.framework.dataProvider.GenericDataProvider;
import com.framework.operation.TestOperationFactory;
import com.framework.test.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


public class ClearTripTest extends BaseTest {

	@Test(dataProvider= "TEST", dataProviderClass= GenericDataProvider.class)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: To validate Search Flight functionality.")
	@DataSet("SearchFlight")
	public void verifyFlightSerach(String fromLoc, String ToLoc, String Date) throws Exception {
		
		SearchFlight searchFlight= TestOperationFactory.getOperation(SearchFlight.class);
		searchFlight.SearchFlightOptions(fromLoc, ToLoc,Date);
		Assert.assertTrue(searchFlight.isSearchResultDisplayed());
			
	}

}
