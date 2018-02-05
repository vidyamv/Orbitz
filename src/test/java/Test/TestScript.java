package Test;
import org.testng.annotations.Test;

import pages.BasePage1;
import pages.FlightPage1;
import src.main.java.BaseTest;

public class TestScript extends BaseTest {
	
	@Test
	public void testFlightbooking()
	{
		String atitle="ORBITZ.com – Best Travel Deals";
		
		FlightPage1 fp=new FlightPage1();
		BasePage1 bp=new BasePage1();
		bp.verifyTitle(atitle);
		fp.flighttabOnclick();
		fp.flightsrc("pnq");
		fp.flightdest("blr");
		fp.departing();
		fp.departcalenderclick();
		fp.returning();
		fp.returncalenderclick();
		fp.search();
	}

}
